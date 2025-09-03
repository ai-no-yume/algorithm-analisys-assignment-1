import java.util.Scanner; 

/**
Calcula el número de Fibonacci en la posición n

o La notación Big(o) asociada es: O(2^n) debido a que en cada llamada a fibonacci(n), 
    la función realiza dos llamadas adicionales a sí misma: ‘fibonacci(n-1)’ y ‘fibonacci(n-2)’.  
    De forma que crece de manera exponencial.

o La operación dominante es la llamada recursiva: fibonacci(n-1) + fibonacci(n-2)
    porque es la que más veces se repite y provoca un gran aumento en el número de operaciones.    
**/

public class Exercise{ 
    public static int fibonacci(int n) { 
        if (n <= 1) return n; // Comparación y retorna constante O(1).
        return fibonacci(n - 1) + fibonacci(n - 2); // Operación dominante O(2^n).
    }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Ingresa un valor para n: "); 
        int n = sc.nextInt(); 
        
        // Medición del tiempo de ejecución
        long inicio = System.nanoTime();
        System.out.println("El número de Fibonacci para " + n + " es: " + fibonacci(n)); 
        long fin = System.nanoTime() ;
        
        // Conversión del tiempo de nanosegundos a segundos
        double duracion = (fin -inicio)/1000000000.0;
        
        System.out.println("La duracion total es: " + duracion); 
        
    } 
    
}