package br.edu.ifsp.trykotlin

fun processaInteiro(i: Int, f: (j: Int) -> Int): Int {
    return f(i)
}

fun inverte(x: Int): Int = x * -1

fun Int.executa(f: (Int) -> Int): Int {
    return f(this)
}

fun main() {

    // Passando uma função comum como parâmetro
    val n: Int = processaInteiro(10, ::inverte)
    println(n)

    //Passando uma função lambda como parâmetro
    val n2: Int = processaInteiro(11, {x: Int -> -1 * x})
    //val n2: Int = processaInteiro(11, {x -> -1 * x}) // => outra forma de fazer
    println(n2)

    //Passando uma função lambda como parâmetro, com um parâmetro apenas
    val n3: Int = processaInteiro(12, {-1 * it})
    println(n3)

    //Passando uma função lambda como parâmetro último parâmetro (fora do parenteses)
    val n4: Int = processaInteiro(13) {-1 * it}
    println(n4)

    //Passando lambda para uma função estendida
    val n5: Int = 15.executa {-1 * it}
    println(n5)

}