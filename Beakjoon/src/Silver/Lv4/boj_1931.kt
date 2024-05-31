package Silver.Lv4

data class meeting(var start: Int, var end: Int)

fun main(args: Array<String>) {  // 회의실 배정
    val N = readln().toInt()
    var arr = Array<meeting?>(N) { null }

    for (i in 0 until N) {
        val input = readln().split(" ").map { it.toInt() }
        val people = meeting(input[0], input[1])

        arr[i] = people
    }

    arr.sortWith(compareBy({ it!!.end }, { it!!.start }))
    var end = 0
    var count = 0


    arr.forEach {
        if (end <= it!!.start) {
            end = it.end
            count++
        }
    }

    println(count)
}