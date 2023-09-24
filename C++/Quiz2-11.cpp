/* Quiz 2  #11
* Source Code File: Quiz2-11.cpp  
* Programmer: Joshua Clarke
* Description: Quiz 2-11 is all of the code for Quiz 2 exercise 11, It finds the mimimum radius in inches 
* of a cylindrical rod of a length in inches needed to support a weight in lbs and stress in lbs/in^2. All values are 
* hardcoded, program does not accept user inputed values as per instructions.
*/  

#include <iostream>
#include <math.h>

//hardcoded values for a 7in cylindrical bike rod that needs to support 300lbs and 10,000 lbs/in^2 of stress
double pWeight = 300; 
double length = 7;
double bikeStress = 10000; 

//function that calculates minimum radius of cylindrical rod
double radius (double weight, double length, double stress)
{
    double r = (std::cbrt((length*weight)/(M_PI*stress)));
    return r;
}

int main()
{
double radiusA = radius (pWeight, length, bikeStress);
std::cout << radiusA << " in is the minimun radius for a 7in cyclindrical bike rod to support 300 lbs and a stress of 10,000 lbs/in^2";

return 0;
}