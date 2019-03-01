package br.edu.ifsp.trykotlin

fun main(){
    var numero:Int = 6
    var aux:Int = numero-1

    for (i in 0..numero.toInt() - 1) {
        for(j in 0..numero.toInt()-1){
            if (j >= aux) {
                print("#")
                //print(" ")
            } else {
                print(" ")
                //print("#")
            }
        }
        print("\n")
        aux = aux.toInt() - 1
    }

}
