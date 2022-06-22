package one.digitalinnovation.collection

fun main(){
    val nomes = Array<String>(size = 5){""}
    nomes[0] = "maria"
    nomes[1] = "carlos"
    nomes[2] = "ana"
    nomes[3] = "alan"
    nomes[4] = "luiz"

    for (nome in nomes){
        println(nome)
    }

    println("-----------")
    nomes.sort()
    nomes.forEach {
        println(it)
    }

    val nomes2 = arrayOf("maria","carlos","ana","alan","luiz")
    println("-----------")
    nomes2.forEach {
        println(it)
    }
}