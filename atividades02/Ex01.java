import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int n1 = sc.nextInt();
        
        if(n1 >= 10){
             System.out.println("O numero é maior que 10");
        }
    }
}
