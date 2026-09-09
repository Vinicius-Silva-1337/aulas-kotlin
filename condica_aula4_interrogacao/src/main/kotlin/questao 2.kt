fun main () {
    var codigoStatus: Int = 4

    when (codigoStatus) {
        1 -> println("pedido recebido")
        2 -> println("Em processamento")
        3 -> println("Enviado para transporte")
        4 -> println("Entregue")
        else -> println("Status do pedido desconhecido")
    }
}