package aquarium

class MyIntList{
    fun get(pos: Int): Int {return 0}
    fun addItem(item: Int) {}
}

class MyShortList{
    fun get(pos: Int): Short {return 0}
    fun addItem(item: Short) {}
}

class MyList<T> {
    fun get(pos: Int): T {
        TODO()
    }
    fun addItem(item: T) {

    }
}

fun workWithMy() {

    val intList: MyList<Int>
    val fishList: MyList<Fish>
}