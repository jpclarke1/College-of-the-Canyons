/* Final 3-pg508
* Source Code File: Final3-pg508.cpp  
* Programmer: Joshua Clarke
* Description: Final 3-pg508 is all of the code for the final exercise 3 on page 508, it prompts the user to 
* enter the name, exam 1, exam 2, homework, and final grades for up to 20 students and finds the final grade 
* and letter grade for each student. All of the data is added to a csv file "grades.csv" where it can easily
* be viewed in a spreadsheet program. The data is also outputted in the console.
*/ 

#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    int count = 0;
    double exam1, exam2, homework, final;
    string arry[20][7];
    string name, std, lgrade;
    char cont;
    ofstream grades("grades.csv");

//adds header to csv file
    grades <<  "Name,Exam 1 Grade,Exam 2 Grade,Homework Grade,Final Exam Grade,Final Grade,Letter Grade" << endl;

    while (count <= 20) {
//takes user input and adds it to an array to be printed 
    cout << "Enter the Name of a Student" << endl;
    cin >> name;
    arry[count][0] = name;

    cout << "Enter " << name << "'s First Exam Grade" << endl;
    cin >> exam1;
    arry[count][1] = to_string(exam1) + "%";

    cout << "Enter " << name << "'s Second Exam Grade" << endl;
    cin >> exam2;
    arry[count][2] = to_string(exam2) + "%";

    cout << "Enter " << name << "'s Homework Grade" << endl;
    cin >> homework;
    arry[count][3] = to_string(homework) + "%";

    cout << "Enter " << name << "'s Final Exam Grade" << endl;
    cin >> final;
    arry[count][4] = to_string(final) + "%";

    double finalGrade = 0.2 * exam1 + 0.2 * exam2 + 0.35 * homework + 0.25 * final;
    arry[count][5] = to_string(finalGrade) + "%";

//assigns letter grades to final grade percentage 
    if (finalGrade >= 90 && finalGrade <= 100) {
            lgrade = "A";
        } else {
            if (finalGrade >= 80 && finalGrade < 90) {
                lgrade = "B";
            } else {
                if (finalGrade >= 70 && finalGrade < 80) {
                    lgrade = "C";
                } else {
                    if (finalGrade >= 60 && finalGrade < 70) {
                        lgrade = "D";
                    } else {
                    if (finalGrade < 60) {
                        lgrade = "F";
                    }}}}}
    arry[count][6] = lgrade;

//adds user inputted values to csv file
    grades << name << "," << exam1 << "," << exam2 << "," << homework << "," << final << "," << finalGrade << "," << lgrade << endl;
    count ++;

//y/n menu to allow user to eneter new students or terminate the program
    cout << "Would you like to enter grades another student? Currently entered: " << count << "/20" << endl;
    cout << "y/n";
    cin >> cont;
        if (cont == 'y' || cont == 'Y') {
            continue;
        }
        else {
            if (cont == 'n' || cont == 'N') {
            break;
            } else {
            cout << "error wrong character entered";
            break;
            }
        }
    }
    grades.close();

    //prints array
    for (int i = 0; i < count; ++i)
    {
        for (int j = 0; j < 7; ++j)
        {
            cout << arry[i][j] << "  ";
        }
        cout << endl;
    }
    return 0;
}