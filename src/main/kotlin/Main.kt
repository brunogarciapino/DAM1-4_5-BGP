fun main() {

    var arreglo = IntArray(8)

    //Te dice que introduzcas un elemento y se almacenan en el array
    for (i in arreglo.indices){
        print("Introduce un elemento: ")
        try {
            arreglo[i] = readLine()!!.toInt()
        } catch (e:Exception){
        println("Tienes que introducir un número")
        }
    }


    for (i in arreglo){
        if (i > 36){
            println("$i es mayor que 36")
        }
        if (i > 50){
            println("$i es mayor que 50")
        }
    }
}