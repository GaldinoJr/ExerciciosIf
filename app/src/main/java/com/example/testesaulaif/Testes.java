package com.example.testesaulaif;

public class Testes {
    /**
     * Vamos fazer um programa, passando o status da lampada, e ele deve devolver se a luz está ou não acesa
     * Status, true - O programa deve retornar "A luz está acesa"
     * Status, false - O programa deve retornar "A luz está apagada"
     */

    //testes
    public String testeLuz(boolean status) {
        if (status == true) {// a luz está acesa
            return "A luz está acesa";
        } else { // a luz está apagada
            return "A luz está apagada";
        }
    }

    public String testeSemaforo(String cor) {
        if (cor.equals("vermelho")) {
            return "Parar";
        } else if (cor.equals("amarelo")) {
            return "Atenção";
        } else if (cor.equals("verde")) {
            return "Seguir";
        }


        return "Se fodeu, opção inválida";
    }

    public String testeCardiaco(int batimento) {
        if (batimento == 0) {
            return "morto";
        }
        else if (batimento > 0 && batimento <= 30) {
            return " ta morrendo";
        }
        else if (batimento > 30 && batimento <= 100) {
            return "normal";

        }
        else if (batimento > 100 && batimento <= 150) {
            return "atv fisica";
        }
        else {
            return "ataque";

        }
    }

    public String testeRangeSalario(int range1, int range2) {
        // testar



        return "Não existem pessoas nesse range de salário";
    }

    /**
     * 1 - Bombeiro
     * 2 - Vagas estacionamento
     * 3 - Vagas em um hotel
     * 4 - Somar 3 valores
     * 5 - Hospital
     * 6 - Casas
     * 7 - Empresa
     * 8 - Salário
     * 9 - Carro
     * 10 - Química
     * 11 - Cores
     */

    /**
     * 1 - Corpo de Bombeiros
     * Descrição:
     *
     * No corpo de bombeiros, a quantidade de bombeiros que devem ir atender um chamado
     * varia conforme a gravidade do incendio.
     * As gravidades são:
     * 1 - Baixa
     * 2 - Média
     * 3 - Alta
     *
     * Sendo assim, para a gravidade baixa, é necessário uma equipe de > de 2 bombeiros
     * gravidade média, é necessário uma equipe de > 5 bombeiros
     * gravidade alta, é necessário uma equipe de > 10 bombeiros
     */

    /**
     * 1.1 - Faça um programa que você passe o código da gravidade (1,2, ou 3)
     * E ele retorne a descrição da gravidade
     */
    public String descobrirDescricaoGravidadePorCodigo(int gravidade){
        return null;
    }

    /**
     * 1.2 - Faça um programa que você passe a descrição da gravidade (Baixa, Média, ou Alta)
     * E ele retorne a quantidade de de bombeiros necessários para atuar no chamado
     */
    public int  descobrirCodigoGravidade(String descricaoGravidade){
        return -1;
    }

    /**
     * 1.3 - Faça um programa que você passe a quantidade de bombeiros
     * E ele retorne a descrição da gravidade do incendio
     */

    public String descobrirDescricaoGravidadePorQuantidadeDeBomebeiros(int quantidadeBombeiros){
        return null;
    }

    /**
     * 2 Cores:
     * Descrição: Fazer um programa, que vc passe cores, e ele seja capaz de identificar qual
     * seria a nova cor, se as duas corres passadas fossem misturadas
     * Cor:
     * amarelo + laranja = vermelho
     * vermelho  + amarelo = laranja
     * azul + vermelho = roxo
     * preto + amarelo + cinza = branco
     */

    public String misturarCores(String cor1, String cor2, String cor3){
       return null;
    }

    /**
     * 3 Hotel:
     * Descrição
     * Fazer um programa que grave a quantidade de hospedes de um hotel, e a cada novo hospede
     * devolver a situação da capacidade do hotel
     * Regras:
     * Hotel com até 2 hospedes, Devolver, com vagas
     * Hotel com mais de 2 hospedes e até 5, Devolver, com poucas vagas
     * Hotel com 5 hospedes, Devolver, lotado
     */


    public String darEntradaNoHotelEDevolverSituacao(String nomeHospede){
        String statusDeVaga = "";
        if(quantidadeHospedes < 5){
            // ainda tenho vaga
            quantidadeHospedes = quantidadeHospedes + 1;
            if(quantidadeHospedes <= 2){
                statusDeVaga = "com vagas";
            }
            else{
                statusDeVaga =  "com poucas vagas";
            }
        }
        else{ // nao tenho mais vaga
            statusDeVaga =  "lotado";
        }

        return statusDeVaga;
    }

