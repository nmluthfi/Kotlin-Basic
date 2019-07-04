package aquarium.decorations

fun main(args: Array<String>) {
    makeDecoration()
}

fun makeDecoration() {
    val decoration1 = Decorations("granite")
    println(decoration1)
    val (rock) = decoration1
    println(rock)
}

data class Decorations(val rocks: String)

