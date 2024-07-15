package Silver.Lv4

fun main() {
    val N: Int = readln().toInt()
    val people = readln().split(" ").map { it.toInt() }.toTypedArray()
    var temp = 0
    var result = 0

    people.sort()

    for (i in 0 until N) {
        temp += people[i]
        result += temp
    }

    println(result)
}
