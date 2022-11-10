import java.util.Arrays

fun main (){

    println("** Arrays **")

    /*arrays servem pra criar listas na noss aplicação exemplo se tiver 10 20 ou 30 itens eu mesmo defin*/

//    Arroz
//    Feijão
//    Batata
//    Uva
//    Banana
//    Carne
//    Leite
//    Ovos
                                       // Indice //0
    /*dentro dos parenteses do array é possivel definir varios tipos de valores ex. String, Int, diferente do java
    * que tem q criar pra cada tipo de valor.*/
    var listaCompras = arrayOf("Arroz","Feijão","Batata","Uva","Banana","Carne","Leite","Ovos","Frango",100,2.55)

            //dentro dos [] fica os valores de index. os valores de indice//
            // para 1 iten basta apenas colocar o indice ex. (listaCompras[0]) vai exibir o arroz.//
            //para printar toda a lista chama=-se o metodo Array ex. (Arrays.toString(listaCompras)
    println(Arrays.toString(listaCompras))
    println(listaCompras.size)

}