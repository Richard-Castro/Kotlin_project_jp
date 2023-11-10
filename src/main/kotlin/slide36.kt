//aula 4 - slide 36
//fun main() {
//    val nota = 4
//    val resultado = if (nota >= 6)
//        "Aprovado"
//    else if (nota < 4)
//        "Reprovado"
//    else
//        "Recuperação"
//    println(resultado)
//}
//fim slide 36

fun main() {
    val nota = 5 // Define uma variável chamada 'nota' e atribui o valor 5 a ela
    val resultado = if (nota >= 7) // Inicia uma expressão condicional usando 'if'
        "Aprovado" // Se 'nota' for maior ou igual a 6, a variável 'resultado' recebe o valor "Aprovado"
    else if (nota < 4) // Se 'nota' não for maior ou igual a 7, verifica se é menor que 5
        "Reprovado" // Se 'nota' for menor que 5, a variável 'resultado' recebe o valor "Reprovado"
    else // Se 'nota' não for nenhuma das anteriores, ou seja, entre 5 e 7 (inclusive), então
        "Recuperação" // A variável 'resultado' recebe o valor "Recuperação"
    println(resultado) // Imprime o valor da variável 'resultado', que depende do valor da 'nota'
}
