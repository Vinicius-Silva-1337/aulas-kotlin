fun main (){
    //exemplo: if e else
        var saldoEmConta = 150.0F
        var valorSaque = 100.0F

        println("valor do saldo na conta R$$saldoEmConta")
        println(valorSaque <= saldoEmConta) //print vai da false

        if (valorSaque <= saldoEmConta) {
                println("Saque de R$$valorSaque realizado")
                saldoEmConta= saldoEmConta - valorSaque
                println("R$$saldoEmConta atualizado")
        }       else {
                println("Saldo insuficiente")
        }

}