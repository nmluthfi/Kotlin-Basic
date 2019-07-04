package aquarium

fun main(args: Array<String>) {
    val symptons: MutableList<String> = mutableListOf(
        "white spots",
        "red spots",
        "not eating",
        "bloated",
        "belly up"
    )
    println(symptons.reversed())
    println(symptons.subList(4, symptons.size))
}