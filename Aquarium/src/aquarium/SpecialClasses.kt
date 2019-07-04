package aquarium

object MobyDickWhale {

    val author = "Herman Melville"

    fun jump() {

    }
}

enum class Color(val rgb: Int) {
    RED(0XFF0000),
    WHITE(0XFFFFFF)
}

sealed class Seal
class SeaLion : Seal()
class Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when (seal) {
        is Walrus -> "walrus"
        is SeaLion -> " sea lion"
        else -> "not a seal"
    }
}