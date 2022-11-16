    fun main (){

        println(" Estrutura de repetição When /Quando")

        var opcao= 1

        //Estrutura condicional codigo mais limpo//
        when(opcao){
            1 -> println("Suco de Laranja")
            2 -> println("Suco de Uva")
            3 -> println("Suco de Morango")
            else -> println("Nenhuma opção foi selecionada")
        }

        var mensagem = when (opcao){
            1 -> "Suco de Laranja"
            2 -> "Suco de Uva"
            3 -> "Suco de Morango"
            else ->"Opção incorreta"
        }
        println(mensagem)
    }