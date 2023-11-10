//aula 4 - slide 44
//fun main() {
//    val valores = arrayOf(10, 20, 30, 50)
//    for (i in valores) {
//        if (i == 20) {
//            println("O vetor contém o buscado!")
//            break
//        }
//    }
//}
//
//fun main() {
//   val valores = arrayOf(10, 20, 30, 50)
//   if (20 in valores)
//        println("O vetor contém o buscado!")
//
//}
// fim slide 44

fun main() {
    val valores = arrayOf(10, 20, 30, 50) // Cria uma matriz (array) de números chamada 'valores' com quatro elementos

    for (i in valores) { // Inicia um loop 'for' para percorrer os elementos da matriz 'valores'
        if (i == 30) { // Verifica se o elemento atual 'i' é igual a 1
            println("O vetor contém o buscado!") // Se 'i' for igual a 1, imprime a mensagem "O vetor contém o buscado!" e sai do loop com 'break'
            break
        }
    }
}


fun main() {
    val valores = arrayOf(10, 20, 30, 50) // Cria uma matriz (array) de números chamada 'valores' com quatro elementos

    if (30 in valores) // Verifica se o valor 20 está contido na matriz 'valores'
        println("O vetor contém o buscado!") // Se 20 estiver na matriz, imprime a mensagem "O vetor contém o buscado!"
}

