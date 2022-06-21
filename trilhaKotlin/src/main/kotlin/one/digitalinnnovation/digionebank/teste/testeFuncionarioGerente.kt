package one.digitalinnnovation.digionebank.teste



import one.digitalinnnovation.digionebank.Gerente


fun main(){

    val maria = Gerente(name = "Maria", cpf = "123.123.123-11", 5000.0, senha = "123123")

    imprimeRelatorioFuncionario.imprime(maria)

    testeAutenticacao().Autentica(maria)

}
