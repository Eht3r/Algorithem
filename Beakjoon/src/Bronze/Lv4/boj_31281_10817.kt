package Bronze.Lv4

fun main() { // ЗЛАТНАТА СРЕДА, 세 수
    val inputs = readln().split(" ").map { it.toLong() }.toTypedArray()

    inputs.sort()

    print(inputs[1].toString() + "\n")
}