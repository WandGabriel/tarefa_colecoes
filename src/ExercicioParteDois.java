import java.util.*;

public class ExercicioParteDois {
    public static void main(String[] args) {

        String textoInicialComNomesESexo;
        String[] separacaoDosNomes;

        List<String> nomesMasculino = new ArrayList<String>();
        List<String> nomesFeminino = new ArrayList<String>();

        System.out.println("Digite quantos nomes e sexo quiser separado por vírgula ( , ) seguindo o seguinte modelo: ");
        System.out.print("nome - sexo: ");
        Scanner entradaDeDados = new Scanner(System.in);
        textoInicialComNomesESexo = entradaDeDados.nextLine();

        separacaoDosNomes = textoInicialComNomesESexo.split(", ");

        for (String pessoas : separacaoDosNomes) {
            String[] separacao = pessoas.split(" - ");
            if (separacao[1].equalsIgnoreCase("Feminino")){
                nomesFeminino.add(separacao[0].trim());
            } else {
                nomesMasculino.add(separacao[0].trim());
            }
        }

        System.out.println("------- Nomes Masculino ------- ");
        System.out.println("Quantidade de Nomes: " + nomesMasculino.size());
        for (String nomeMasculino : nomesMasculino) {
            System.out.println(nomeMasculino);
        }

        System.out.println(" ");
        System.out.println("------- Nomes Feminino ------- ");
        System.out.println("Quantidade de Nomes: " + nomesFeminino.size());
        for (String nomeFeminino : nomesFeminino) {
            System.out.println(nomeFeminino);
        }

    }
}
