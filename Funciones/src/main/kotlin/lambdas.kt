fun main(args: Array<String>){

    val myLambda : (String) -> Int = { valor -> valor.length }
    val lambdaEjecutada = myLambda("Hola Devs")
    println(lambdaEjecutada)

    val saludos = listOf("Hello", "Hola", "Ciao")
    val longitudDeSaludos = saludos.map(myLambda)
    println(longitudDeSaludos)
}