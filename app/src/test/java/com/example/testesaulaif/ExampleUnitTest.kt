package com.example.testesaulaif

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testarLuzApagada(){
        val testes = Testes()
        val mensagem = testes.testeLuz(false)

        assertEquals( "A luz está apagada", mensagem)
    }

    @Test
    fun testarLuzAcesa(){
        val testes = Testes()
        val mensagem = testes.testeLuz(true)

        assertEquals( "A luz está acesa", mensagem)
    }

    @Test
    fun testarSemafarolVerde(){
        val testes = Testes()
        val mensagem = testes.testeSemaforo("verde")

        assertEquals( "Seguir", mensagem)
    }

    @Test
    fun testarSemafarolamarelo(){
        val testes = Testes()
        val mensagem = testes.testeSemaforo("amarelo")

        assertEquals( "Atenção", mensagem)
    }

    @Test
    fun testarSemafarolvermelho(){
        val testes = Testes()
        val mensagem = testes.testeSemaforo("vermelho")

        assertEquals( "Parar", mensagem)
    }


    @Test
    fun testarbatimento(){
        val testes = Testes()
        val mensagem = testes.testeCardiaco(101)

        assertEquals( "atv fisica", mensagem)
    }
}
