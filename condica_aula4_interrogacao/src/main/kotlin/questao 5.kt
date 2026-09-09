fun main () {
    var valorTotal: Double = 501.0

    if (valorTotal > 500.0) {
        valorTotal = valorTotal * (20.0 / 100)
        println("Valor total: $valorTotal. O percentual de desconto foi de 20%")
    } else {
        if (valorTotal in 200.0..500.0) {
            valorTotal = valorTotal * (10.0 / 100)
            println("Valor total: $valorTotal. O percentual de desconto foi de 10%")
        } else {
            println("O valor total é $valorTotal")
        }
    }
}