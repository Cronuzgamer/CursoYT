fun main () {

    println("Estruturas Condicionais")

//    if /*se*/ (true){
//          /*(condição dentro dos parenteses)*//* na condição do if so executa se a condição for verdadeira senão vai pro else*/
//        println("Verdadeiro")
//
//    }else /*senão*/{
//        println("Falso")
//             /*(condição)*/

//    var idade = 18
//    if(idade >=18){
//        println("O usuario é maior de idade")
//    }else{
//        println("O usuario é menor de idade")
//    }

    println("Sempre usar else if quando tiver mais de 2 condições e na ultima condição usar else sem o if")
    var idade = 18
    if (idade <= 10) {
        println("Criança")
    } else if (idade <= 17) {
        println("Adolescente")
    } else if (idade <=80) {
        println("Adulto")
    }else {
        println("Idoso")
    }
}



