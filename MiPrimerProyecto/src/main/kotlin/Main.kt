const val PI = 3.1416 //se generan antes de ejecutar, son valores constantes
fun main(args: Array<String>) {
    println("Hello World!")
    var dinero = 10
    println(dinero)
    dinero = 5
    println(dinero)
    val nombre = "Montse" //variable de solo lectura, una vez asignado no se puede cambiar
    println(nombre)
    println(PI)

    val boolean = true
    val numeroLargo : Long = 789456123456789123
    val double : Double = 2.7182
    var float = 1.1f

    var primerValor = 20
    primerValor = 11
    val segundoValor = 10
    val tercerValor = primerValor - segundoValor
    println(tercerValor)

    val apellido = "Canedo"
    val nombreCompleto = "Mi nombre es: $nombre $apellido" //concatenacion en kotlin
    println(nombreCompleto)
}