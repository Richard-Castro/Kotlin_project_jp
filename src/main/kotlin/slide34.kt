//aula 4 - slide 34
//fun main() {
//    var a = 1 + 1
//    println(a)
//    println("result: "+a)
//    println("result: $a")
//    println("result: ${a}")
//    println("result: ${a+1}")
//}
//fim slide 34

fun main() {
    var ab = 5 + 1 // Define uma variável chamada 'ab' e atribui o resultado da expressão 5 + 1 a ela (que é 6)
    println(ab) // Imprime o valor da variável 'ab', que é 6
    println("result: " + ab) // Imprime a string "result: " concatenada com o valor da variável 'ab' (resultado: 6)
    println("result: $ab") // Usa interpolação de strings para incluir o valor da variável 'ab' na string (resultado: result: 6)
    println("result: ${ab}") // Usa interpolação de strings com chaves para incluir o valor da variável 'ab' na string (resultado: result: 6)
    println("result: ${ab + 4}") // Usa interpolação de strings para incluir a soma de 'ab' com 4 na string (resultado: result: 10)
}
