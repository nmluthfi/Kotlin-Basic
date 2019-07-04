package aquarium

interface Runnable {
    fun run()
}

interface Cellable<T>{
    fun call(): T
}

fun example() {
    val runnable = object : Runnable {
        override fun run() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }
}