//aula 4 - slide 38
//fun main() {
//    val nota = 4
//
//    var resultado = when {
//        nota >= 6 -> "Aprovado"
//        nota < 4 -> "reprovado"
//        else -> "Recuperação"
//    }
//    println( resultado)
//}
//
//fun main() {
//    val nota = 4F
//
//    var resultado = when (nota) {
//        in 6f..10f -> "Aprovado"
//        in 4f..6f -> "Recuperação"
//        in 0f..4f -> "Reprovado"
//        else -> "Invalida"
//    }
//    println( resultado)
//}
//
//fun main() {
//    val estado = "RS"
//
//    var resultado = when (estado){
//        "AC","AM","RR","AP","PA","RO","TO" -> "Norte"
//        "SP","MG","ES","RJ" -> "Sudeste"
//        else -> "Outra"
//    }
//    println( resultado)
//}
//fim slide 38

fun main() {
    val nota = 5 // Define uma variável chamada 'nota' e atribui o valor 5 a ela

    var resultado = when {
        nota >= 7 -> "Aprovado"
        nota < 5 -> "Reprovado"
        else -> "Recuperação"
    }
    println(resultado) // Usa a estrutura 'when' para determinar a situação com base no valor da 'nota' e, em seguida, imprime o resultado.
}


fun main() {
    val nota = 5F // Define uma variável chamada 'nota' e atribui o valor 5.0 a ela (observe o tipo Float)

    var resultado = when (nota) {
        in 6f..10f -> "Aprovado"
        in 5f..6f -> "Recuperação"
        in 0f..5f -> "Reprovado"
        else -> "Invalida"
    }
    println(resultado) // Usa a estrutura 'when' com intervalos para determinar a situação com base na 'nota' e imprime o resultado.
}


fun main() {
    val estado = "MS" // Define uma variável chamada 'estado' e atribui o valor "MS" a ela

    var resultado = when (estado) {
        "AC", "AM", "RR", "AP", "PA", "RO", "TO" -> "Norte"
        "MS", "MT", "GO" -> "Centro-Oeste"
        "SP", "MG", "ES", "RJ" -> "Sudeste"
        else -> "Outra"
    }
    println(resultado) // Usa a estrutura 'when' com casos específicos para determinar a região com base no 'estado' e imprime o resultado.
}
