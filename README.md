There are currently both Java and JavaScript implementations of this project. The Java implementation has more functionality. The JavaScript implementation assumes a 4 variable min function being mapped to a 8:1 MUX. The Java implementation can work with various other variable amounts. It reads the variable count and minterms from a text file (input1.txt by default) and computes which values to connect to which inputs for the smallest single MUX that can handle that many variables.

E.g. the function F(a,b,c,d) = Σm(0,4,5,8,9,12,13,14,15) is the one being computed by default.

The program output given the above minterms and a variable count of 4:

![image](https://user-images.githubusercontent.com/83474789/194729857-b129384b-d759-4417-90ae-2fe5b0de29f6.png)

A table describing the same functionality as the program with the same minterms:

![image](https://user-images.githubusercontent.com/83474789/194688430-72481109-1d4d-420b-82fb-7f73fba886fb.png)

A schematic of a MUX with inputs mapped as described by the program output:

![image](https://user-images.githubusercontent.com/83474789/194688443-2d1ea869-b820-48ed-96a2-ed8676938841.png)
