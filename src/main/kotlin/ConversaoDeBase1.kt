fun main(args: Array<String>) {

    var s : String
    var n : Int
    val r = """0x.*""".toRegex()

    while(true) {

//escreva sua solução aqui

        val s = readLine().toString()
        val value = s.toInt()
        if (value == -1) { break }
        if (s.contains(r)) {
            val hex = s.subSequence(2, s.length).toString()
            val n = Integer.parseInt(hex, 16)
            print("$n\n")
           // println("é um hexa")
        } else {
            n = s.toInt()
            val hexadecimal = Integer.toHexString(n).toUpperCase()
            println(hexadecimal)
        }

        //if (s=="-1"){c= false}
    }}

