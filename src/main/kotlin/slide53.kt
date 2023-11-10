//fun main() {
//    val p1 = Pessoa("Maria", 60f, 1.70f) // Instância Pessoa.
//    val p2 = br.com.richard.aula.kotlin.Colaborador(20000f, "Joaquim", 70f, 1.75f) // Instância br.com.richard.aula.kotlin.Colaborador.
//    val p3 = br.com.richard.aula.kotlin.Cliente(1500f, "Marcos", 80f, 1.80f) // Instância br.com.richard.aula.kotlin.Cliente.
//
//    // Imprime o IMC de cada pessoa.
//    println("${p1.nome} tem IMC = ${p1.imc()}")
//    // Para o colaborador, verifica se está ativo.
//    println("${p2.nome} tem IMC = ${p2.imc()} e ${if (p2.ativo) "está ativo" else "foi despedido"}")
//    // Para o cliente, mostra a renda.
//    println("${p3.nome} tem IMC = ${p3.imc()} e renda = ${p3.renda}")
//}
//
//// Classe Pessoa com propriedades e método para calcular o IMC.
//open class Pessoa(val nome: String, val peso: Float, val altura: Float) {
//    fun imc() = peso / (altura * altura) // Calcula o IMC.
//}
//
//// Classe br.com.richard.aula.kotlin.Cliente herda de Pessoa
//class br.com.richard.aula.kotlin.Cliente(var renda: Float, nome: String, peso: Float, altura: Float): Pessoa(nome, peso, altura) {
//    fun aprovacao() = renda > 1000 // Método para aprovação financeira.
//}
//
//// Classe br.com.richard.aula.kotlin.Colaborador herda de Pessoa e adiciona salário e status ativo.
//class br.com.richard.aula.kotlin.Colaborador(var salario: Float, nome: String, peso: Float, altura: Float): Pessoa(nome, peso, altura) {
//    val ativo = true // br.com.richard.aula.kotlin.Colaborador está ativo por padrão.
//    fun bonus() = salario > 0 // Método para verificar se há bônus.
//}

fun main() {
    val p1 = Pessoa("Lúcia", 55f, 1.65f) // Instância Pessoa.
    val p2 = Funcionario(2500f, "Rafael", 80f, 1.80f) // Instância Funcionário.
    val p3 = Estudante("História", "Gabriela", 50f, 1.60f) // Instância Estudante.

    // Imprime o IMC de cada pessoa.
    println("${p1.nome} tem IMC = ${p1.imc()}")
    // Para o funcionário, verifica se recebe bônus.
    println("${p2.nome} tem IMC = ${p2.imc()} e ${if (p2.bonus()) "recebe bônus" else "não recebe bônus"}")
    // Para o estudante, mostra o curso.
    println("${p3.nome} está cursando ${p3.curso} e tem IMC = ${p3.imc()}")
}

// Classe Pessoa com método para calcular o IMC.
open class Pessoa(val nome: String, val peso: Float, val altura: Float) {
    fun imc() = peso / (altura * altura) // Método de IMC.
}

// Classe Funcionário herda de Pessoa e adiciona salário.
class Funcionario(var salario: Float, nome: String, peso: Float, altura: Float): Pessoa(nome, peso, altura) {
    fun bonus() = salario > 3000 // Método para bônus.
}

// Classe Estudante herda de Pessoa e adiciona curso.
class Estudante(var curso: String, nome: String, peso: Float, altura: Float): Pessoa(nome, peso, altura)


class Funcionario(salario: Float, @NotNull nome: String?, peso: Float, altura: Float) :
    Pessoa() {
    var salario: Float

    fun bonus(): Boolean {
        return salario > 3000f
    }

    init {
        Intrinsics.checkNotNullParameter(nome, "nome")
        super(nome, peso, altura)
        this.salario = salario
    }
}
