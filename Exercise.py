from typing import List
import random
import time

def perform_cubic_operation(three_dimensional_array: List[List[List[int]]]): # O(1)
    n = len(three_dimensional_array) # O(1)

    for i in range(n): # O(n)
        for j in range(n): # O(n)
            for k in range(n): # O(n)
                three_dimensional_array[i][j][k] += 1 # O(1)

def read_input():
    while True:
        try:
            return int(input("Enter dimension size (n): "))
        except ValueError:
            print("Please enter a number.")
        except KeyboardInterrupt:
            exit()

def main():
    n = read_input()

    three_dimensional_array = [[[random.randint(1, 100) for _ in range(n)] for _ in range(n)] for _ in range(n)]

    start_time = time.perf_counter()

    perform_cubic_operation(three_dimensional_array)

    end_time = time.perf_counter()
    duration = end_time - start_time

    print(f"Execution time: {duration:.4f} seconds.")

if __name__ == "__main__":
    main()