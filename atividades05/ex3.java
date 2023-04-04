package atividades05;

/*Reproduza em algoritmo em java os pseudocodigos que estao em a, b,c,d,e,f*/
public class ex3 {
    public static void main(String[] args){
       a();
       System.out.println();
       b();
       System.out.println();
       c(); 
       System.out.println();
       d(); 
       System.out.println();
       e(); 
       System.out.println();
       f(); 
    }
    
    public static void a(){
         int a = 10;
        int b = 20;
        System.out.println(b);
        b = 5;
        System.out.println(a+" , "+b);
    }
    
    public static void b(){
        int a = 30;
        int b = 20;
        int c = a+b;
        System.out.println(c);
        b = 10;
        System.out.println(b+" , "+c);
        c = a + b;
        System.out.println(a+" , "+b+" , "+c);
    }
    
    public static void c(){
        int a = 10;
        int b = 20;
        int c = a;
        b = c;
        a = b;
        System.out.println(a+" , "+b+" , "+c);
    }
    
    public static void d(){
        int a = 10;
        int b = a + 1;
        a = b + 1;
        b = a + 1;
        System.out.println(a);
        a = b + 1;
        System.out.println(a+" , "+b);
    }
    
    public static void e(){
        int a = 10;
        int b = 20;
        int c = a;
        b = c;
        a = b;
        System.out.println(a+" , "+b+" , "+c);
    }
    
    public static void f(){
        int x = 1;
        int y = 2;
        int z = y + x;
        System.out.println(z);
        x = 5;
        y = x + z;
        System.out.println(x+" , "+y+" , "+z);
    }
}
