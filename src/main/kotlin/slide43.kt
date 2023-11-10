//aula 4 - slide 43
//fun main(){
//    var i = 0
//    while (true) {
//        if (i >= 10)
//        print("$i, ")
//        i += 1
//    }
//}
//
//fun main(){
//    var i = 0
//    while (i < 10) {
//        i++
//        if (i == 4)
//            break
//        print("$i, ")
//    }
//}
//
//fun main(){
//    var i = 0
//    while (i < 10) {
//        i++
//        if (i == 4)
//            continue
//        print("$i, ")
//    }
//}
//fim slide 43

fun main() {
    var i = 0 // Inicializa a variável 'i' com o valor 0
    while (true) { // Inicia um loop 'while' infinito (executa indefinidamente)
        if (i >= 20) // Verifica se 'i' é maior ou igual a 20
            print("$i, ") // Se 'i' for maior ou igual a 20, imprime o valor de 'i' seguido de uma vírgula e espaço
        i += 1 // Incrementa 'i' em 1 em cada iteração do loop
    }
}


fun main() {
    var i = 0 // Inicializa a variável 'i' com o valor 0
    while (i < 20) { // Inicia um loop 'while' que continua enquanto 'i' for menor que 20
        i++ // Incrementa 'i' em 1
        if (i == 10) // Verifica se 'i' é igual a 10
            break // Se 'i' for igual a 10, sai do loop
        print("$i, ") // Se 'i' não for igual a 10, imprime o valor de 'i' seguido de uma vírgula e espaço
    }
}


fun main() {
    var i = 0 // Inicializa a variável 'i' com o valor 0
    while (i < 20) { // Inicia um loop 'while' que continua enquanto 'i' for menor que 20
        i++ // Incrementa 'i' em 1
        if (i == 15) // Verifica se 'i' é igual a 15
            continue // Se 'i' for igual a 15, pula para a próxima iteração do loop sem executar o código abaixo
        print("$i, ") // Se 'i' não for igual a 15, imprime o valor de 'i' seguido de uma vírgula e espaço
    }
}
