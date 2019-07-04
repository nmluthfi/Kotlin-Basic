package aquarium5

data class Fish(var name: String)

fun main(args: Array<String>) {

    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    print(numbers.divisibleBy {
        it.rem(3)
    })

    fishExample()
}

fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()

    for (item in this) {
        if (block(item) == 0) {
            result.add(item)
        }
    }

    return result
}

fun fishExample() {
    val fish = Fish("Splasy")

    with(fish.name) {
        this.capitalize()
    }

    myWith((fish.name)) {
        this.capitalize()
    }

    println(fish.run { name })
    println(fish.apply { name })

    val fish2 = Fish("splasy").apply { name = "Sharky" }
    println(fish2.name)

    println(fish2.let { it.name.capitalize() }
        .let { it + "fish" }
        .let { it.length }
        .let { it + 31 }
    )

    fish.name.capitalize()
}

inline fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}