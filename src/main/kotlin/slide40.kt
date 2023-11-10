//Aula 4 - slide 40
//fun main() {
//    var lista = ArrayList<String>()
//    lista.add("RS")
//    lista.add("MG")
//    lista.add("SP")
//    lista.add("RJ")
//    println(lista[0])
//    lista.sort()
//    println(lista[0])
//    lista.sortDescending()
//    println(lista[0])
//}
//fim slide 40

fun main() {
    var listaEstado = ArrayList<String>() // Cria uma lista (ArrayList) de strings chamada 'listaEstado'
    listaEstado.add("RS") // Adiciona a string "RS" à lista
    listaEstado.add("MG") // Adiciona a string "MG" à lista
    listaEstado.add("SP") // Adiciona a string "SP" à lista
    listaEstado.add("RJ") // Adiciona a string "RJ" à lista
    println(listaEstado[2]) // Imprime o terceiro elemento da lista (índice 2), que é "SP"

    listaEstado.sort() // Classifica a lista em ordem crescente (alfabética, no caso de strings)
    println(listaEstado[2]) // Imprime novamente o terceiro elemento da lista, que agora é "SP" (ainda não foi atualizado pela classificação)

    listaEstado.sortDescending() // Classifica a lista em ordem decrescente (inversa)
    println(listaEstado[2]) // Imprime novamente o terceiro elemento da lista, que agora é "MG" (a classificação inversa atualizou o valor)
}
