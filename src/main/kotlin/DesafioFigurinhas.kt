fun main(args: Array<String>) {

    val lista = mutableListOf<Int>()

    for (i in 1..readLine()!!.toInt()) {
        val input = readLine()!!.split(" ").map { it.toInt() }

        input.forEach {numero ->
            lista.add(numero)
        }
        println(mdc(lista[0],lista[1]))
        lista.clear()
    }
}

// máximo divisor comum (chamada recursiva)
fun mdc(q1: Int, q2: Int): Int {
    return if (q2 == 0) {
        q1
    } else {
        mdc(q2, (q1 % q2))
    }
}