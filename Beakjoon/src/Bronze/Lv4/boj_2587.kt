package Bronze.Lv4

fun main() {
    val arr = MutableList(5){0}
    var avg = 0

    for (i in arr.indices) {
        arr[i] = readln().toInt()
        avg += arr[i];
    }

    print((avg / 5).toString() + "\n")
    print(arr[2].toString() + "\n")
}