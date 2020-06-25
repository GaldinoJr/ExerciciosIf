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

    @Test
    fun testdescobrirDescricaoGravidadePorCodigo(){
        val testes = Testes()
        var mensagem = testes.descobrirDescricaoGravidadePorCodigo(1)

        assertEquals( "Baixa", mensagem)

        mensagem = testes.descobrirDescricaoGravidadePorCodigo(2)
        assertEquals( "Média", mensagem)

        mensagem = testes.descobrirDescricaoGravidadePorCodigo(3)
        assertEquals( "Alta", mensagem)
    }

    @Test
    fun testdescobrirCodigoGravidade(){
        val testes = Testes()
        var mensagem = testes.descobrirCodigoGravidade("Baixa")
        assertEquals( 2, mensagem)

        mensagem = testes.descobrirCodigoGravidade("Média")
        assertEquals( 5, mensagem)

        mensagem = testes.descobrirCodigoGravidade("Alta")
        assertEquals( 10, mensagem)
    }

    @Test
    fun testdescobrirDescricaoGravidadePorQuantidadeDeBomebeiros(){
        val testes = Testes()
        var mensagem = testes.descobrirDescricaoGravidadePorQuantidadeDeBomebeiros(3)
        assertEquals( "Baixa", mensagem)

        mensagem = testes.descobrirDescricaoGravidadePorQuantidadeDeBomebeiros(4)
        assertEquals( "Baixa", mensagem)

        mensagem = testes.descobrirDescricaoGravidadePorQuantidadeDeBomebeiros(5)
        assertEquals( "Média", mensagem)

        mensagem = testes.descobrirDescricaoGravidadePorQuantidadeDeBomebeiros(6)
        assertEquals( "Média", mensagem)

        mensagem = testes.descobrirDescricaoGravidadePorQuantidadeDeBomebeiros(10)
        assertEquals( "Alta", mensagem)

        mensagem = testes.descobrirDescricaoGravidadePorQuantidadeDeBomebeiros(11)
        assertEquals( "Alta", mensagem)
    }

    @Test
    fun testmisturarCores(){
        val testes = Testes()
        var mensagem = testes.misturarCores("amarelo", "laranja", "")
        assertEquals( "vermelho", mensagem)

        mensagem = testes.misturarCores("vermelho", "amarelo", "")
        assertEquals( "laranja", mensagem)

        mensagem = testes.misturarCores("azul", "vermelho", "")
        assertEquals( "roxo", mensagem)

        mensagem = testes.misturarCores("preto", "amarelo", "cinza")
        assertEquals( "branco", mensagem)
    }

    @Test
    fun testdarEntradaNoHotelEDevolverSituacao(){
        val testes = Testes()
        var mensagem = testes.darEntradaNoHotelEDevolverSituacao("hospede 01")
        assertEquals( "com vagas", mensagem)

        mensagem = testes.darEntradaNoHotelEDevolverSituacao("hospede 02")
        assertEquals( "com vagas", mensagem)

        mensagem = testes.darEntradaNoHotelEDevolverSituacao("hospede 03")
        assertEquals( "com poucas vagas", mensagem)

        mensagem = testes.darEntradaNoHotelEDevolverSituacao ("hospede 04")
        assertEquals( "com poucas vagas", mensagem)

        mensagem = testes.darEntradaNoHotelEDevolverSituacao("hospede 05")
        assertEquals( "com poucas vagas", mensagem)

        mensagem = testes.darEntradaNoHotelEDevolverSituacao("hospede 06")
        assertEquals( "lotado", mensagem)
    }
}
