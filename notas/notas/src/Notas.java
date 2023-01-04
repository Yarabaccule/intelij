public class Notas {
    public static void main(String args[]){
        notasAtuais();
    }

    private static void notasAtuais() {
        int nota1 = 7;
        int nota2 = 8;
        int nota3 = 10;
        int nota4 = 7;

        int nota = (nota1  + nota2 + nota3 + nota1)/4;

        System.out.println("Sua nota final é: " + nota);
    }
}
