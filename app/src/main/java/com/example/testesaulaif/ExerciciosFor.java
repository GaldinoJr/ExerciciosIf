package com.example.testesaulaif;

import java.util.LinkedList;
import java.util.List;

public class ExerciciosFor {
    /**
     * 1 - Faça um programa que receba um número inteiro, conte mais 10 (usando for) e
     * devolva o resultado
     */
    public int somar10(int valor) {
        int contador;

        for (contador = 0; contador < 10; contador = contador + 1) {
            valor = valor + 1;
        }

        return valor;
    }

    /**
     * 2 - Faça um programa que receba um número inteiro, conte mais 20 (usando for), concatene cada
     * número em uma string (separando por espaço), e devolva essa string
     */

    public String numeroConcatenado(int numero) {
        int contador;
        String resultadoFinal = "";

        for (contador = 0; contador <= 20; contador = contador + 1) {
            resultadoFinal = resultadoFinal + numero + " ";
            numero = numero + 1;
        }

        return resultadoFinal;
    }

    /**
     * 3 - Faça um programa que receba um numero inteiro, multiplique esse número por ele mesmo
     * 4 vezez (usando for), e devolva o resultado
     */
    public int multiplicarQuatroVezes(int valor) {
        int contador;
        int valorFinal = 1;
        for (contador = 0; contador <= 3; contador++) {
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
    public String numerosImpares() {
        int contador;
        String resultadoFinal = "";
        for (contador = 0; contador < 2000; contador = contador + 1) {
            double restoDaDivisao = contador % 2;

            if (restoDaDivisao != 0) {// é um número impar?
                resultadoFinal = resultadoFinal + contador + " ";
            }
        }
        return resultadoFinal;
    }

    /**
     * 6 - Faça um programa que concatene em uma string somente os numeros pares de 0 até 20,
     * e devolva essa string
     */

    /**
     * 7 - Faça um programa que você passe um número inicial, um numero final, e some todos os valores
     * entre esses números (incluindo os numeros passados)
     */
    public Integer somarValoresEntreOsNumeros(int valorInical, int valorFinal) {
        int contador;
        int somaValorFinal = 0;
        for (contador = valorInical; contador <= valorFinal; contador++) {
            somaValorFinal = somaValorFinal + contador;
        }

        return somaValorFinal;
    }

    /**
     * 8 - Faça um programa, que voce passe dois números, um inteiro, e um número real
     * calcule a potencia do numero real, usando o numero inteiro
     */
    public Double calcularPotencia(Double valor, int potencia) {
        int contador;
        Double valorFinal = 1.0;
        for (contador = 0; contador < potencia; contador++) {
            valorFinal = valorFinal * valor;
        }

        return valorFinal;
    }

    public Integer descobrirSenhaComUmNumero(Integer senhaVerdadeira) {
        for (int i = 0; i < 10; i++) {
            if (senhaVerdadeira == i) {
                return i;
            }
        }
        return -1;
    }

    public Integer descobrirSenhaComDoisNumero(Integer senhaVerdadeira) {

        String senhaTeste = "0";
        boolean houveTroca = false;
        int aux = 1;

        do {
            for(int i = 0; i < senhaTeste.length(); i++) {

                for (int j = 0; j < 10; j++) {

                    String numeroInicial = "";
                    if(i > 0) {
                        numeroInicial = senhaTeste.substring(i - 1, i);
                    }
                    String senhaParaValidar = numeroInicial + j;

                    if (senhaParaValidar.equals(String.valueOf(senhaVerdadeira))) {
                        return Integer.parseInt(senhaParaValidar);
                    }
                }
            }

            if(senhaTeste.length() > 0 && aux < 10){
                String lastNumber = senhaTeste.substring(aux - 1, aux);
                int lastNumberInteger = Integer.parseInt(lastNumber) + 1;
                senhaTeste = lastNumberInteger + "0";
                aux = 0;
            }

            aux ++;

            houveTroca = true;
        }
        while (houveTroca);

        return -1;
    }

    public Integer descobrirSenhaComTresOuMaisNumeros(Integer senhaVerdadeira) {
        List<String> senhaTestada = new LinkedList<>();

        senhaTestada.add("0");

        int posicaoTestadaDez = 0;
        int posicaoTestadaUm = 0;

        do {
            for(int i = 0; i < senhaTestada.size(); i++) {

                for (int j = 0; j < 10; j++) {
                    senhaTestada.set(posicaoTestadaDez, String.valueOf(j));
//                    if(getStringByList(senhaTestada).equals(String.valueOf(senhaVerdadeira))){
//                        return Integer.parseInt(getStringByList(senhaTestada));
//                    }
                }
                int valorTestadoUm = Integer.parseInt(senhaTestada.get(posicaoTestadaUm));
                if(valorTestadoUm ==9){
                    int valorPosicaoTestadaDez = Integer.parseInt(senhaTestada.get(posicaoTestadaDez));

                    senhaTestada.set(posicaoTestadaDez, "0");
                    if(senhaTestada.size() > 1) {
                        senhaTestada.set(posicaoTestadaUm, String.valueOf(valorPosicaoTestadaDez));
                    }
                    posicaoTestadaUm++;
                }
                else{
                    i = 0;

                    valorTestadoUm++;
                    senhaTestada.set(posicaoTestadaUm, String.valueOf(valorTestadoUm));
                }
            }

            posicaoTestadaUm = 0;
            senhaTestada.add("0");
            posicaoTestadaDez = senhaTestada.size()-1;
        }
        while (true);
    }

    public Integer descobrirSenhaComTresOuMaisNumeros2(Integer senhaVerdadeira) {
        List<Integer> senhaTestada = new LinkedList<>();

        senhaTestada.add(0);

        for(int i = senhaTestada.size() - 1; i >= 0 ; i--) {

            for (int j = 0; j < 10; j++) {
                senhaTestada.set(i, j);
                String testSenha = getStringByList(senhaTestada);
                if (testSenha.equals(String.valueOf(senhaVerdadeira))) {
                    return Integer.parseInt(testSenha);
                }
            }


            if(todosNumerosSaoNove(senhaTestada)){
                zeraTodosOsCaracteresDaSenha(senhaTestada);
                senhaTestada.add(0);
                // da pra zerar e tirar o do while
                i = senhaTestada.size();
            }
            else{
                int posicaoNumeroAnterior = i - 1;
                if(senhaTestada.size() > 1 && senhaTestada.get(posicaoNumeroAnterior) != 9){ // nao é um numero só, nem o último  && i < (senhaTestada.size() - 1)?
                    int novoNumero = senhaTestada.get(posicaoNumeroAnterior) + 1;
                    senhaTestada.set(posicaoNumeroAnterior, novoNumero);
                    i = senhaTestada.size();
                    zeraTodosOsCaracteresDaSenhaDepoisDoAumento(senhaTestada, posicaoNumeroAnterior);
                }
            }

        }
        return -1;
    }

    private void zeraTodosOsCaracteresDaSenhaDepoisDoAumento(List<Integer> senhaTestada, int posicaoNumeroAnterior) {
        for(int i = 0; i < senhaTestada.size(); i++){
            if(i > posicaoNumeroAnterior){
                senhaTestada.set(i,0);
            }
        }
    }

    private boolean todosNumerosSaoNove(List<Integer> senhaTestada) {
        boolean todosNove = true;
        for(int i = 0; i < senhaTestada.size(); i++){
           if(senhaTestada.get(i) != 9){
               todosNove = false;
           }
        }

        return todosNove;
    }

    private void zeraTodosOsCaracteresDaSenha(List<Integer> senhaTestada) {
        for(int i = 0; i < senhaTestada.size(); i++){
            senhaTestada.set(i,0);
        }
    }

    private String getStringByList(List<Integer> senhaTestada) {
        String senha = "";

        for(int i = 0; i < senhaTestada.size(); i++){
            senha = senha + senhaTestada.get(i);
        }

        return senha;
    }


    /**
     * 9 - Faça um programa que voce passe uma senha de 3 digitos númericos,
     * e o seu programa sejá capaz, de identificar essa senha
     * <p>
     * Ex: Imagine que vc tenha uma senha do facebook, de 3 digitos
     * Voce terá que fazer um programa, que irá tentar diversas vezes acertar a senha, até
     * Descobrir a senha verdadeira
     */
    public Integer descobrirSenha(Integer senhaVerdadeira) {
        // 1 - testar os últimos 10 numeros
        // 2 - testar os penultimos + 10 ultimos números


        String senhaVerdadeiraString = senhaVerdadeira.toString();


        String senhaTeste = "";
        int contador = 0;
        int tamanhoSenha = senhaVerdadeiraString.length();
        for (contador = 0; contador < tamanhoSenha; contador++) {
            senhaTeste = senhaTeste + "0";
        }


        int posicaoTestada = 0;


        for (int i = 0; i < tamanhoSenha; i++) {


            String initialNumbers = senhaTeste.substring(0, posicaoTestada);
            String endNumbers = senhaTeste.substring(posicaoTestada, tamanhoSenha);


            for (int x = 0; x < 10; x++) {
                String passwordToTest = initialNumbers + x + endNumbers;
                if (passwordToTest.equals(senhaVerdadeira.toString())) {
                    return Integer.parseInt(passwordToTest);
                }
            }
//            if(i > 0){
//                senhaTeste = senhaTeste.charAt()
//                x = 0;
//            }
        }

//        for (int j = tamanhoSenha; j >=0 ; j--) { // passar por todos os numeros
//
//            for (int x = 0; x < 10; x++) {
//                String valorFinal = "";
//
//                valorFinal = senhaTeste.substring(j, tamanhoSenha);
//
//                String valorDeTeste = senhaTeste.substring(0, j - 1) + x + valorFinal;
//                if (valorDeTeste.equals(senhaVerdadeira.toString())) {
//                    return Integer.valueOf(valorDeTeste);
//                }
//                if(x == 9){
//                    if(senhaTeste.length() - 3 >=0) {
//                        String numeroAnterior = senhaTeste.substring(j - 2, j - 1);
//                        int numeroAnteriorInteiro = Integer.parseInt(numeroAnterior);
//                        if(numeroAnteriorInteiro < 9) {
//                            x = 0;
//                            int novoNumeroAnterior = numeroAnteriorInteiro + 1;
//                            senhaTeste = senhaTeste.substring(0, j - 2) + novoNumeroAnterior + senhaTeste.substring(j - 1, tamanhoSenha);
//                            if (senhaTeste.equals(senhaVerdadeira.toString())) {
//                                return Integer.valueOf(senhaTeste);
//                            }
//                        }
//                    }
//                }
//            }
//
//        }
        return -1;
    }

    String testesEstruturasFor() {
        Integer[] valores = new Integer[3];

        String resultado = "";

        valores[0] = 30;
        valores[1] = 43;
        valores[2] = 50;

        // FOR
        resultado = resultado + "FOR - ";

        for (int i = 0; i < 3; i++){
            Integer valor = valores[i];
            resultado += valor + ", ";
        }
        resultado +=  "\nFOREACH - ";


        // FOREACH
        for (int valor: valores){
            resultado += valor + ", ";
        }

        resultado +=  "\nWHILE - ";
        // WHILE
        int i = 0;
        while (i < 3){
            Integer valor = valores[i];
            resultado += valor + ", ";

            i++;
        }

        resultado +=  "\nWHILE2 - ";

        boolean continuar = true;
        i = 0;

        while (continuar){

            Integer valor = valores[i];
            resultado += valor + ", ";

            if(i > 1){
                continuar = false;
            }

            i++;
        }

        resultado +=  "\nDO WHILE - ";
        // DO WHILE
        i = 0;
        do {
            Integer valor = valores[i];
            resultado += valor + ", ";

            i++;
        } while (i < 3);

        return resultado;
    }

    /**
     * 1 - Faça um programa, que voce passe por parametro o valor da Receita, e o valor da Despesa
     * Calcule e devolva o resultado
     */
    public double calcularReceita(double receita, double despesa){
        double resultado;

        resultado = receita - despesa;

        return resultado;
    }

    /**
     * 2 - Faça um programa, que voce passe por parametro dois vetores de 10 Projetos cada um,
     * Lista 1 - Receitas
     * Lista 2 - Despesas
     * Calcule os resultados em um novo vetor devolva esse vetor
     * obs.: Os indices dos vetores, são os ids de referencia para os projetos
     */
    public Double[] calcularReceitaProjetos(Double[] receitas, Double[] despesas){
        Double[] resultados = new Double[10];

        for(int i=0; i<10; i++){

            double resultado = receitas[i] - despesas[i];

            resultados[i] = resultado;
        }

        return resultados;
    }
}
