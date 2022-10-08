There are currently both Java and JavaScript implementations of the same functionality.

If asked to implement a 4 variable min function with a 8:1 MUX then this program will compute which values to connect to the 8 inputs of the MUX.

E.g. the function F(a,b,c,d) = Σm(0,4,5,8,9,12,13,14,15) is the one being computed by default. Simply change the `minterms` array to include the desired minterm set to get the input values for the desired function.

A table describing the same functionality as the program with the same default minterms:

![image](https://user-images.githubusercontent.com/83474789/194688430-72481109-1d4d-420b-82fb-7f73fba886fb.png)

A schematic designed using the program output:

![image](https://user-images.githubusercontent.com/83474789/194688443-2d1ea869-b820-48ed-96a2-ed8676938841.png)
