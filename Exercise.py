import time

def fibonacci(n):
    a, b = 0, 1
    for _ in range(n):
        a, b = b, a + b
    return a

n = int(input("Ingresa un valor para n: "))

inicio = time.perf_counter_ns()
print(f'El número de Fibonacci para {n} es: {fibonacci(n)}')
fin = time.perf_counter_ns()

duracion = (fin -inicio)/1000000000.0

print("La duracion total es: ", duracion)

