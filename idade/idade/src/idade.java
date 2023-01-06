public class idade {

    public static void main(String args[]) {

        //Boxing
        Boolean status;
        Integer idade = 32;

        if(idade >= 18){
            status = true;
            System.out.println(status);
            System.out.println("Você tem " + idade + " anos então você pode dirigir");

        }else{
            status = false;
            System.out.println("Você tem " + idade + " anos então você não pode dirigir");
        }
    }
}
