import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    
		Scanner genero = new Scanner(System.in);
      
        char sexo;
         
        System.out.println("Digite seu sexo: (M ou F)");
        sexo = genero.next().charAt(0);
        sexo = Character.toUpperCase(sexo);
    
        switch(sexo){
          case 'F':
           System.out.println("Que legal voce e do sexo Feminino");
           break;
          case 'M':
                      System.out.println("Que legal voce e do sexo Masculino");
           break;
	     }
     }	
}
