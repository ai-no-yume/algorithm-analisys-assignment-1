import time

"""
Calcula el número de Fibonacci en la posición n

o La notación Big(o) asociada es:O(2^n) porque cada llamada a fibonacci(n) genera dos nuevas llamadas recursivas:
    fibonacci(n-1) y fibonacci(n-2). De forma que crece de manera exponencial.

o La operación dominante es la llamada recursiva: fibonacci(n-1) + fibonacci(n-2)
    porque es la que más veces se repite y provoca un gran aumento en el número de operaciones.   
"""

def fibonacci(n):
    if n <=1: return n # Comparación y retorna constante O(1).
    return fibonacci(n - 1) + fibonacci(n - 2) # Operación dominante O(2^n).

# Entrada por teclado
n = int(input("Ingresa un valor para n: "))

# Medición del tiempo de ejecución
inicio = time.perf_counter_ns()
print(f'El número de Fibonacci para {n} es: {fibonacci(n)}')
fin = time.perf_counter_ns()

# Conversión de nanosegundos a segundos
duracion = (fin -inicio)/1000000000.0

print("La duracion total es: ", duracion)

