package aquarium.generics

fun main(args: Array<String>) {
    genericExample()
}

open class WaterSupply(var needsProcessed: Boolean)

class TapWater : WaterSupply(true) {

    fun addChemicalCleaners() {
        needsProcessed = false
    }

}

class FishStoreWater : WaterSupply(false) {

}

class LakeWater : WaterSupply(true) {

    fun filter() {
        needsProcessed = false
    }
}

class Aquarium<out T : WaterSupply>(val waterSupply: T) {

    fun addWater(cleaner: Cleaner<T>) {
        if(waterSupply.needsProcessed) {
            cleaner.clean(waterSupply)
        }

        println("adding water from water supply")
    }

}

inline fun <reified R: WaterSupply> Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R


fun addItemTo() = println("item added")

interface Cleaner<in T : WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner : Cleaner<TapWater> {

    override fun clean(waterSupply: TapWater) {
        waterSupply.addChemicalCleaners()
    }

}

fun <T: WaterSupply>isWaterClean(aquarium: Aquarium<T>) {
    println("aquarium water is clean: ${aquarium.waterSupply.needsProcessed}")
}

inline fun <reified R: WaterSupply> WaterSupply.isOfType() = this is R


fun genericExample() {
    val cleaner = TapWaterCleaner()
    val aquarium = Aquarium(TapWater())
    aquarium.addWater(cleaner)
    isWaterClean(aquarium)
    aquarium.hasWaterSupplyOfType<TapWater>() // return true
    aquarium.waterSupply.isOfType<LakeWater>() // return false

//    val aquarium = Aquarium(TapWater())
//    aquarium.waterSupply.addChemicalCleaners()
//
//    val aquarium4 = Aquarium(LakeWater())
//    aquarium4.waterSupply.filter()
//    aquarium4.addWater()

//    val aquarium2 = Aquarium("String")
//    println(aquarium2.waterSupply)
//
//    val aquarium3 = Aquarium(null)
//    println(aquarium2.waterSupply)
}
