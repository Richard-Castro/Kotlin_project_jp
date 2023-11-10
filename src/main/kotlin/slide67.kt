//fun main() {
//    // Declara uma string com o valor string "1".
//    val a = "1"
//
//    // Concatenação da string "1" com o número 1, resultando em "11".
//    println(a + 1)
//
//    // Converte a string "1" para um inteiro e adiciona 1, resultando em 2.
//    println(a.toInt() + 1)
//
//    // Converte a string "1" para um float e adiciona 1, resultando em 2.0.
//    println(a.toFloat() + 1)
//
//    // Converte a string "1" para um double, adiciona 1 e então converte o resultado para string, resultando em "2.0".
//    println((a.toDouble() + 1).toString())
//
//    println((a.toDouble() + 1).toString() + 1)
//}

fun main() {
    val b = "2" // Declara uma string com o valor "2".

    println(b + 2) // Concatena a string "2" com o número 2, resultando em "22".

    println(b.toInt() + 2) // Converte a string "2" para um inteiro e adiciona 2, resultando em 4.

    println(b.toFloat() + 2) // Converte a string "2" para um float e adiciona 2, resultando em 4.0.

    println((b.toDouble() + 2).toString()) // Converte a string "2" para um double, adiciona 2 e converte para string, resultando em "4.0".

    println((b.toDouble() + 2).toString() + 2) // Converte "2" para double, adiciona 2, converte para string e concatena com "2", resultando em "4.02".
}