    /**
     * 3.1 Hotel:
     * Descrição
     * Fazer um programa que grave a quantidade de hospedes de um hotel, e a cada novo hospede
     * devolver a situação da capacidade do hotel, e o nome de todos os hospedes do hotel, seeee
     * o Hotel, já estiver lotado, passsar os nomes de todos os hospedes, exceto, o que nao conseguiu
     * entrar
     * Hotel com até 2 hospedes, Devolver, com vagas
     * Hotel com mais de 2 hospedes e até 5, Devolver, com poucas vagas
     * Hotel com 5 hospedes, Devolver, lotado
     *
     * Retorno status - nomes
     * Ex: com vagas - joao
     * Ex: com vagas - joao, maria
     */
    String nomes = "";
    int quantidadeHospedes = 0;
    public String darEntradaNoHotelEDevolverSituacaoMaisNomeDosHospedes(String nomeHospede){
        String statusDeVaga = "";
        if(quantidadeHospedes < 5){
            // ainda tenho vaga
            nomes = nomes + nomeHospede + ", ";
            quantidadeHospedes = quantidadeHospedes + 1;
            if(quantidadeHospedes <= 2){
                statusDeVaga = "com vagas";
            }
            else{
                statusDeVaga =  "com poucas vagas";
            }
        }
        else{ // nao tenho mais vaga
            statusDeVaga =  "lotado";
        }
        return "Status: " + statusDeVaga + " - Nomes: " + nomes;
    }

    /**
     * 4 Transito
     * Descrição:
     * Fazer um programa que voce passe a velocidade máxima da pista para um CARRO,
     * a sua velocidade atual, e o tipo de veiculo que voce esta, e ele retorne se o veiculo
     * está ou nao dentro da velocidade permitida.
     * tipos de veiculos: moto, carro, caminhao
     *
     * Observaçõa importante: Para fazer esse exercicio, considere, que uma moto pode andar 20%
     * acima da velocidade de um carro, e um caminhao deve andar 50% abaixo da velocidade de um carro
     *
     * Tipos dos veículos,
     * 1 para carro
     * 2 para caminhao
     * 3 para moto
     *
     * Retorno: Dentro da velocidade permitida, ou Fora da velocidade permitida
     */

    public String verificarVelocidadePermitida(Double velocidadeMaximaParaCarro, Double velocidadeAtual,
                                               int tipoVeiculo){
        final int tipoCarro = 1;
        final int tipoCaminhao = 2;
        final int tipoMoto = 3;

        final double percentualPermitidoCaminhao = 0.5;
        final double percentualPermitidoMoto = 1.2;


        if(tipoVeiculo == tipoCarro){
            if(velocidadeAtual > velocidadeMaximaParaCarro){
                return "Fora da velocidade permitida";
            }
            else{
                return "Dentro da velocidade permitida";
            }
        }
        else if(tipoVeiculo == tipoCaminhao){
            if(velocidadeAtual > velocidadeMaximaParaCarro * percentualPermitidoCaminhao){
                return "Fora da velocidade permitida";
            }
            else{
                return "Dentro da velocidade permitida";
            }
        }
        else if(tipoVeiculo == tipoMoto){
            if(velocidadeAtual > velocidadeMaximaParaCarro * percentualPermitidoMoto){
                return "Fora da velocidade permitida";
            }
            else{
                return "Dentro da velocidade permitida";
            }
        }

        return "Não foi possível validar";
    }

    /**
     * Faça um programa que seja capaz de calcular e retornar a área de um retangulo
     * área = base * altura
     */
    public double calcularArea(double base, double altura){
        return base * altura;
    }

    /**
     * Faça um programa que calcule e retorne a soma dos numeros:
     * (A * B) / C
     */

    public double calcularValores(double a, double b, double c){
        return (a * b) / c;
    }

    /**
     * Faça um programa que receba dois números inteiros, faça a soma, e retorne exatamente essa frase:
     * Eu Sou um programador, e a soma desses números é: (colocar aqui o valor da soma)
     */
    public String somarERetornar(int a, int b){
        int resultado = a + b;
        return "Eu Sou um programador, e a soma desses números é: " + resultado;
    }

    /**
     * Faça um programa que receba dois numeros inteiros, CONCATENE os dois, e retorne
     * Ex, se passar 1 e 2, tem que retornar "12
     */
    public String concatenarDoisNumerosInteiros(int numero1, int numero2){
        String textReferenteNumero1 = String.valueOf(numero1);
        return  textReferenteNumero1 + numero2;
    }


    /**
     * Faça um programa que receba a largura e comprimento de um terreno,
     * verifique e retorne quantos comodos com valores 5 m2 é possível ter dentro desse terreno
     * Obs. retorno TEM QUE SER  inteiro
     */
    public int calcularQuantidadeComodos(double largura, double comprimento){
        double resultado = largura * comprimento;

        double quantidadeComodos = resultado / 5;
        return (int) quantidadeComodos;
    }

    /**
     * Faça um programa que passe tres variaveis do tipo double, calcule o resultado da operação
     * e retorne somente a parte inteira da operação
     * operação = A dividido por B, multiplicado C
     */

    /**
     ** Faça um programa que você passe, o nome de 3 Substancias quimicas, e a concentração de cada substancia
     * e retorne a string formatada, ex: "Substancia X, com concencentração Y%"
     * Entrada:
     * Substancia quimica: "Ácido"
     * Concentração: 65
     *
     * Retorno:
     *
     * "Substancia Ácido, com concencentração 65%"
     */

    /**
     * Faça um programa que seja capaz de calcular a área de uma construção
     * Se a área for até 20 metros, retornar: "Insuficiente para construção"
     * Se a área for maior que 20 até 50 metros, retornar: "Possível construir uma casa pequena"
     * Se a área for maior 50 metros, retornar: "Possível construir uma casa grande"
     *
     * Obs: área = base * altura
     */


}
