fun main(args: Array<String>) {
    //continue a solução
    val n = readLine()!!.toInt()

    //testar com valor 500000003

    for (i in 0 until n) {
        var tempoInicial = System.currentTimeMillis()
        var numero = readLine()!!.toInt()
        if(verificaPodeSerPrimo(numero)){
            println("Prime ")
        } else {
            println("Not Prime ")
        }
        var tempoFinal= System.currentTimeMillis()
        println("o metodo executou em " + (tempoFinal - tempoInicial) + " milisegundos")
    }

}

fun verificaPodeSerPrimo(numero: Int): Boolean{
    return when {
        numero == 2 -> true
        numero == 3 -> true
        numero == 5 -> true
        numero < 2 -> false
        numero%2 == 0 -> false
        numero%3 == 0 -> false
        numero%4 == 0 -> false
        numero.toString().last() == '0' -> false
        numero.toString().last() == '5' -> false
        else ->  podeSerPrimo(numero)
    }
}

fun podeSerPrimo(numero: Int): Boolean{
    var divisor = 3.0
    while(divisor < numero){
        if(numero % divisor == 0.0) {
            return false
        } else {
            divisor += 2.0
        }
    }
    return true
}