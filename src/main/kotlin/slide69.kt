//fun main() {
//    // Atribui a variavel de tipo any o valor 's'
//    var entrada: Any = "s"
//    // Inicializa uma variável para manter a soma dos números digitados.
//    var total = 0f
//
//    do {
//        // Solicita ao usuário que digite um número inteiro ou 's' para sair.
//        print("Digite um número inteiro ou 's' para sair: ")
//        try {
//            // Lê a entrada do usuário.
//            entrada = readLine()!!
//            // Verifica se a entrada é igual a 's'.
//            if (entrada == "s")
//                break // Sai do loop se o usuário digitar 's'.
//            // Soma o número inteiro convertido à variável total.
//            total += entrada.toInt()
//        } catch (e: NumberFormatException) {
//            // Captura erros de formatação de número e solicita nova entrada.
//            println("Número inválido, tente novamente!")
//        } catch (e: Exception) {
//            // Captura qualquer outra exceção não prevista.
//            println("!!!Houve uma exceção!!!")
//        } finally {
//            // Bloco finally que executa após cada tentativa, imprime o total parcial.
//            println("total parcial: $total")
//        }
//    } while (entrada != "s") // Continua o loop até que 's' seja digitado.
//}

fun main() {
    var entrada: String  // Variável para armazenar a entrada do usuário.
    var soma = 0.0       // Soma dos números inseridos.
    var contador = 0     // Contador de quantos números foram inseridos.

    do {
        print("Digite um número ou 'fim' para terminar: ")
        entrada = readLine() ?: ""  // Lê a entrada do usuário e trata nulos.

        if (entrada.toLowerCase() == "fim") {
            break  // Sai do loop se o usuário digitar "fim".
        }

        try {
            soma += entrada.toDouble()  // Converte a entrada para Double e adiciona à soma.
            contador++  // Incrementa o contador.
        } catch (e: NumberFormatException) {
            // Informa o usuário sobre o erro de formatação.
            println("Entrada inválida, por favor digite um número ou 'fim'.")
        }
    } while (entrada.toLowerCase() != "fim")  // Continua o loop até que "fim" seja digitado.

    // Calcula a média dos números inseridos.
    val media = if (contador > 0) soma / contador else 0.0

    // Exibe a média e o total de números inseridos.
    println("Você digitou $contador números e a média é $media.")
}