//fun main() {
//    // Cria instâncias da classe Pessoa com atributos.
//    val p1 = Pessoa("Maria", 60f, 1.70f)
//    val p2 = Pessoa("Joaquim", 70f, 1.75f)
//    val p3 = Pessoa("Marcos", 80f, 1.80f)
//
//    // Printa o nome de cada objeto Pessoa.
//    println(p1.nome)  // Saída: Maria
//    println(p2.nome)  // Saída: Joaquim
//    println(p3.nome)  // Saída: Marcos
//}
//
//// Define a classe Pessoa com 3 parâmetros.
//class Pessoa(var nome: String, var peso: Float, var altura: Float)

fun main() {
    val p1 = Humano("Lúcia", 55f, 1.65f) // Instância de Humano.
    val p2 = Operario(2500f, "Rafael", 80f, 1.80f) // Instância de Operario.
    val p3 = Estagiario("História", "Gabriela", 50f, 1.60f) // Instância de Estagiario.

    // Imprime o IMC de cada humano.
    println("${p1.nome} tem IMC = ${p1.imc()}")
    // Para o operario, verifica se recebe bônus.
    println("${p2.nome} tem IMC = ${p2.imc()} e ${if (p2.bonus()) "recebe bônus" else "não recebe bônus"}")
    // Para o estagiario, mostra o curso.
    println("${p3.nome} está cursando ${p3.curso} e tem IMC = ${p3.imc()}")
}

// Classe Humano com método para calcular o IMC.
open class Humano(val nome: String, val peso: Float, val altura: Float) {
    fun imc() = peso / (altura * altura) // Método de IMC.
}

// Classe Operario herda de Pessoa e adiciona salário.
class Operario(var salario: Float, nome: String, peso: Float, altura: Float): Pessoa(nome, peso, altura) {
    fun bonus() = salario > 3000 // Método para bônus.
}

// Classe Estagiario herda de Pessoa e adiciona curso.
class Estagiario(var curso: String, nome: String, peso: Float, altura: Float): Pessoa(nome, peso, altura)