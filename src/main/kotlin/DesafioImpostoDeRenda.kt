fun main(args: Array<String>) {
    //continue a solução
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    val r = readLine()!!.toFloat()
    var i = 0F

    if (r > 4500) {
        i =(r-4500)*28/100+350
    } else if (r>3000) {
        i =(r-3000)*18/100+80
    } else if (r>2000  ) {
        i =(r-2000)*8/100
    } //else if (r > 4500) {
    //  i = (  )
    //}
    if (i == 0F) println("Isento") else println("R$ ${i.format(2)}")


}