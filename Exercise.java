import java.util.Scanner; 

/**
 Calcula el número de Fibonacci en la posición n.

 o La implementación Big(O) asociada es: O(n) porque este ciclo se repite n veces
    lo que significa que crece de manera proporcional al tamaño de la entrada.

 o La operación dominante es la suma dentro del bucle for 'c = a + b;''
    porque es la que más se repite.
**/

public class Exercise{ 

    public static long fibonacci(int n) {         
        if (n <= 1) return n;  // Comparación y retorna constante O(1)
        long a = 0, b = 1, c = 0;
        
        // Complejidad: O(n)
        for (int i = 2; i <= n; i++) {  // Bucle principal: se ejecuta (n-1) veces O(n)
            c = a + b;  // Operación dominante Suma 
            a = b;  // Asignación constante O(1)
            b = c;  // Asignación constante O(1)
        }
        return b; // Retorno del resultado O(1)
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