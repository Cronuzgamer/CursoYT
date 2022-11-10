fun main (){

/*
    Tipos de Variaveis
    String - Textos
    String(" byte - Numeros Inteiros (-128 até 127)
    int - Numeros inteiros (-2147483648 até 2147483647 )
    long - Numeros Inteiros (-9223372036854775808 até 9223372036854775807)
    float - Numeros Decimais (1.1234567 até 7 casas decimais)
    double - Numeros Decimais (1.123456789 até 15 casa decimais)
    boolean - Valores Booleanos (Estados - True ou False)"
*/

    //Define o nome da Variavel
    // String nome = "Gabriel Moura"
    // Nao precisa definir o tipo o Kotlin reconhece pelo valor (texto,Numero)
    // val nomeCompleto = "Gabriel Cursino de Jesus Moura "
    // val idade: Byte = 28
    // Define tipo da variavel apos o nome da variavel exemplo var idade: String,Byte,In = valor mais é irrelevante
    // Byte é o unico tipo que precisa definir .

    val nome = "Gabriel é do tipo String (texto)"
    val idade = 31
    val numeroInteiro = 2147483647
    println(numeroInteiro)

    val numeroLong = 9223372036854775807
    println(numeroLong)

    val numeroFloat = 1.1234567
    println(numeroFloat)
    val dinheiro = 2.55f // f no final de Float
    println(dinheiro)

    val verdadeiro = true
    println(verdadeiro)

    val falso = false
    println(falso)




    println("O nome é $nome e a idade é $idade.")

}

