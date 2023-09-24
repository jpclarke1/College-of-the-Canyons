/* Midterm  #6
* Source Code File: Midterm-6.cpp  
* Programmer: Joshua Clarke
* Description: Midterm-9 is all of the code for Midterm exercise 6, it takes user inputted values for the temperature (in C)
* and velocity of water running through a pipe of user inputted diameter (in either SI or Imperial units). The program then 
* finds the viscosity of water based on the temperature and outputs Reynolds number for the system. Currently only 5, 10, and
* 15 degrees Celsius are accepted as values for temp as no other viscosities are given. Program also does not make use of a loop
* so it can only check for invalid temp input once.  
*/  

#include <iostream>
#include <math.h>

int main()
{
double velocity; 
int temp = 0;
double diameter;
double viscosity;
double reynold;

//user input is requested for each value 
std::cout << "Enter either SI or Imperial values for the flow of water through a pipe to determine the Reynolds number (please keep chosen unit system consistent throughout)\n";
std::cout << "Enter the value closest to temperature of the water in Celsius (either 5, 10, or 15): \n";
std::cin >> temp;
if (temp != 5||10||15) {
std::cout << "error please enter only 5, 10, or 15\n";
std::cin >> temp;
}
std::cout << "Enter the diameter of the pipe in m or ft: \n";
std::cin >> diameter;
std::cout << "Enter the velocity of water flowing through the pipe in m/s or ft/s: \n";
std::cin >> velocity;

//switch case statement to determine viscosity based on water temp
switch(temp) {
   case 5:
      viscosity = 1.49e-6;
      break;
   case 10:
      viscosity = 1.31e-6;
      break;
   case 15:
      viscosity = 1.15e-6;
      break;
}

//calculation and output of reynolds number for the system
reynold = (velocity * diameter)/viscosity;
std::cout << "The Reynolds number for this system is ~ " << reynold;
return 0;
}