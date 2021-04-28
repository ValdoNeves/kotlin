package com.orgfree.valdoneves.kotlin

//craiando classe pessoa
class Pessoa() {

    //definindo parametros com seus tipos (testes)
    var nome: String = "Eu"
        private set

    var cpf: String = "123.123.123-12"
        private set

    fun pessoaInfo() = "$nome e $cpf"

}

fun main(){
    //instanciando a classe pessoa
    val eu = Pessoa()

//    eu.nome = " eu 2"
    //recebendo os valores da classe
    println(eu.nome)
    println(eu.cpf)
    println(eu.pessoaInfo())
    println(eu)

}