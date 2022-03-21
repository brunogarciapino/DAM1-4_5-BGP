fun main(){
    println("Introduce un dato")
    var dato1 = readLine()!!.toFloat()
    println("Introduce un dato")
    var dato2 = readLine()!!.toFloat()
    println("Introduce un dato")
    var dato3 = readLine()!!.toFloat()
    println("Introduce un dato")
    var dato4 = readLine()!!.toFloat()
    println("Introduce un dato")
    var dato5 = readLine()!!.toFloat()
    var listainm = listOf<Float>(dato1,dato2,dato3,dato4,dato5)
    var media = listainm.average()
    println(listainm.average())
    var alto = 0.0F
    var bajo = 0.0F
    for(i in 0..listainm.size-1){
        if(listainm[i]>media){
            alto++
        }else {
            bajo++}
}
    println(alto)
    println(bajo)
}