package one.digitalinnovation.collection

fun main(){
    val valueArray = doubleArrayOf(500.0,900.0,450.0,100.0)

    for (valores in valueArray){
        println(valores)
    }

    println("---------------")
    println("max ${valueArray.maxOrNull()}")
    println("min ${valueArray.minOrNull()}")
    println("media ${valueArray.average()}")

    println("<><><><><><><><><>")

    val valoresFiltrados = valueArray.filter { it > 500.0 }
    println("----------")

    valoresFiltrados.forEach{
        println(it)
    }

    println("------------")
    println(valueArray.count{it in 100.0..500.0})


    println("-----------------")
    println(valueArray.find { it == 500.0 })

    println("---------------")
    println(valueArray.any { it == 450.0 })

}