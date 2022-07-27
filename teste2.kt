fun main(){

    print("digite o numero que voce quer elevar: ")
    var num = readLine()!!.toDouble()
    var num2 = num
    print("elevar por: ")
    val tempo = readLine()!!.toInt()
    var t = 0
    var tnegativo = 0
    var nn:Double = 1.0
    println("resultado: ")

    if(tempo < 0){

        while(tnegativo > tempo){

            var resn = nn/num
            nn = resn
            tnegativo--

        }
    println(nn)
    }
    else {
        when (tempo) {

            1 -> {
                println(num)
            }
            0 -> {
                println("1")
            }
            else -> {

                val corre = tempo - 1
                while (t < corre) {

                    var res = num * num2
                    num2 = res
                    t++

                }
                println(num2)
            }

        }

    }

}