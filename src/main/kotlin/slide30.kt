//Aula 4 - slide 30
//fun main() {
//    val myText = "Hello"
//    println(myText)
//    println(myText[0])
//    println(myText[1])
//    println(myText.get(0))
//    println(myText.get(1))
//    println(myText.lowercase())
//    println(myText.uppercase())
//    println(myText.length)
//    println(myText.equals("hello"))
//    println(myText == "hello")
//    println(myText.startsWith (prefix = "H"))
//    println(myText.endsWith( suffix =  "H"))
//    println(myText.substring(0, 2))
//}

fun main() {
    val myText = "Jullie" // Define uma variável chamada myText e atribui o valor "Jullie" a ela
    println(myText) // Imprime o conteúdo da variável myText
    println(myText[0]) // Imprime o primeiro caractere da string myText
    println(myText[1]) // Imprime o segundo caractere da string myText
    println(myText.get(0)) // Usa o método get() para obter o primeiro caractere da string myText e imprime
    println(myText.get(1)) // Usa o método get() para obter o segundo caractere da string myText e imprime
    println(myText.lowercase()) // Converte a string myText para letras minúsculas e imprime
    println(myText.uppercase()) // Converte a string myText para letras maiúsculas e imprime
    println(myText.length) // Imprime o comprimento (número de caracteres) da string myText
    println(myText.equals("Ktl")) // Verifica se myText é igual a "Ktl" e imprime o resultado (deve ser falso)
    println(myText == "Ktl") // Compara myText com "Ktl" e imprime o resultado (deve ser falso)
    println(myText.startsWith(prefix = "J")) // Verifica se myText começa com o prefixo "J" e imprime o resultado (deve ser verdadeiro)
    println(myText.endsWith(suffix = "E")) // Verifica se myText termina com o sufixo "E" e imprime o resultado (deve ser verdadeiro)
    println(myText.substring(0, 2)) // Obtém uma substring de myText do índice 0 ao 2 (não incluindo o caractere no índice 2) e imprime Ju
}
