fun main(args: Array<String>) {
    //insira as variaveis corretamente
    var r = 1
    for (i in 1..readLine()!!.toInt()) {

        println("$i ${i  *i   } ${  i*i  *i  }")

        r += 1
    }
}