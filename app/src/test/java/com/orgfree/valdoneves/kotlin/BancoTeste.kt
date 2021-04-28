package com.orgfree.valdoneves.kotlin

fun main(){
    //padrao primeiro String, int
    val meuBanco = Banco("BancoUm", 7)
    //padrao nomeados
    val meuBancoDois = Banco(numero = 8, nome = "BancoDois")

    //ambos os casos são imutaveis
    println(meuBanco.nome)
    println(meuBanco.numero)

    val banco2 = meuBanco.copy(nome = "Banco3")
    println(banco2.info())
}