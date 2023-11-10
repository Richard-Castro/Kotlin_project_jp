//aula 4 - slide 41
//fun  main(){
//    var i = 0
//    while (i < 10) {
//        print("$i,")
//        i++
//    }
//}
//
//fun  main(){
//    var i = 0
//    while (i < 10) {
//        print("${i++},")
//    }
//}
//
//fun  main(){
//    var i = 0
//    do
//        print("${++i}, ")
//    while (i < 10)
//}
//fim slide 41

fun main() {
    var x = 0 // Inicializa a variável 'x' com o valor 0
    while (x < 5) { // Inicia um loop 'while' que continua enquanto 'x' for menor que 5
        print("$x,") // Imprime o valor de 'x' seguido por uma vírgula
        x++ // Incrementa o valor de 'x' em 1
    }
}

fun main() {
    var x = 0 // Inicializa a variável 'x' com o valor 0
    while (x < 5) { // Inicia um loop 'while' que continua enquanto 'x' for menor que 5
        print("${x++},") // Imprime o valor atual de 'x' seguido por uma vírgula e, em seguida, incrementa 'x' em 1
    }
}

fun main() {
    var x = 0 // Inicializa a variável 'x' com o valor 0
    do  // Inicia um loop 'do-while'
        print("${++x}, ") // Incrementa 'x' em 1, imprime o valor atual de 'x' seguido por uma vírgula e espaço
    while (x < 5) // Continua executando o loop enquanto 'x' for menor que 5
}

