fun generarCarton(carton: MutableSet<Int>) {
    do {
        val valor = (1..50).random()
        carton.add(valor)
    } while (carton.size!=6)
}

fun generarBolillero(bolillero: MutableSet<Int>) {
    do {
        val valor = (1..50).random()
        bolillero.add(valor)
    } while (bolillero.size!=50)
}

fun verificarTriunfo(carton: MutableSet<Int>, bolillero: MutableSet<Int>) {
    var aciertos = 0
    var cantBolillas = 0
    var intentos = 0
    for(i in bolillero) {
        cantBolillas++
        if (i in carton) {
            aciertos++
            if (aciertos == 6) {
                intentos = cantBolillas
                break
            }
        }
    }
    println("Se sacaron $intentos bolillas hasta que el cartón ganó.")
}

fun main() {
    val carton: MutableSet<Int> = mutableSetOf()
    generarCarton(carton)
    println("Carton de lotería generado")
    println(carton)
    val bolillero: MutableSet<Int> = mutableSetOf()
    generarBolillero(bolillero)
    println("Numeros del bolillero")
    println(bolillero)
    verificarTriunfo(carton, bolillero)
}