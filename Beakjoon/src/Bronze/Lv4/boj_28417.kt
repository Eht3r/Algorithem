package Bronze.Lv4

fun main() {
    val N = readln().toInt()
    val result = MutableList(N){0}

    for (i in 0 until N) {
        val input = readln().split(" ").map { it.toInt() }

        result[i] += input[0].coerceAtLeast(input[1])
        val arr = input.slice(2..input.lastIndex).sortedDescending()

        result[i] += arr[0] + arr[1]
    }

    print(result.maxOfOrNull { it })
}