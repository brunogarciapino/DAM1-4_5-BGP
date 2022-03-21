data class Articulo(val codigo: Int, val descripcion: String, var precio: Float) {

    fun mostrarComponentes(articulos: Array<Articulo>) {
        for (i in (0..articulos.size - 1)) { // Recorre el array desde el 0 hasta el tamaño del array que es size-1
            println(articulos[i])
        }
    }

    fun aumentarPrecio(articulos: Array<Articulo>) { //Poner el precio de los articulos en un 10% mas
        for (i in 0..articulos.size - 1) {
            var porcent = articulos[i].precio+(precio*0.1F)
            articulos[i].precio = porcent
            println(articulos[i])
        }

    }

}


fun main(){
var articulos: Array<Articulo> = arrayOf(Articulo(123,"Fregona",4.1F),Articulo(111,"Juguete",13.40F),Articulo(213,"Mesa",30.0F),Articulo(321,"Caja",2.0F))
println("Los articulos son:")
articulos[0].mostrarComponentes(articulos)
println("Los articulos con el 10%")
println(articulos[0].aumentarPrecio(articulos))
}