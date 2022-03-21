fun main(){
    var listainmut = List(100){(0..20).random()} //Con List puedes poner el tamaño y rellenarlo con el valor que tu quieras
    var contar1 = 0
    var contar2 = 0
    var contar3 = 0

    listainmut.forEach { when (it){      //Cuenta cuantas veces tiene un rango de numeros dentro de una lista.
     in 1..4 -> contar1++
     in 5..8-> contar2++
     in 10..13 -> contar3++
    }
    }
println(contar1)
println(contar2)
println(contar3)

    if (listainmut.contains(20)){
        println("Contiene el numero 20")
    }else { println("No lo tiene")}

}