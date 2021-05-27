//fun main(args: Array<String>){
//
//    val Hex1 = """0[a-zA-Z].*""".toRegex()
//    val Hex2 = """[a-zA-Z].*""".toRegex()
//
//    var valor = true
//    while(valor) {
//
//        val s = readLine()!!.toString()
//
//        if (!s.contains(Hex1) && s.toInt() > 0)  {
//
//            val n = s.toInt()
//
//            val decimal = Integer.toHexString(n).toUpperCase()
//            val decCompleto = "0x$decimal"
//            println(decCompleto)
//
//        }
//        if(s == "-1"){
//
//            valor = false
//        }
//
//        if (s.contains(Hex1) && s.contains(Hex2)) {
//
//            val remover = s.removeRange(0,2)
//            val resultado: Int = remover.toInt(16)
//            println(resultado)
//
//        }
//    }
//}