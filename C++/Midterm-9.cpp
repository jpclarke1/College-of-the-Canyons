/* Midterm  #9
* Source Code File: Midterm-9.cpp  
* Programmer: Joshua Clarke
* Description: Midterm-9 is all of the code for Midterm exercise 9, it takes user inputted values for the voltage,
* resistance (in ohms), RC constant, and time (in seconds) after a switch is closed in a circuit consiting of a 
* battery, resistor, and a switch connected in series. The program then outputs the current flowing through the 
* circut in amps Functions aren't used and calculations for different circuts cannot be made without restarting 
* the program (as the program doesn't loop) as per instructions.
*/  

#include <iostream>
#include <math.h>

int main()
{
const double EULER = 2.71828;
double voltage;
double resistor;
double RC;
double t;
double current;

//user input is requested for each value 
std::cout << "Enter values for a circuit consisting of a battery connected in series to a switch, a resistor, and a capacitor to calculate current\n";
std::cout << "Enter the voltage of the battery: \n";
std::cin >> voltage;
std::cout << "Enter the value of the resistor in ohms: \n";
std::cin >> resistor;
std::cout << "Enter the system's time constant: \n";
std::cin >> RC;
std::cout << "Enter the time in seconds after the switch is closed: \n";
std::cin >> t;

//user inputted values are plugged into given formula
current = (voltage/resistor)*pow(EULER, (-t)/RC);

std::cout << "The current flowing through the circut is " << current << " A";

return 0;
}