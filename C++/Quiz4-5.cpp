/* Quiz 4  #5
* Source Code File: Quiz4-5.cpp  
* Programmer: Joshua Clarke
* Description: Quiz 4-5 is all of the code for Quiz 4 exercise 5, It prompts the user to enter up to 50 scores. Once
* all scores are entered the user can type a negative number to exit. The program then outputs the scores in descending
* order using the descSort function.
* to first enter
*/ 

#include <iostream>
using namespace std;

void descSort (double[], int);

int main()
{
    const int ARRAY_LENGTH = 50;
    int count = 0;
    double scores[ARRAY_LENGTH];
    
//prompts user to enter scores, tells them user negative number can be used to exit
    cout << "Enter scores, enter a negative number to exit\n";
    for (int i = 0; i < ARRAY_LENGTH; i++)
    {
        cout << "Enter Score #" << i + 1 << ": ";
        cin >> scores[i];
        if (scores[i] < 0) {
            break;
        }
        count++;
    }
     
    descSort(scores, count);
    
    return 0;
}

//descSort function takes array and number of scores entered and outputs scores in descending order
void descSort(double array[], int count)
{
    for (int i = 0; i<count-1; i++) 
    {
        for (int j = 0; j<count-i-1; j++ ) 
        {
            if (array[j]<array[j+1])
            {
                double n = array[j];
                array[j]=array[j+1];
                array[j+1] = n;
            }
        }
    }
    for (int i = 0; i<count; i++) 
    {
        cout << array[i] << " ";
    }
}