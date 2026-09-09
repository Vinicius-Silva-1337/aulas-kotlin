fun main() {
    // Dobro de um Número
        val num = 15

        var mult = num * 2

        println("O dobro de  $num é $mult")

    //Media de nota
        //notas
            var nota : Int = 4
            var nota2 : Int = 5
            var nota3 : Int = 6

            var media = (nota + nota2 + nota3) / 3

            println("O dobro das notas av1: $nota, av2: $media e av3: $nota2 é $media ")

        //controle de estoque
            var produtosNoEstoque = 50
            var produtosVendidos = 12
            var produtosNovos = 5

            var estoqueFinal= produtosNoEstoque - produtosVendidos + produtosNovos
            println("O estoque tinha $produtosNoEstoque, foram vendido $produtosVendidos e chegaram $produtosNovos. O numero de produtos no estoque final é de $estoqueFinal")

        //conversor de moedas
            val dolarHoje: Double = 5.16
            val reais: Double = 150.0

            var valorConvertido: Double = reais/dolarHoje

            println("O valor na carteira é de R$$reais e o valor do dolar hoje é de $dolarHoje. Logo o valor convertido é de R$$valorConvertido")

        //area do retangulo
            var base: Double = 10.5
            var altura: Double = 12.55

            var area: Double = (base*altura)/2

            println("A base do triangulo mede $base cm e a altura mede $altura cm. Logo a area é de $area cm")

        //Resto da divisao
            var segundosTotais: Double = 130.0
            val minutos = segundosTotais/60
            val segundosRestantes = segundosTotais % 60

            println("$segundosTotais segundos equivalem a $minutos minutos e $segundosRestantes segundos")

        //calculo de desconto em produto
            var precoProduto: Float = 200.0F
            var desconto: Double = 15.0

            var produtoDescontado: Double = (precoProduto*desconto)/100
            println("O valor do produto é de R$$precoProduto e o desconto é de $desconto. Logo após o desconto o produto vale $produtoDescontado")

        //operações combinadas e precedencia
            var calculo1 = (10 + 5 ) * 2
            var calculo2 = 10 + 5  * 2

            println(calculo1)
            println(calculo2)

        //idade futura
            var idadeAtual = 19
            var idadeFutura = idadeAtual + 10

            println("Minha idade atual: $idadeAtual minha idade futra daqui à 10 anos é de $idadeFutura")

        //perimetro de um circulo
            val pi: Double  = 3.14159
            val raio: Double = 4.0

            var perimetro: Double = (pi*2) * raio
            println("O valor de pi é de $pi e o raio: $raio. Logo o perimetro é de $perimetro")
}