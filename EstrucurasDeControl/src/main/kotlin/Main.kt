import java.lang.NullPointerException

fun main(args: Array<String>) {
    /*val nombre = ""

    if (nombre.isNotEmpty())
        println("El largo de nuestra variable nombre es ${nombre.length}")
    else
        println("Error, la variable está vacía")

    val mensaje : String = if (nombre.length > 4)
        "Tu nombre es largo" else if (nombre.isEmpty()) "Nombre esta vacio"
    else
        "Tienes un nombre corto"
    println(mensaje)*/

    /*val nombreColor = "Carmesi"

    when(nombreColor){ //es como un switch case en java
        "Amarillo" -> println("El amarillo es el color del dinero")
        "Rojo", "Carmesi" -> println("El rojo simboliza el amor")
        else -> println("No es un color de la lista")
    }

    val code = 501

    when(code){
        in 200..299 -> println("Todo ha ido bien")
        in 400..500 -> println("Algo ha fallado")
        else -> println("Código desconocido")
    }

    val tallaDeZapatos = 42

    val mensaje = when(tallaDeZapatos){
        41,43 -> "Tenemos disponible"
        35,36 -> "Casi no nos quedan"
        37 -> "Lo siento, se agotaron"
        else -> "Solo traemos tallas 35, 36, 37, 41 y 43"
    }
    println(mensaje)*/

    /*var contador = 10
    while(contador > 0)
    {
        println("El valor del contador es ${contador}")
        contador--
    }

    do{
        println("Generando numero aleatorio...")
        val numeroAleatorio = (0..10).random()
        println("el numero generado es: ${numeroAleatorio}")
    } while(numeroAleatorio > 50)*/

    /*val listaDeFrutas = listOf("Manzana", "Pera", "Frambuesa", "Durazno")
    for (fruta in listaDeFrutas) println("hoy voy a comerme una fruta llamada ${fruta}")
    listaDeFrutas.forEach { fruta -> println("hoy voy a comerme una fruta nueva llamada ${fruta}")}

    val caracteresDeFruta: List<Int> = listaDeFrutas.map { fruta -> fruta.length }
    println(caracteresDeFruta)

    val listaFiltrada = caracteresDeFruta.filter { characterFruit -> characterFruit > 5 }
    println(listaFiltrada)*/

    /*var name : String? = null
    try {
        throw NullPointerException("Referencia nula")
    } catch (exception : NullPointerException){
        println("Ha ocurrido un error")
    } finally {
        println("Finalmente ha ocurrido un error...cerrando aplicación")
    }

    val firstValue = 10
    val secondValue = 0
    val result : Int = try { firstValue / secondValue } catch (exception : Exception) { 0 }
    println(result)*/

    var name: String? = null
    val charactersName : Int = name?.length ?: 0
    println(charactersName)

}