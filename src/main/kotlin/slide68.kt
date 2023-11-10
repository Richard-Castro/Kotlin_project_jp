//fun main() {
//    // Declara uma variável 'a' com o tipo 'Any', que pode ser qualquer tipo de objeto.
//    var a: Any = '1'
//
//    // Utiliza a expressão 'when' para verificar o tipo de 'a' e atribuir uma mensagem a 'resultado'.
//    var resultado = when (a) {
//        is String -> "$a é um texto"      // Verifica se 'a' é uma String.
//        is Int -> "$a é um número inteiro" // Verifica se 'a' é um Int.
//        else -> "não sei"                 // Caso 'a' não seja nem String nem Int.
//    }
//
//    // Printa o valor da variavel resultado.
//    println(resultado)
//
//    println(a::class.simpleName) // Mostra o tipo da variável 'a'.
//}

fun main() {
    // Declara uma variável 'c' com o tipo 'Any' inicializada com um valor true.
    var valor: Any = true

    // Utiliza a expressão 'when' para verificar o tipo de 'c' e atribuir uma mensagem a 'resultado'.
    var resultado = when (valor) {
        is String -> "O valor '$valor' é uma String."
        is Int -> "O valor '$valor' é um número inteiro."
        is Boolean -> "O valor '$valor' é um valor booleano (${if (valor) "verdadeiro" else "falso"})."
        is Double -> "O valor '$valor' é um double."
        is Char -> "O valor '$valor' é um caractere."
        else -> "O tipo de 'valor' é desconhecido."
    }

    // Imprime o valor de 'resultado'.
    println(resultado)

    // Imprime o tipo da variável 'c'.
    println("O tipo de 'valor' é ${valor::class.simpleName}.")
}