class Dado(var valor:Int){
    fun tirarDado(dados: Array<Dado>){
        for (i in (0..dados.size-1)){
            println("El dado se a tirado:")
        }
    }
    fun imprimirValores(dados: Array<Dado>){
        for (i in (0..dados.size-1)){
            var random = (0..4).random()
            println(dados[random].valor)
        }
    }
}

fun main(){
    var dados:Array<Dado> = arrayOf(Dado(1),Dado(2),Dado(3),Dado(4),Dado(5))
    dados[0].imprimirValores(dados)
}