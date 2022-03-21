class Empleado(val nombre: String, val sueldo:Int) {

    fun imprimir() {
        println("EL nombre es: $nombre y el sueldo es $sueldo")
    }
}

fun gastos(listamut: MutableList<Empleado>) {
    val total = listamut.sumOf { it.sueldo }
    println("La empresa gasta: $total")
}

fun main(){
    var listamut = mutableListOf<Empleado>(Empleado("JUan",1200),Empleado("Pedro",1500),Empleado("Ana",1700))
    listamut.forEach { it.imprimir() } //Para que imprima cada uno
    var total = listamut.sumOf { it.sueldo } //Sumar todos los sueldos de la lista
    gastos(listamut)
    listamut.add(Empleado("Marta",3000))
    gastos(listamut)
}