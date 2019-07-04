package aquarium.building

open class BaseBuildingMaterial() {
    open val numberNeeded = 1
}

class Wood : BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick : BaseBuildingMaterial() {
    override val numberNeeded = 8
}

class Building<out T: BaseBuildingMaterial>(val baseBuildingMaterial: T) {

    var baseMaterialNeeded = 100
    var actualBaseMaterialNeeded = baseBuildingMaterial.numberNeeded * baseMaterialNeeded

    fun build() {
        println("$actualBaseMaterialNeeded ${baseBuildingMaterial::class.simpleName} required")
    }
}

fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building <T>) {
    if (building.actualBaseMaterialNeeded < 500) {
        println("Small Bulding")
    } else {
        println("Large building")
    }
}

fun main(args: Array<String>) {
    Building(Brick()).build()
    isSmallBuilding(Building(Brick()))
}
