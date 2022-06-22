package one.digitalinnovation.collection

fun main(){
    val values = IntArray(size = 5)

    values[0] = 1
    values[1] = 2
    values[2] = 3
    values[3] = 4
    values[4] = 5

    for (valor in values){
        println(valor)
    }

    values.forEach {valor ->
        println(valor)
    }

    for (index in values.indices){
        println(values[index]+10)
    }

    for (index in values.indices){
        println(values[index]+10)
    }
}