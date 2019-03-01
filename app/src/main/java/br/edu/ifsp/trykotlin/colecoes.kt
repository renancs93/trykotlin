package br.edu.ifsp.trykotlin

fun main(){
    //List e MutableList
    var familia:List<String> = listOf<String>("Willian", "Mae", "Pai")

    familia = listOf<String>("Renan", "Mãe", "Pai", "Gabriel")

    //Loop
    for (integrante in familia)
        println(integrante)

    val listaInteiro : List<Int>  = listOf<Int> (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val listaInteiro2 : List<Int>  = (1..10 step 2).toList()

    for (i in listaInteiro)
        println(i)

    //FOR com IntRange 1..10
    for (i in 0..9)
        println(listaInteiro[i])

    for (i in 0..listaInteiro2.size - 1)
        println(listaInteiro2[i])

    var listaCursos: MutableList<String> = mutableListOf ("Sistemas para dospositivos móveis", "Análise e Desenvolvimento de Sistemas")
    listaCursos.add("Técnico em informática para internet")

    //Percorrendo com lambda
    listaCursos.forEach() { println(it.toUpperCase()) }

    listaCursos.forEach(::println)

    listaCursos.forEach {println(it)}

    //++++++ AULA 2 ++++++
    println("Set e MutableSet")

    val setCursor: MutableSet<String> = mutableSetOf<String>("ADS", "SDM", "TII")
    setCursor.add("ADS")
    setCursor.add("SDM")
    setCursor.add("TMA")

    setCursor.forEach( {println(it)} )

    println("Map e MutableMap")
    val familyMap : MutableMap<String, String> = mutableMapOf( Pair("Pai", "Claudecir"), Pair("Mãe", "Regina") )
    familyMap.put("Filho", "Renan")

    familyMap.forEach({ println(it)})

    //+++Exercicio 2 - Imprimir de forma personalizada+++
    //Solução 1
    println("\nSolução 1")
    for (chave in familyMap.keys){
        println("${chave} - ${familyMap.get(chave)}")
    }

    //Solução 2
    println("\nSolução 2")
    familyMap.keys.forEach({ println("${it} -> ${familyMap.get(it)}") })

    //Solução 3 - Função Anônima
    println("\nSolução 3")
    fun percorreMap(par: Map.Entry<String, String>) : Unit{
        println("${par.key} --> ${par.value}")
    }
    familyMap.forEach(::percorreMap)

    //Solução 4 - Chamada de variavel
    println("\nSolução 4")
    val percorreMap : (String, String) -> Unit = fun (k: String, v: String){
        println("$k - $v")
    }
    familyMap.forEach(percorreMap)

}