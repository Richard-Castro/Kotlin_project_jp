//Aula 4 - slide 39
//fun main() {
//    var estados = arrayOf("SP","MG","RJ","RS")
//    print(estados[0])
//}
//
//fun main() {
//    var lista = ArrayList<String>()
//    lista.add("RS")
//    lista.add("MG")
//    lista.add("SP")
//    lista.add("RJ")
//    println(lista[0])
//}
//
//fun main() {
//    var valores = arrayOf(10,20,30,50)
//    println(valores[0])
//}
//fim slide 39

fun main() {
    var tipoEstados = arrayOf("SP", "MG", "RJ", "RS") // Cria uma matriz (array) de strings chamada 'tipoEstados' com quatro elementos
    print(tipoEstados[1]) // Imprime o primeiro elemento da matriz 'tipoEstados', que é "MG"
}


fun main() {
    var listaEstado = ArrayList<String>() // Cria uma lista (ArrayList) de strings chamada 'listaEstado'
    listaEstado.add("RS") // Adiciona o elemento "RS" à lista
    listaEstado.add("MG") // Adiciona o elemento "MG" à lista
    listaEstado.add("SP") // Adiciona o elemento "SP" à lista
    listaEstado.add("RJ") // Adiciona o elemento "RJ" à lista
    println(listaEstado[2]) // Imprime o primeiro elemento da lista 'listaEstado', que é "SP"
}

fun main() {
    var valor = arrayOf(15, 22, 25, 40) // Cria uma matriz (array) de inteiros chamada 'valor' com quatro elementos
    println(valor[0]) // Imprime o primeiro elemento da matriz 'valor', que é 15
}
