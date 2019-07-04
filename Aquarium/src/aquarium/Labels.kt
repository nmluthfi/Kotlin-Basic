package aquarium

fun labels() {

    loop@for (i in 1.. 100) {
        for (i in 1..100) {
            if (i> 10) {
                break@loop
            }
            print("$i")
        }
        println("")
    }

}

fun main(args: Array<String>) {
    labels()
}