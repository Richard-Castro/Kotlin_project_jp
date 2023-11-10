//fun main() {
//    // Cria três objetos da classe Pessoa com diferentes atributos
//    val p1 = Pessoas("Maria", 60f, 1.70f)
//    val p2 = Pessoas("Joaquim", 70f, 1.75f)
//    val p3 = Pessoas("Marcos", 80f, 1.80f)
//
//    // Imprime os objetos
//    println(p1)
//    println(p2)
//    // Força a conversão para String quando imprime
//    println(p3.toString())
//}
//
//// Declaração da classe Pessoa com um método toString()
//class Pessoas(var nome: String, var peso: Float, var altura: Float) {
//    // Sobrescreve a função toString()
//    override fun toString(): String {
//        return "$nome, $peso, $altura"
//    }
//}

fun main() {
    // Cria três objetos da classe Individuo com diferentes atributos.
    val i1 = Humano("Joana", 58f, 1.65f)
    val i2 = Humano("Maria", 90f, 1.80f)
    val i3 = Humano("Atos", 65f, 1.70f)

    // Imprime as informações dos objetos Individuo.
    println(i1)
    println(i2)
    println(i3.toString()) // Força a conversão para String quando imprime
}

// Classe Individuo com propriedades e um método toString().
class Individuo(var nome: String, var peso: Float, var altura: Float) {
    override fun toString(): String {
        return "Nome: $nome, Peso: $peso kg, Altura: $altura m"
    }
}