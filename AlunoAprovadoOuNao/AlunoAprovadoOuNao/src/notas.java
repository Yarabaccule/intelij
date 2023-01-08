import java.util.Scanner;

public class notas {
    public static void main(String args[]) {
        Scanner f = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        Scanner t = new Scanner(System.in);
        Scanner fo = new Scanner(System.in);

        System.out.println("Qual é a primeira sua nota?");
        double first = f.nextInt();
        System.out.println("Qual é a segunda sua nota?");
        double second = s.nextInt();
        System.out.println("Qual é a terceira sua nota?");
        double third = t.nextInt();
        System.out.println("Qual é a quarta nota sua nota?");
        double fourth = fo.nextInt();

        double notaFinal = (first + second + third + fourth) / 4;

        if (notaFinal >= 6) {
            System.out.println("Você foi aprovado, sua nota final é " + notaFinal);
        } else if (notaFinal == 5){
            System.out.println("Você esta de recuperação, sua nota final é " + notaFinal);
        } else {
            System.out.println("Você esta reprovado, sua nota final é " + notaFinal);
        }
    }
}
