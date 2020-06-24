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
    public int descobrirCodigoGravidade(String descricaoGravidade){
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
     * Hotel com até 2 hospedes, Devolver, com vagas
     * Hotel com mais de 2 hospedes e até 5, Devolver, com poucas vagas
     * Hotel com 5 hospedes, Devolver, lotado
     */
    public String darEntradaNoHotelEDevolverSituacao(String nomeHospede){
        return null;
    }

    /**
     * 3.1 Hotel:
     * Descrição
     * Fazer um programa que grave a quantidade de hospedes de um hotel, e a cada novo hospede
     * devolver a situação da capacidade do hotel, e o nome de todos os hospedes do hotel
     * Hotel com até 2 hospedes, Devolver, com vagas
     * Hotel com mais de 2 hospedes e até 5, Devolver, com poucas vagas
     * Hotel com 5 hospedes, Devolver, lotado
     */
    public String darEntradaNoHotelEDevolverSituacaoMaisNomeDosHospedes(String nomeHospede){
        return null;
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
     * Retorno: Dentro da velocidade permitida, ou Fora da velocidade permitida
     */
    public String verificarVelocidadePermitida(Double velocidadeMaximaParaCarro, Double velocidadeAtual,
                                               int tipoVeiculo){
        return null;
    }
}
