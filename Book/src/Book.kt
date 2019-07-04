import kotlin.random.Random

class Book(val title: String, val author: String, val year: Int) {

    fun getTitleAndAuthor(): Pair<String, String> {
        return (title to author)
    }

    var pages = 500

    fun getTitlteAuthorAndYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    object Constant {
        const val BASE_URL = "audible.amazon.com"
    }

    fun canBorrow(hasBook: Int): Boolean {
        return when {
            hasBook < MAX_BORROWED_BOOK-> true
            else -> false
        }
    }

    companion object {
        const val MAX_BORROWED_BOOK = 26
    }

    fun printUrl() {
        println(Constant.BASE_URL + "'\'" + title + ".html")
    }
}

fun main(args: Array<String>) {
//    val book = Book("Harry potter", "JK Rowling", 1999)
//    val (title, author, year) = book.getTitlteAuthorAndYear()
//    println("Here is your book $title written by $author in $year")

    //    var allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")
//    var library = mapOf("Shakesheer" to allBooks)
//    println(library.any{ it.value.contains("Hamlet") })
//    var moreBooks = mutableMapOf("Harry Potter" to "JK ROWLING")
//    moreBooks.getOrPut("Jungle Book") { "Kipling" }
//    moreBooks.getOrPut("Hamlet") { "Shakespare"}
//    println(moreBooks)
    var puppy = Puppy()
    var book= Book("a", "A", 1999)

    while (book.pages > 0) {
        puppy.playWithBook(book)

    }

}

fun Book.weight(weight: Double) : Double { return weight * 1.5f}
fun Book.tornPages(torn: Int) = if (pages >= torn) pages -= torn else pages = 0

class Puppy {
    fun playWithBook(book: Book) = book.tornPages(Random().nextInt(12))
}

