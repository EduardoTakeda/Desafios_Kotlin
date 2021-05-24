fun main(args: Array<String>) {

    val N = readLine()!!.toInt()
    for (i in 1..N) {

        //escreva sua solução aqui
        var NLN = readLine()!!.split("")
        var letra= NLN[2]
        var N1= NLN[3].toInt()
        var N2= NLN[1].toInt()

        if (N1==N2){
            println(N1*N2)
        }else {
            if (letra.contains(letra.toUpperCase())) {
                println(N1 - N2)
            } else println(N1 + N2)
        }
    }
}