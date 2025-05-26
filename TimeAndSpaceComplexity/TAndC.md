# Time and Space Complexity in Algorithms

Understanding time and space complexity is crucial for analyzing the efficiency of algorithms. These concepts help us evaluate how an algorithm performs as the size of the input data grows.

---

## Time Complexity

**Time complexity** measures the amount of time an algorithm takes to complete as a function of the length of the input. It is commonly expressed using Big O notation, which describes the upper bound of the running time.

### Common Time Complexities

- **O(1) – Constant Time:**  
    The algorithm takes the same amount of time regardless of input size.
    ```java
    // Accessing an element in an array
    int getFirst(int[] arr) {
            return arr[0];
    }
    ```

- **O(n) – Linear Time:**  
    The running time increases linearly with the input size.
    ```java
    // Summing elements in an array
    int sum(int[] arr) {
            int total = 0;
            for (int num : arr) {
                    total += num;
            }
            return total;
    }
    ```

- **O(n^2) – Quadratic Time:**  
    The running time increases quadratically with the input size.
    ```java
    // Printing all pairs in an array
    void printPairs(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr.length; j++) {
                            System.out.println(arr[i] + ", " + arr[j]);
                    }
            }
    }
    ```

- **O(log n) – Logarithmic Time:**  
    The running time increases logarithmically with the input size.
    ```java
    // Binary search in a sorted array
    int binarySearch(int[] arr, int target) {
            int left = 0, right = arr.length - 1;
            while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (arr[mid] == target) return mid;
                    else if (arr[mid] < target) left = mid + 1;
                    else right = mid - 1;
            }
            return -1;
    }
    ```

### Best, Worst, and Average Case

- **Best Case:** Minimum time required.
- **Worst Case:** Maximum time required.
- **Average Case:** Expected time over all inputs.

---

## Space Complexity

**Space complexity** measures the amount of memory an algorithm uses as a function of the input size.

### Example

- **O(1) – Constant Space:**  
    The algorithm uses a fixed amount of space.
    ```java
    int sum(int[] arr) {
            int total = 0;
            for (int num : arr) {
                    total += num;
            }
            return total;
    }
    ```

- **O(n) – Linear Space:**  
    The space used grows linearly with input size.
    ```java
    int[] copyArray(int[] arr) {
            int[] copy = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                    copy[i] = arr[i];
            }
            return copy;
    }
    ```

---

## Why Time and Space Complexity Matter

- **Efficiency:** Helps choose the most efficient algorithm for a problem.
- **Scalability:** Ensures the algorithm works well with large inputs.
- **Resource Management:** Optimizes use of time and memory.

---

## Summary Table

| Complexity | Time Example         | Space Example        |
|------------|---------------------|---------------------|
| O(1)       | Array access        | Variable assignment |
| O(n)       | Linear search       | Array copy          |
| O(n^2)     | Bubble sort         | 2D array            |
| O(log n)   | Binary search       | Recursive stack     |

---

Understanding these concepts is fundamental for writing efficient and scalable code.