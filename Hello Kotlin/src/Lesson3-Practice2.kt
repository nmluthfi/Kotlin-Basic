fun main(args: Array<String>) {
    val currentHourInString = args[0]
    val currentHour = currentHourInString.toInt()
    when {
        currentHour < 12 -> println("Good morning")
        else -> println("Goodnight")
    }

    // Cara 2
//    if (args[0].toInt() < 12) println("Good morning, Kotlin")
//    else println("Good night, Kotlin" )

    // Cara 3
//    println("${if (args[0].toInt() < 12) "Good morning, Kotlin" else "Good night, Kotlin"}")
}