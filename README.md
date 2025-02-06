# Java ArrayIndexOutOfBoundsException Bug

This repository demonstrates a common Java programming error: the `ArrayIndexOutOfBoundsException`.  The `bug.java` file contains code that throws this exception.  The `bugSolution.java` file provides a corrected version.

## The Bug
The bug arises from attempting to access an array element using an index that is out of bounds.  Java arrays are zero-indexed, so a valid index for an array of size N ranges from 0 to N-1.

## The Solution
The solution involves carefully checking the index before accessing an array element.  Bounds checking prevents the exception and ensures program robustness.

This example serves as a reminder of the importance of proper array indexing in Java.