fun main () {
    var pontuacao: Int = 67

    when (pontuacao) {
        in 0..30 -> println("Perfil Conservador")
        in 31..70 -> println("Perfil Moderado")
        in 71..100 -> println("Perfil Arrojado")
        else -> println("Pontuação inválida")
    }
}