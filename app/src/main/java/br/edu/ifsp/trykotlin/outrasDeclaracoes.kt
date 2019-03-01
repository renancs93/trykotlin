package br.edu.ifsp.trykotlin

fun main() {
    //String com tipo explícito
    var nome : String = "Renan"

    //Tipo determinado implicitamente
    var sobrenome = "Silva"

    // Var e Val podem ser inicializados a posteriori
    var nomeMeio : String
    nomeMeio = "Costa da"

    //Float
    var altura :Float = 1.73f

    //Inteiro
    var idate: Int = 25

    var peso : Double = 65.toDouble()

    println("Nome: ${nome}  ${nomeMeio} ${sobrenome} altura: ${altura}, idade ${idate}, peso ${peso} ")
}