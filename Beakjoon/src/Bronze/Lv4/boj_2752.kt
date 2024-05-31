package Bronze.Lv4

fun main() { // 세수정렬
    val inputs = readln().split(" ").map { it.toInt() }.toTypedArray()

    inputs.sort()

    inputs.forEach {
        print("$it ")
    }
}