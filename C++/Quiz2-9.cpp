/* Quiz 2  #9
* Source Code File: Quiz2-9.cpp  
* Programmer: Joshua Clarke
* Description: Quiz 2-9 is all of the code for Quiz 2 exercise 9, using the maxWeight function in conjunction with
* the momentOfInertia function this program is able to take imperial values for base, height, length(distance),
* and max stress to show the max weight that can be placed on a wooden beam. All values are 
* hardcoded, program does not accept user inputed values as per instructions.
*/  

#include <iostream>
#include <math.h>

//hardcoded values for two wooden beams of lengths of 8ft that support max 3000lbs/in^2 of stress
double baseA = 2;
double heightA = 4;
double distanceA = 96; 
double stressA = 3000;
double cA = (0.5*heightA);

double baseB = 3;
double heightB = 6;
double distanceB = 96; 
double stressB = 3000;
double cB = (0.5*heightB);

//function that calculates moment of inertia as part of formula for max load
double momentOfInertia(double base, double height) 
{
    double I = ((base*pow(height, 3))/12);
    return I;
}

//function that calculates max load on a wood beam, uses momentOfInertia function
double maxWeight (double stress, double Inertia, double distance, double c) 
{
    double mW = ((stress*Inertia)/(distance*c));
    return mW;
}

int main()
{
double momentOfInertiaA = momentOfInertia(baseA, heightA);
double momentOfInertiaB = momentOfInertia(baseB, heightB);

double maxWeightA = maxWeight (stressA, momentOfInertiaA,distanceA, cA);
double maxWeightB = maxWeight (stressB, momentOfInertiaB,distanceB, cB);

std::cout << maxWeightA << " lbs is the max load for an 8ft, 2in x 4in wood beam\n";
std::cout << maxWeightB << " lbs is the max load for an 8ft, 3in x 6in wood beam\n";

return 0;
}