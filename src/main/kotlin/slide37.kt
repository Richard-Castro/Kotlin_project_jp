//aula 4 - slide 37
//fun main() {
//    val nota = 4
//    println(if (nota >= 6)
//                "Aprovado"
//        else if (nota < 4)
//            "Reprovado"
//        else
//            "Recuoeração")
//}

//fun main() {
//    val nota = 4
//    println(if (nota >= 7) "Aprovado" else if (nota < 5) "Reprovado" else "Recuoeração")
//}
//fim slide 37

fun main() {
    val nota = 5 // Define uma variável chamada 'nota' e atribui o valor 5 a ela
    println(if (nota >= 7) // Inicia uma expressão condicional usando 'if' dentro da função 'println'
        "Aprovado" // Se 'nota' for maior ou igual a 7, a expressão retorna "Aprovado"
    else if (nota < 5) // Se 'nota' não for maior ou igual a 7, verifica se é menor que 5
        "Reprovado" // Se 'nota' for menor que 5, a expressão retorna "Reprovado"
    else // Se 'nota' não for nenhuma das anteriores, ou seja, entre 5 e 7 (inclusive), então
        "Recuperação" // A expressão retorna "Recuperação"
    )
}

fun main() {
    val nota = 4 // Define uma variável chamada 'nota' e atribui o valor 4 a ela
    println(if (nota >= 7) "Aprovado" else if (nota < 5) "Reprovado" else "Recuperação")
    // Usando uma única linha, o código avalia a nota e retorna uma das três strings, dependendo do valor da 'nota', e a imprime.
}
