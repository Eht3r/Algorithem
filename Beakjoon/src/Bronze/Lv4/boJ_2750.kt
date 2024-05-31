package Bronze.Lv4

fun main() {
    val N = readln().toInt()
    var arr = MutableList(N){0}

    for (i in arr.indices){
        arr[i] = readln().toInt()
    }

    arr.sort()

    arr.forEach { println(it) }
}