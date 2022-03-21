data class Fecha(val dia: Int, val mes: Int, val año: Int)

fun cargarFecha(agenda: MutableMap<Fecha, String>) {
    do {
        print("Ingrese el día:")
        val dia = readLine()!!.toInt()
        print("Ingrese el mes:")
        val mes = readLine()!!.toInt()
        print("Ingrese el año:")
        val año = readLine()!!.toInt()
        print("Notas para la fecha")
        val notas = readLine()!!.toString()
        agenda[Fecha(dia, mes, año)] = notas
        print("¿Quieres ingresar otra fecha (si/no)?:")
        val repetir = readLine()!!
    } while (repetir == "si")
}


fun imprimirAgenda(agenda: MutableMap<Fecha, String>) {
    for((fecha, actividad) in agenda) {
        println("Fecha ${fecha.dia}/${fecha.mes}/${fecha.año}")
        println("Actividades: $actividad")
        println()
    }
}

fun consultarFecha(agenda: MutableMap<Fecha, String>) {
    println("Ingrese una fecha a consultar")
    print("Ingrese el día:")
    val dia = readLine()!!.toInt()
    print("Ingrese el mes:")
    val mes = readLine()!!.toInt()
    print("Ingrese el año:")
    val año = readLine()!!.toInt()
    val fecha = Fecha(dia, mes, año)
    if (fecha in agenda)
        println("Actividades: ${agenda[fecha]}")
    else
        println("No existen actividades registradas para dicha fecha")
}

fun main() {
    val agenda: MutableMap<Fecha, String> = mutableMapOf()
    cargarFecha(agenda)
    imprimirAgenda(agenda)
    consultarFecha(agenda)
}
