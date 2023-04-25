
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SepararValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite os nomes separados por virgula: ");
        String nomesStr = sc.nextLine();
        String[] nomes = nomesStr.split(",");
        Arrays.sort(nomes);
        System.out.println("Nomes em ordem alfabetica: " + Arrays.toString(nomes));
        
        System.out.println("Digite os nomes e sexos separados por traco: ");
        String nomesSexosStr = sc.nextLine();
        String[] nomesSexos = nomesSexosStr.split(",");
        List<String> feminino = new ArrayList<>();
        List<String> masculino = new ArrayList<>();
        for (String nomeSexo : nomesSexos) {
            String[] dados = nomeSexo.split(" - ");
            if (dados[1].equals("F")) {
                feminino.add(dados[0]);
            } else if (dados[1].equals("M")) {
                masculino.add(dados[0]);
            }
        }
        System.out.println("Grupo feminino: " + feminino);
        System.out.println("Grupo masculino: " + masculino);
        
        sc.close();
    }
}


