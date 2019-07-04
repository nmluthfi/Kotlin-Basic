package spices

fun main(args: Array<String>) {

}

sealed class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
    abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String,
            color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness, color), Grinder {

    override fun grind() {
        println(color)
    }

    override fun prepareSpice() {
        grind()
    }

}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.BLUE
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
}
