package one.digitalinnovation.collection

fun main(){

    val value : Pair<String,Double> = Pair("jose",1000.0)
    val valueMap = mapOf(value)

    valueMap.forEach{ (x, y) -> println("chave: $x valor: $y")  }

    val valueMap2 = mapOf(
        "Pedro" to 2000.0,
        "maria" to 3500.0
    )
    valueMap2.forEach { (x, y) -> println("X: $x y: $y") }
}

