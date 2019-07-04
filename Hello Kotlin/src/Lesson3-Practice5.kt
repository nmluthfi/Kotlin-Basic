fun main(args: Array<String>) {
    whatShouldIDoToday("happy", "sunny")
    whatShouldIDoToday("sad")
    print("How do you fell? ")
    println(whatShouldIDoToday(mood = readLine()!!))
}
fun whatShouldIDoToday(mood: String, weather: String = "sunny", temprature: Int = 24): String {
    return when {
        isSad(mood) && isRainy(weather) && isCold(temprature) -> "stay in bed"
        isVeryHot(temprature) -> "go swimming"
        isHappySunny(mood, weather) -> "go for a walk"
        else -> "Stay home and read."
    }
}

fun isSad(mood: String) = mood == "sad"
fun isRainy(weather: String) = weather  == "rainy"
fun isCold(temprature: Int) = temprature == 0
fun isVeryHot (temperature: Int) = temperature > 35
fun isHappySunny (mood: String, weather: String) = mood == "happy" && weather == "sunny"



