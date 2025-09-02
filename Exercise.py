import time

"""
Calcula el número de Fibonacci en la posición n

o La implementación Big(O) asociada es: O(n) porque este ciclo se repite n veces
    lo que significa que crece de manera proporcional al tamaño de la entrada.

o  Operación dominante: la suma 'a + b'.
    Esa suma se repite dentro del bucle tantas veces como el valor de n.
"""

def fibonacci(n):
    a, b = 0, 1

    # El bucle se repite n veces
    # Cada vuelta realiza la suma "a + b" (operación dominante)
    for _ in range(n):
        a, b = b, a + b
    return a

# Entrada por teclado
n = int(input("Ingresa un valor para n: "))

# Medición del tiempo de ejecución
inicio = time.perf_counter_ns()
print(f'El número de Fibonacci para {n} es: {fibonacci(n)}')
fin = time.perf_counter_ns()

# Conversión de nanosegundos a segundos
duracion = (fin -inicio)/1000000000.0

print("La duracion total es: ", duracion)

