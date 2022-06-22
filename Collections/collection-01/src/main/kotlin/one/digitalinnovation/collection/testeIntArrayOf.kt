package one.digitalinnovation.collection

fun main(){
    val values = intArrayOf(2 ,4 ,3 ,7 , 9, 10)

    values.forEach {
        println(it)
    }

    println("-----------")
    values.sort()
    values.forEach {
        println(it)
    }
}