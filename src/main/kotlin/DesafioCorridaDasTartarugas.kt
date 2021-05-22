import java.io.EOFException

fun main(args: Array<String>) {

    while (true) {

        try {

            val l = readLine()!!.toInt()
            val v = readLine()!!.split(" ").run { map { it.toInt() } }
            var lista = v.toTypedArray()
            lista.sort()
            when (lista.last()) {
                in 0..9 -> println(1)
                in 10..19 -> println(2)
                else -> {
                    println(3)
                }
            }

        } catch (f : Exception) {
            break
        } catch (n : Exception) {
            break
        } catch (e : Exception) {
            break
        }
    }
}