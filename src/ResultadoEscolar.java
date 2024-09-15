public class ResultadoEscolar {
    public static void main(String[] args) {
        /*
         * Condicionais Composta
         * Algumas vezes o nosso programa deverá seguir mais de uma jornada de execução
         * condionado a uma regra de negócio,
         * este cenário é demoninado Estrutura Condicional Composta.
         */
        int nota = 6;

        if (nota >= 7)
            System.out.println("Aprovado");
        /*
         * Condicionais encadeadas
         * Em um controle de fluxo condicional, nem sempre nos limitamos ao se (if) e
         * senão (else),
         * poderemos ter uma terceira, quarta e ou inúmeras condições.
         */
        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");
    }
}
