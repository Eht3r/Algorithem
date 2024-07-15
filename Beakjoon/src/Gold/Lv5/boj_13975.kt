package Gold.Lv5

import java.util.*

fun main(): Unit = with(System.`in`.bufferedReader()) {
    val T = readLine().toInt()

    val pq = PriorityQueue<Long>()
    val answer = StringBuilder()

    for(i in 1..T){
        pq.clear()

        val K = readLine().toInt()

        val files = readLine().split(' ').map{it.toLong()}
        pq.addAll(files)

        var cost = 0L
        while(pq.size > 1){
            val min1 = pq.poll()
            val min2 = pq.poll()

            pq.offer(min1 + min2)
            cost += min1 + min2
        }

        answer.append("$cost\n")
    }
    print(answer.toString().trim())
}