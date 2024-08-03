public class MinhaClasse {

    public static void main(String[] args) {

        // Declaração inválida de variáveis
        // int numero&um = 1;
        // int 1numero = 1;
        // int numero um = 1;
        // int long = 1;

        // Declaração válida de variáveis
        int numero$um = 1;
        int numero1 = 1;
        int numeroum = 1;
        int longo = 1;

        // Estrutura - Tipo NomeBemDefinido = Atribuicao (opcional em alguns casos)
        int idade = 55;
        double altura = 1.75;
        // Dog spike; // variável spike não tem valor.

        // Estrutura - TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)
        //int somar (int numeroUm, int numero2)
        //String formatarCep (long cep)


        String primeiroNome = "Pedro";
        String segundoNome = "Coutinho";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println("Olá, seja bem-vindo!");
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
