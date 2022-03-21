fun main() {

    var arreglo1 = IntArray(4)
    var arreglo2 = IntArray(4)
    var arreglo3 = IntArray(4)

    for (i in arreglo1.indices){
        print("Introduce un elemento para el arreglo1:  ")
        arreglo1[i] = readLine()!!.toInt()
    }

    for (i in arreglo2.indices){
        print("Introduce un elemento para el arreglo2: ")
        arreglo2[i] = readLine()!!.toInt()
    }

    arreglo3[0] = arreglo1[0]+arreglo2[0]
    arreglo3[1] = arreglo1[1]+arreglo2[1]
    arreglo3[2] = arreglo1[2]+arreglo2[2]
    arreglo3[3] = arreglo1[3]+arreglo2[3]

    for(i in arreglo3){
        println("Los valores de arreglo 3 son: $i")
    }
}