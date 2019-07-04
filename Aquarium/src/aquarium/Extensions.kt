package aquarium

fun String.hasSpaces() = find { it == ' ' } != null

fun extensionExample() {
    "Does it have spaceS?".hasSpaces()
}