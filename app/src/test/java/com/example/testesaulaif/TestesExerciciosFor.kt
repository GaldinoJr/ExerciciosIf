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
}