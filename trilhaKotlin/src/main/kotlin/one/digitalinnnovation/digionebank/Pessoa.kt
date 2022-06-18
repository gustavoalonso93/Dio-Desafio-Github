package one.digitalinnnovation.digionebank

class Pessoa {
    var name:String = "Gustavo"
    var cpf:String = "123.123.123-11"
    private set

    constructor()

    fun pessoaInfo() = "$name e $cpf"
}

fun main(){
    val Gustavo = Pessoa()
    println(Gustavo.pessoaInfo())

}