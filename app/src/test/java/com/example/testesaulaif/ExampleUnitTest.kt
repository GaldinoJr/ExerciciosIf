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

    @Test
    fun testdarEntradaNoHotelEDevolverSituacaoMaisNomeDosHospedes(){
        val testes = Testes()
        var mensagem = testes.darEntradaNoHotelEDevolverSituacaoMaisNomeDosHospedes("hospede 01")
        assertEquals( "Status: com vagas - Nomes: hospede 01, ", mensagem)
        //---------------------------------------------//
        mensagem = testes.darEntradaNoHotelEDevolverSituacaoMaisNomeDosHospedes("hospede 02")
        assertEquals( "Status: com vagas - Nomes: hospede 01, hospede 02, ", mensagem)
        //---------------------------------------------//
        mensagem = testes.darEntradaNoHotelEDevolverSituacaoMaisNomeDosHospedes("hospede 03")
        assertEquals(
            "Status: com poucas vagas - Nomes: hospede 01, hospede 02, hospede 03, ", mensagem)
        //---------------------------------------------//
        mensagem = testes.darEntradaNoHotelEDevolverSituacaoMaisNomeDosHospedes ("hospede 04")
        assertEquals(
            "Status: com poucas vagas - Nomes: hospede 01, hospede 02, hospede 03, hospede 04, ", mensagem)
        //---------------------------------------------//
        mensagem = testes.darEntradaNoHotelEDevolverSituacaoMaisNomeDosHospedes("hospede 05")
        assertEquals(
            "Status: com poucas vagas - Nomes: hospede 01, hospede 02, hospede 03, hospede 04, hospede 05, ", mensagem)
        //---------------------------------------------//
        mensagem = testes.darEntradaNoHotelEDevolverSituacaoMaisNomeDosHospedes("hospede 06")
        assertEquals( "Status: lotado - Nomes: hospede 01, hospede 02, hospede 03, hospede 04, hospede 05, ", mensagem)
    }

    @Test
    fun testcalcularQuantidadeComodos(){
        val testes = Testes()

        val calcularQuantidadeComodos = testes.calcularQuantidadeComodos(10.0, 50.0)
        assertEquals(100,calcularQuantidadeComodos)
    }

    @Test
    fun testconcatenarDoisNumerosInteiros(){
        val testes = Testes()
        val concatenarDoisNumerosInteiros = testes.concatenarDoisNumerosInteiros(145, 2)

        assertEquals("1452",concatenarDoisNumerosInteiros)
    }

    @Test
    fun testverificarVelocidadePermitida(){
        val testes = Testes()

        // testes com carro
        var retorno = testes.verificarVelocidadePermitida(100.0, 90.0, "Carro")
        assertEquals("Dentro da velocidade permitida", retorno)

        retorno = testes.verificarVelocidadePermitida(100.0, 110.0, "Carro")
        assertEquals("Fora da velocidade permitida", retorno)

        // testes com moto
        retorno = testes.verificarVelocidadePermitida(100.0, 110.0, "Moto")
        assertEquals("Dentro da velocidade permitida", retorno)

        retorno = testes.verificarVelocidadePermitida(100.0, 130.0, "Moto")
        assertEquals("Fora da velocidade permitida", retorno)

        // testes com caminhao
        retorno = testes.verificarVelocidadePermitida(100.0, 49.0, "Caminhão")
        assertEquals("Dentro da velocidade permitida", retorno)

        retorno = testes.verificarVelocidadePermitida(100.0, 51.0, "Caminhão")
        assertEquals("Fora da velocidade permitida", retorno)
    }

}
