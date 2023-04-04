import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite os lados de um triangulo: ");
        System.out.println("Lado 1: ");
        int l1 = sc.nextInt();
        System.out.println("Lado 2: ");
        int l2 = sc.nextInt();
        System.out.println("lado 3: ");
        int l3 = sc.nextInt();
        
        if(l1 + l2 < l3 && l3 + l1 < l2 && l3 + l2 < l1){
        
            System.out.println("Os valores digitados é um triangulo.");
        }else {
            System.out.println("Digite um valor validopara haver um triangulo!!!!!");
        }
        
        
                
    }
}
