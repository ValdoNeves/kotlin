package com.orgfree.valdoneves.kotlin

class Pessoa {
    var nome: String = "Eu"
    var cpf:String = "123.123.123-12"
}

fun main(){
    val eu = Pessoa()

    println(eu.nome)
    println(eu.cpf)
}