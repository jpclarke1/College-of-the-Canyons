/* Final 1-pg456ch7
* Source Code File: Final1-pg456ch7.cpp  
* Programmer: Joshua Clarke
* Description: Final 1-pg456ch7 is all of the code for the final exercise 1 on page 456, it prompts the user to 
* enter up to 20 grades and returns the sum of all of the grades and average class grade. User can exit menu
* by entering a negative number. It also puts an "*" in front of any grade that is below average and displays 
* the appropriate letter grade next to the numerical grade. 
*/ 

#include <iostream>
using namespace std;

int main()
{
    const double ARRAY_LENGTH = 20;
    double sum, avg = 0;
    double grade[20]; 
    int count = 0;

// prompts user to enter grades
cout << "Enter scores (Max 20), enter a negative number to exit" << endl;
    for (int i = 0; i < ARRAY_LENGTH; i++)
    {
        cout << "Enter Grade #" << i + 1 << ": ";
        cin >> grade[i];
        if (grade[i] < 0) {
            break;
        }
        count++;
    }

//calculates sum of grades
    for(int i = 0; i < count ; i++) {
    sum+=grade[i];
    }
    cout << "The sum of the grades is " << sum << endl; 

//calculates average
    avg=sum/count;
    cout << "the average of the grades is " << avg << endl;

    for(int i = 0; i < count ; i++) {
//ads "*" in front of grade if it is below average
        if(grade[i] < avg) {
            cout << "*";
        }
        cout << grade[i];

//assigns letter values to grades A,B,C,D,F
        if (grade[i] >= 90 && grade[i] <= 100) {
            cout << " A";
        } else {
            if (grade[i] >= 80 && grade[i] < 90) {
                cout << " B";
            } else {
                if (grade[i] >= 70 && grade[i] < 80) {
                    cout << " C";
                } else {
                    if (grade[i] >= 60 && grade[i] < 70) {
                        cout << " D";
                    } else {
                    if (grade[i] < 60) {
                        cout << " F";
                    }}}}}

        cout << endl;

            }

    return 0;
}
