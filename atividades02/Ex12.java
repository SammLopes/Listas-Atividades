import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        System.out.println("Ele tem que ser inteiro: ");
        int n1 = sc.nextInt();
        
        if(n1 > 0 && n1 < 10){
           if(n1 == 1){
            System.out.println("Um");
           }else if(n1 == 2){
               System.out.println("Dois");
           }else if(n1 == 3){
                 System.out.println("Tres");
           }else if(n1 == 4){
                   System.out.println("Quatro");
           }else if(n1 == 5){
                   System.out.println("Cinco");
           }else if(n1 == 6){
                   System.out.println("Seis");  
           }else if(n1 == 7){
                  System.out.println("Sete");
           }else if(n1 == 8){
                  System.out.println("Oito");
           }else if(n1 == 9){
                  System.out.println("Nove");
           }
        }else{
            System.out.println("Digite um numero entre 0 e 10");
       }
                
        
    }
}
