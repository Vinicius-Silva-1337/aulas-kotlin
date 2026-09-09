fun main() {

    val tipoVeiculo: String = "CARRO"
    val horarioPico: Boolean = true


    var valorPedagio: Double

    when (tipoVeiculo) {
        "MOTO" -> {
            valorPedagio = 5.00
        }
        "CARRO" -> {
            valorPedagio = if (horarioPico) 14.00 else 10.00
        }
        "CAMINHAO" -> {
            valorPedagio = if (horarioPico) 28.00 else 20.00
        }
        else -> {
            valorPedagio = 0.00
            println("Erro: tipo de veículo não reconhecido!")
        }
    }

    println("Tipo de veículo: $tipoVeiculo")
    println("Horário de pico: ${if (horarioPico) "Sim" else "Não"}")
    println("Valor do pedágio: R$$valorPedagio")
}