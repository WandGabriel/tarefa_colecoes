import java.util.*;

public class Main {
    public static void main(String[] args) {

        String textoInicialComNomes;
        String[] separacaoDosNomes;

        List<String> listaNomes = new ArrayList<>();

        exibirMensgemInicial();
        Scanner entradaDeDados = new Scanner(System.in);
        textoInicialComNomes = entradaDeDados.nextLine();

        separacaoDosNomes = textoInicialComNomes.split(", ");

        for (int i = 0; i < separacaoDosNomes.length; i++) {
            Pessoa pessoa = new Pessoa(separacaoDosNomes[i]);
            listaNomes.add(pessoa.getNome());
        }

        Collections.sort(listaNomes);
        System.out.println(listaNomes);

    }
    private static void exibirMensgemInicial() {
        System.out.println("Digite quantos nomes quiser separados por vírgula ( , )!");
        System.out.print("Nomes: ");
    }
}