fun main () {
    var rendaMensal: Double = 10000.0
    var possuiNomeSujo: Boolean = false
    var tempoEmpregoMeses: Int = 3

    if (possuiNomeSujo) {
        println("Cpf negado: Restrição no CPF")
    } else{
        if(rendaMensal >= 3000.0 && tempoEmpregoMeses >= 6) {
            println("Emprestimo aprovado")
        } else {
            if (rendaMensal >= 3000.0 && tempoEmpregoMeses < 6) {
                println("Emprestimo em analise")
            } else {
                println("Credito Negado: Renda insuficiente")
            }
        }
    }



}