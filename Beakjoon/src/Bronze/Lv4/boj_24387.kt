package Bronze.Lv4

fun main() { // ИЗЛОЖЕНИЕ НА ПЧЕЛЕН МЕД
    val price = readln().split(" ").map { it.toLong() }.toLongArray()
    val bottle = readln().split(" ").map { it.toLong() }.toLongArray()

    price.sortDescending()
    bottle.sortDescending()

    val zipped = price.toList().zip(bottle.toList())
    var result = 0L

    for((a, b) in zipped) {
        result += a * b
    }

    print("$result\n")
}