// façaum programa que leia tres valores e leia dentre eles o maior.
import  java.util.Scanner;
public class Ex05 {
    public static void main(String [] args){
      
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Digite 3 valores: ");
        System.out.println("Numero 1: ");
        int n1 = sc.nextInt();
        System.out.println("Numero 2: ");
        int n2 = sc.nextInt();
        System.out.println("Numero 3: ");
        int n3 = sc.nextInt();
        
        int aux = 0;
        
     /* if(n1 > n2){
          if(n1 > n3){
            aux = n1;
          }else{
            aux = n3;          
          }
      
      }else{
         if(n2 > n3){
            aux = n2;
         }else{
            aux = n3;
         }
             
         }*/
      
     if(n1 >=  n2 && n1 >= n3){
        aux = n1;
     }else if(n2 >= n1 && n2 > n3){
        aux = n2;   
    }else{
        aux = n3;
     }
     System.out.println("O maior numero é : "+aux);
}
}
