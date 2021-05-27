
import java.util.Scanner

fun main() {
//    val t = Scanner(System.`in`)
//    val T:Int = t.nextInt()

    for (i in 1..readLine()!!.toInt()) {
        val raios = readLine()!!.split(" ").map {
            it.toInt()
        }
        val R1 = raios[0]
        val R2 = raios[1]
        println(R1 + R2)
    }
}

//fun main() {
//    val t = Scanner(System.`in`)
//    val numeroTestes:Int = t.nextInt()
//
//    for (i in 1..numeroTestes) {
//        val raios=Scanner(System.`in`)
//        val r1=raios.nextInt()
//        val r2=raios.nextInt()
//        val resultado= r1+r2
//        println(resultado)
//    }
//}

//fun main() {
//    for (i in 1..readLine()!!.toInt()) {
//        val canos = readLine()!!.split(" ").map {
//            it.toInt()
//        }
//
//        val r1 = canos[0]
//        val r2 = canos[1]
//
//        println(r1 + r2)
//    }
//}


