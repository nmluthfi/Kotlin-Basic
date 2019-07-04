package aquarium

import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.findAnnotation

@ImAPlant
class Plant {

    fun trim() {}
    fun fertilize() {

    }

    @get:OnGet
    val isGrowing: Boolean = true

    @set:OnSet
    var needFoods: Boolean = true
}

annotation class ImAPlant

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet

@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet

fun reflection() {

    val classObj = Plant::class
    for (method in classObj.declaredMemberFunctions) {
        println(method.name)
    }

    // print all annotations
    for (annotation in classObj.annotations) {
        println(annotation.annotationClass.simpleName)
    }

    // field on annotation or null
    val annonated = classObj.findAnnotation<ImAPlant>()
    annonated?.apply {
        println("Found a plant annotation!")
    }
}
