package br.com.richard.aula.kotlin

open class Colaborador(var salario: Float, nome: String, peso: Float, altura: Float){
    val ativo = true // Colaborador está ativo por padrão.
    val bonus get() = salario > 0 // Método para verificar se há bônus.
}