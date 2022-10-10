There are currently both Java and JavaScript implementations of this project. The Java implementation has more functionality. The JavaScript implementation assumes a 4 variable min function being mapped to a 8:1 MUX, but the Java implementation can work with other variable counts. It reads the variable count and minterms from a text file (input1.txt by default) and computes which values to connect to which inputs for the smallest single MUX that can handle that many variables.

E.g. the function F(a,b,c,d) = Σm(0,4,5,8,9,12,13,14,15) is the one being computed by default. The default function from input2.txt is F(x,y,z) = Σm(0,1,5,6,7).

The program output given the minterms and variable count from input1.txt (note: it uses `x` and `x'` to represent the variable being mapped to the input lines):

![image](https://user-images.githubusercontent.com/83474789/194729987-6c292f0d-039e-403e-906f-b9b1c1d79c4b.png)

A table describing the same functionality as the program with the same minterms:

![image](https://user-images.githubusercontent.com/83474789/194688430-72481109-1d4d-420b-82fb-7f73fba886fb.png)

A schematic of a MUX with inputs mapped as described by the program output:

![image](https://user-images.githubusercontent.com/83474789/194688443-2d1ea869-b820-48ed-96a2-ed8676938841.png)
