fun main(args: Array<String>) {


    val fraseAleatoria = "En platzi nunca paramos de aprender".randomCase()
    //println(randomCase(fraseAleatoria))
    imprimirFrase(fraseAleatoria)

}

fun imprimirFrase(frase : String) : Unit {
    println("Tu frase es: $frase")
}

fun String.randomCase() : String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if (resultadoAleatorio.rem(2) == 0){
        this.toUpperCase()
    } else this.toLowerCase()
}