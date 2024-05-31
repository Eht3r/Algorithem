package Bronze.Lv4

fun main() {
    val N = readln().toInt()
    val inputs = readln().split(" ").map { it.toInt() }.sorted()

    print((inputs[0] + inputs[1]).toString() + "\n")
}