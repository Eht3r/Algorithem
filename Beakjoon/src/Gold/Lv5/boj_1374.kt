package Gold.Lv5

import java.util.*


data class lecture(
    var index: Int,
    var start: Int,
    var end: Int
)

fun main() { // 강의실
    val N = readln().toInt()
    val arr = Array<lecture?>(N) { null }

    for (i in 0 until N) {
        val inputs = readln().split(" ").map { it.toInt() }
        arr[i] = lecture(inputs[0], inputs[1], inputs[2])
    }

    arr.sortWith(compareBy({ it!!.start }, { it!!.end }))

    val pq = PriorityQueue<Int>()
    for (i in 0 until N) {
        if (pq.isEmpty()) pq.add(arr[i]!!.end)
        else {
            val end_time = pq.peek()
            if (arr[i]!!.start < end_time) pq.add(arr[i]!!.end)
            else {
                pq.poll()
                pq.add(arr[i]!!.end)
            }
        }
    }

    println(pq.size)
}