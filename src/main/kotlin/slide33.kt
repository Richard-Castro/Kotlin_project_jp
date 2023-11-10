//aula 4 - slide 33
//fun main() {
//    val myText = "Hello"
//    val newText1 = myText + " " + myText
//    val newText2 = "$myText $myText"
//
//    println(myText)
//    println(newText2)
//    println(newText2)
//}
//fim slide 33

fun main() {
    val myText = "Maria" // Define uma variável chamada myText e atribui o valor "Maria" a ela
    val myText1 = "Clara" // Define uma variável chamada myText1 e atribui o valor "Clara" a ela
    val newText2 = myText + " " + myText1 // Cria uma nova variável newText2 que contém a concatenação das strings myText e myText1 dando um espaço entre elas
    val newText3 = "$myText $myText1" // Cria uma nova variável newText3 que usa uma interpolação de strings para unir myText e myText1

    println(myText) // Imprime o conteúdo da variável myText =  "Maria"
    println(newText2) // Imprime o conteúdo da variável newText2 = "Maria Clara"
    println(newText3) // Imprime o conteúdo da variável newText3 = "Maria Clara"
}
