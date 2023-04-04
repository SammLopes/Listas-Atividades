import java.util.Scanner;
public class Ex09 {
    public static void  main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu salario: ");
        double sal = sc.nextDouble();
        
        if(sal <= 600){
          System.out.println("Voçe é isento");
        }else if(sal > 600 && sal <= 1200){
            System.out.println("Voçe tem 20% de desconto");
        }else if(sal > 1200 && sal <=2000){
            System.out.println("Voçe tem 25% de desconto");
        }else{
            System.out.println("Voçe tem 30% de desconto");
        }
    }
}
