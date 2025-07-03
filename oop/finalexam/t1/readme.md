# List Processor Program

## Overview

The **List Processor Program** processes two lists, `list1` (containing integers) and `list2` (containing strings), and follows a series of operations to generate a new list, `list3`. The program performs the following steps:

1. **List Creation**: It iterates over `list1`, adds 1 to each element, and uses the sum to find the corresponding value in `list2`. It concatenates the value from `list2` with the original value from `list1` and stores this result in `list3`.
2. **Filtering**: Once `list3` is generated, the program filters out values at indices in `list1`. The program removes any entry in `list3` where the index corresponds to any value in `list1`.
3. **Error Handling**: The program also includes error handling to ensure that no invalid indices are used in the process, either when creating `list3` or during filtering.

---

## Algorithm

1. **Creating `list3`**:
   - For each value in `list1`, the program adds 1 to it.
   - The resulting sum is used to get the value at the corresponding index in `list2`.
   - The value from `list2` at the calculated index is concatenated with the original value from `list1` and stored in `list3`.
   - If the resulting sum exceeds the size of `list2`, an error message is displayed.

2. **Filtering `list3`**:
   - After `list3` is created, the program filters out the elements whose indices are present in `list1`.
   - The program checks each index in `list3` and removes the entries where the index is found in `list1`.

3. **Error Handling**:
   - The program checks if any value from `list1` results in an invalid index (e.g., out of bounds) while accessing `list2`.
   - The program also ensures that no indices from `list1` that are out of bounds of `list3` are used during the filtering process.
   - If any error occurs (invalid sum or index), an appropriate error message is printed to the console.

---

## Error Handling

The program implements the following error-handling mechanisms:

1. **Out of Bounds Error for `list2`**:
   - If the sum (which is the value from `list1` plus 1) exceeds the bounds of `list2`, an error message is printed indicating that the sum is out of bounds for `list2`.
   - Example: If `list1[i] + 1` results in an index greater than the last valid index of `list2`, the program will print an error message:  
     `Error: Value [sum] is out of bounds for list2.`

2. **Out of Bounds Error for `list3` During Filtering**:
   - During the filtering phase, the program checks if any index from `list1` exceeds the size of `list3`.
   - If an invalid index is found in `list1` during filtering, an error message is printed:  
     `Error: Index [index] is out of bounds for list3.`

3. **Graceful Error Handling**:
   - Errors do not cause the program to crash; instead, they are reported as error messages, and the program continues its execution.
   - This ensures the program remains robust and doesn't stop unexpectedly due to invalid input or index errors.

![img](https://github.com/CSelenetvauri/oopFINAL/oop/finalexam/t1/error.PNG "text")


---

## Example

### Input

```java
int[] list1 = {5, 1, 9, 4, 8, 6, 7, 10, 2, 3};
String[] list2 = {"zau", "njt", "jdp", "ptm", "peq", "pbo", "ltd", "tud", "zew", "nnt", "ojq", "ade"};
```

### Output (before filtring)
```java
list3 before filtering:
ltd5
jdp1
ojq9
pbo4
nnt8
tud6
zew7
ade10
ptm2
peq3
```


### Output (after filtring)
```java
list3 after filtering:
ltd5
```

### Error Messages
```java
Error: Value 10 is out of bounds for list2.
Error: Index 10 is out of bounds for list3.
```

## How to Run the Program

1. **Clone or Download the Repository**:

   * Clone or download the project from the repository.

2. **Set Up the Project**:

   * Ensure you have a Java environment set up. The program is written in Java and should work with any modern Java version (e.g., Java 8 and above).

3. **Compile and Run**:

   * Open a terminal/command prompt in the project directory.

   * Compile the program:

       ```bash
       javac ListProcessor.java
       ```

   * Run the program:

       ```bash
       java ListProcessor
       ```

4. **View the Output**:

   * The program will print `list3` before and after filtering to the console, as well as any error messages if the sums or indices are out of bounds.

---

## Project Structure

1. ListProcessor.java      - Main program file containing the logic.
2. readme.md              - This readme file.


---

## License

This project is licensed under the MIT License - see the LICENSE file for details.

---

## Authors

* **Elene Tvauri** - Initial work and implementation.
