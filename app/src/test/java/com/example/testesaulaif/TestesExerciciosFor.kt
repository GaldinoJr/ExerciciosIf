package com.example.testesaulaif

import junit.framework.Assert.assertEquals
import org.junit.Test

class TestesExerciciosFor {
    @Test
    fun testsomar10(){
        val ex = ExerciciosFor()
        var resultado = ex.somar10(10)

        assertEquals(20, resultado)

        resultado = ex.somar10(100)

        assertEquals(110, resultado)

        resultado = ex.somar10(155)

        assertEquals(165, resultado)
    }

    @Test
    fun testnumeroConcatenado(){
        val ex = ExerciciosFor()
        var resultado = ex.numeroConcatenado(10)

        assertEquals("10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 ", resultado)

        resultado = ex.numeroConcatenado(15200)

        assertEquals("10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 ", resultado)
    }

    @Test
    fun testnumerosImpares(){
        val ex = ExerciciosFor()
        var resultado = ex.numerosImpares()

        assertEquals("1 3 5 7 9 11 13 15 17 19 ", resultado)
    }

    @Test
    fun testmultiplicarQuatroVezes(){
        val exerciciosFor = ExerciciosFor()
        val valorResultado = exerciciosFor.multiplicarQuatroVezes(3)
        assertEquals(81, valorResultado)
    }


    @Test
    fun testpow(){
        val exerciciosFor = ExerciciosFor()
        val valorResultado = exerciciosFor.calcularPotencia(45.0,10)
        assertEquals(373669453125, valorResultado)
    }
}