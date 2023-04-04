import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite tres numero: ");
        System.out.println("Numero 1: ");
        int n1 = sc.nextInt();
        System.out.println("Numero 2: ");
        int n2 = sc.nextInt();
        System.out.println("Numero 3: ");
        int n3 = sc.nextInt();
        
        int aux = 0;
                
        if(n3 < n2){
          aux = n3;
          n3 = n2;
          n2 = aux;
        }
        if(n2 < n1){
           aux = n2;
           n2 = n1;
           n1 = aux;
        }
        if(n3 < n2){
           aux = n3;
           n3 = n2;
           n2 = aux;
        }
        System.out.println(n1+","+n2+","+n3);
    }
}
