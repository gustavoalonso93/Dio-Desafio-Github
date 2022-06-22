package one.digitalinnovation.collection

fun main(){
   val salarios = DoubleArray(4)
   salarios[0] = 1000.0
   salarios[1] = 2000.0
   salarios[2] = 3000.0
   salarios[3] = 4000.0


   salarios.forEach {
      println(it)
   }

   salarios.forEachIndexed{index, salario ->
      salarios[index] = salario * 1.1

   }
   salarios.forEach {println(it)
   }

   val salarios2 = doubleArrayOf(1000.0,2000.0,5000.0,1500.0)
   salarios2.sort()
   salarios2.forEach { println(it) }
}