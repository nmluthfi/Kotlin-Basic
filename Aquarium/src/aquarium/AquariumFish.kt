package aquarium

abstract class AquariumFish {
    abstract val color: String
}

class Shark : AquariumFish(), FishAction{
    override fun eat() {
        println("Shark  is eating")
    }

    override val color: String
        get() = "gray"
}

class Plecostomus : AquariumFish(), FishAction {
    override fun eat() {
        println("Plecostomus is eating")
    }

    override val color: String
        get() = "gold"
}

interface FishAction {
    fun eat()
}
