/* Quiz 4  #3
* Source Code File: Quiz4-3.cpp  
* Programmer: Joshua Clarke
* Description: Quiz 4-3 is all of the code for Quiz 4 exercise 3, It prompts the user
* to first enter the length of their list of integers, then the integers in the list and
* stores those values in a one-dimensional array. The program then outputs those integers in the
* array in reverse order using a function.
*/  

#include <iostream>
using namespace std;

void reverseAry (int[], int);

int main()
{
    int arrayLength = 0;
    
//prompts user to enter the length of their list of numbers which becomes arrayLength
    cout << "Enter the length of your list of integers\n";
    cin >> arrayLength; 
    int intList[arrayLength];

//prompts user to fill array with values
    for (int i = 0; i < arrayLength; i++)
    {
        cout << "Enter integer #" << i + 1 << ": ";
        cin >> intList[i];
    }
    
    reverseAry(intList, arrayLength);
    
    return 0;
}

//reverseAry fuction takes input for array and length and outputs the array in reverse
void reverseAry(int array[], int length)
{
    for (int i = length - 1; i >= 0; i--) 
    {
        cout << array[i] << " ";
    }
}