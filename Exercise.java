import java.util.Scanner; 

public class Exercise{ 
    public static int fibonacci(int n) { 
        if (n <= 1) return n; 
        return fibonacci(n - 1) + fibonacci(n - 2); 
        
    } 
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Ingresa un valor para n: "); 
        int n = sc.nextInt(); 
        
        long inicio = System.nanoTime();
        System.out.println("El número de Fibonacci para " + n + " es: " + fibonacci(n)); 
        long fin = System.nanoTime() ;
        
        double duracion = (fin -inicio)/1000000000.0;
        
        System.out.println("La duracion total es: " + duracion); 
        
    } 
    
}