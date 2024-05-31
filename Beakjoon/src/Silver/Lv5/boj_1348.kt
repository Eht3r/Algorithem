package Silver.Lv5

fun main() { // 메시지
    var N = readln().toInt()
    var group = 1;

    while (N != 0) {
        var check = false;
        var name = arrayOfNulls<String>(N)
        var message = Array<Array<String>>(N) { Array<String>(N - 1) { "" } }

        print("Group $group \n")
        for (i in 0 until N) {
            val inputs = readln().split(" ");

            name[i] = inputs[0]
            message[i] = inputs.slice(1 until (N)).toTypedArray()
        }

        for (i in 0 until N) {
            var idx = i;
            for (j in 0 until (N - 1)) {
                idx--;

                if (idx < 0) idx += N;

                if (message[i][j].equals("N")) {
                    print(name[idx].toString() + " was nasty about "+ name[i].toString() + "\n")
                    check = true;
                }
            }
        }

        if (!check) print("Nobody was nasty\n")

        N = readln().toInt()
        group++;
        println()
    }
}