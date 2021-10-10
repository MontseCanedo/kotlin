fun main(args: Array<String>) {

    /*val listaNombres = listOf("Juan", "Enrique", "Camila")
    println(listaNombres)

    val listaVacia = mutableListOf<String>()
    println(listaVacia)

    listaVacia.add("Juan")
    println(listaVacia)

    val valorUsandoGet = listaVacia.get(0)
    println(valorUsandoGet)

    val valorUsandoOperador = listaVacia[0]
    println(valorUsandoOperador)

    val primerValor: String? = listaNombres.firstOrNull()
    println(primerValor)

    listaVacia.removeAt(0)
    println(listaVacia)

    listaVacia.add("enrique")
    println(listaVacia)
    listaVacia.removeIf{ caracteres -> caracteres.length > 3 }
    println(listaVacia)

    val myArray = arrayOf(1,2,3,4)
    println("array como lista ${myArray.toList()}")*/

    /*val numerosDeLoteria = listOf(11,22,43,56,78,66)

    val numerosSorted = numerosDeLoteria.sorted()
    println(numerosSorted)

    val numerosDeLoteriaDescendientes = numerosDeLoteria.sortedDescending()
    println(numerosDeLoteriaDescendientes)

    val ordenarPorMultiplos = numerosDeLoteria.sortedBy { numero -> numero < 50 }
    println(ordenarPorMultiplos)

    val numerosAleatorios = numerosDeLoteria.shuffled()
    println(numerosAleatorios)

    val numerosEnReversa = numerosDeLoteria.reversed()
    println(numerosEnReversa)

    val mensajesDeNumeros = numerosDeLoteria.map { numero -> "Tu numero de loteria es ${numero}" }
    println(mensajesDeNumeros)

    val numerosFiltrados = numerosDeLoteria.filter { numero -> numero > 50 }
    println(numerosFiltrados)*/

    /*val edadSuperheroes = mapOf(
        "IronMan " to 35,
        "Spiderman " to 18,
        "CaptainAmerica " to 99
    )
    println(edadSuperheroes)

    val edadSuperheroesMutable = mutableMapOf(
        "IronMan" to 35,
        "Spiderman" to 18,
        "CaptainAmerica" to 99
    )
    println(edadSuperheroesMutable)

    edadSuperheroesMutable.put("Hulk ", 40)
    println(edadSuperheroesMutable)

    edadSuperheroesMutable["BlackPanter"] = 25
    println(edadSuperheroesMutable)

    val edadIronMan = edadSuperheroesMutable["IronMan"]
    println(edadIronMan)

    edadSuperheroesMutable.remove("BlackPanter")
    println(edadSuperheroesMutable)

    println(edadSuperheroesMutable.keys)
    println(edadSuperheroesMutable.values)*/

    val vocalesRepetidas = setOf("a", "e", "i" , "o", "u", "a", "e", "i" , "o", "u")
    println(vocalesRepetidas)

    val numerosFavoritos = mutableSetOf(1,2,3,4)
    numerosFavoritos.add(5)
    println(numerosFavoritos)

    numerosFavoritos.remove(5)
    println(numerosFavoritos)

    val valorDelSet = numerosFavoritos.firstOrNull{ numero -> numero > 2 }
    println(valorDelSet)
}