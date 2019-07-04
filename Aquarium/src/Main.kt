import aquarium.Aquarium
import aquarium.FishAction
import aquarium.Plecostomus
import aquarium.Shark

fun main(args: Array<String>) {
    buildAquarium()
    makeFish()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    println("Lenght: ${myAquarium.length} " +
            "\nWidth: ${myAquarium.width} " +
            "\nHeigh: ${myAquarium.height}")

    myAquarium.height = 80
    println("Height: ${myAquarium.height}")

    println("Volume: ${myAquarium.volume}")

    val smallAquarium = Aquarium(20, 15, 30)
    println("Small aquarium volume: ${smallAquarium.volume}")

    val myAquarium2 = Aquarium(numberOfFish = 9)
    println("Small Aquarium2: ${myAquarium2.volume} liters with " +
            "length: ${myAquarium2.length} " +
            "width: ${myAquarium2.width} " +
            "height: ${myAquarium2.height}")
}

fun feedMake(fish: FishAction) {
    fish.eat()
}

fun makeFish() {
    val shark = Shark()
    val plecostomus = Plecostomus()
    println("Shark ${shark.color} \nPlecostomus: ${plecostomus.color}")

    shark.eat()
    plecostomus.eat()
}
