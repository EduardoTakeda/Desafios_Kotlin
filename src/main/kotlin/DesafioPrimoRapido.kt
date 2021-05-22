fun main(args: Array<String>) {
    //continue a solução
    val n = readLine()?.toInt()

    for (i in 1..n!!) {
        var primo = true

        val a = readLine () !!. toDouble()
        var raiz = Math.sqrt(a)

        for (b in 2..(raiz).toInt()){
            if ((a % b.toDouble()) == 0.0){
                primo = false
                break
            }
        }
        if (a==1.0) primo = false
        if (primo) println("Prime")
        else println("Not Prime")
    }
}