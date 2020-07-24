package com.example.testesaulaif;

public class ExerciciosFor {
    /**
     * 1 - Faça um programa que receba um número inteiro, conte mais 10 (usando for) e
     * devolva o resultado
     */
    public int somar10(int valor){
        int contador;

        for(contador = 0; contador < 10; contador = contador + 1){
            valor = valor + 1;
        }

        return valor;
    }

    /**
     * 2 - Faça um programa que receba um número inteiro, conte mais 20 (usando for), concatene cada
     * número em uma string (separando por espaço), e devolva essa string
     */

    public String numeroConcatenado(int numero){
        int contador;
        String resultadoFinal = "";

        for(contador = 0; contador <= 20; contador = contador + 1){
            resultadoFinal = resultadoFinal + numero + " ";
            numero = numero + 1;
        }

        return resultadoFinal;
    }

    /**
     * 3 - Faça um programa que receba um numero inteiro, multiplique esse número por ele mesmo
     * 4 vezez (usando for), e devolva o resultado
     */
    public int multiplicarQuatroVezes(int valor){
        int contador;
        int valorFinal = 1;
        for(contador = 0; contador <= 3; contador++){
            valorFinal = valorFinal * valor;
        }

        return valorFinal;
    }

    /**
     * 4 - Faça um programa que receba um numero inicial, um número final, execulte o for usando esses números, concatene cada
     *número em uma string, e devolva essa string
     */

    /**
     * 5 - Faça um programa que conctene em uma string somente os numeros impares de 0 até 20,
     * e devolva essa string
     */
    public String numerosImpares(){
        int contador;
        String resultadoFinal = "";
        for(contador = 0; contador < 2000; contador = contador + 1){
            double restoDaDivisao = contador % 2;

            if(restoDaDivisao != 0){// é um número impar?
                resultadoFinal = resultadoFinal + contador + " ";
            }
        }
        return resultadoFinal;
    }

    /**
     * 6 - Faça um programa que conctene em uma string somente os numeros pares de 0 até 20,
     * e devolva essa string
     */

    /**
     * 7 - Faça um programa que você passe um número inicial, um numero final, e some todos os valores
     * entre esses números (incluindo os numeros passados)
     */
    public Integer somarValoresEntreOsNumeros(int valorInical, int valorFinal){
        int contador;
        int somaValorFinal = 0;
        for(contador = valorInical; contador <= valorFinal; contador++){
            somaValorFinal = somaValorFinal + contador;
        }

        return somaValorFinal;
    }

    /**
     * 8 - Faça um programa, que voce passe dois números, um inteiro, e um número real
     * calcule a potencia do numero real, usando o numero inteiro
     */
    public Double calcularPotencia(Double valor, int potencia){
        int contador;
        Double valorFinal = 1.0;
        for(contador = 0; contador < potencia; contador++){
            valorFinal = valorFinal * valor;
        }

        return valorFinal;
    }

}
