import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")
    feedTheFish()
    print(canAddFish(8.0, listOf(2, 2, 2), hasDecorations = false))
//    eagerExample()
}

//fun eagerExample() {
//    val decorations = listOf("rock", "pagonda", "plastic plant", "alligator", "flowerpot")
//
//    val eager = decorations.filter { it[0] == 'p' }
//    println(eager)
//
//    // applyu filter lazily
//    val filtered = decorations.asSequence().filter { it[0] == 'p' }
//    println(filtered.toList())
//
//    // apply map lazily
//    val lazyMap = decorations.asSequence().map { println("map $it") }
//    print(lazyMap)
//    println("first: ${lazyMap.toList()}")
//
//}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today, $day, fish will eat $food")
    shouldChangeWater(day, 20, 50)

    if (shouldChangeWater(day)) {
        print("Water changed")
    }

    dirtyProcessor()
}

fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "no eats!"
    }
}

fun randomDay(): String {
    val dayOfWeek = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return dayOfWeek[Random().nextInt(7)]
}

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {

    fun isTooHot(temperature: Int) = temperature > 30
    fun isDirty(dirty: Int) = dirty > 30
    fun isSunday(day: String) = day == "Sunday"

    return when {
        isTooHot(30) -> true
        isDirty(30) -> true
        isSunday("Sunday") -> true
        else -> false
    }
}

var dirty = 20

val waterFilter: (Int) -> Int = {dirty -> dirty / 2}
fun feedFish(dirty: Int) = dirty + 10

fun updateDirty(dirty: Int, operation : (Int) -> Int): Int {
    return operation(dirty)
}

fun dirtyProcessor() {
    dirty = updateDirty(dirty, waterFilter)
    dirty = updateDirty(dirty, ::feedFish)
    dirty = updateDirty(dirty, { dirty -> dirty + 50})

}