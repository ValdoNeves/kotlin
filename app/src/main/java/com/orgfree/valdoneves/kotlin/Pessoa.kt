package com.orgfree.valdoneves.kotlin

//craiando classe pessoa
class Pessoa {

    //definindo parametros com seus tipos (testes)
    var nome: String = "Eu"
    var cpf:String = "123.123.123-12"

    //classe interna
    inner class Endereco{
        var rua:String = "Rua 1"
    }
}

fun main(){
    //instanciando a classe pessoa
    val eu = Pessoa()

    //recebendo os valores da classe
    println(eu.nome)
    println(eu.cpf)
    //acessando a classe interna de Pessoa
    println(eu.Endereco().rua)
}