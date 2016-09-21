//	Anhkhoi Vu
//	CECS 444 - Lab Assignment 03
//	
//	Program tests for whether ++i or j++ runs first.

#include<iostream>
using namespace std;

//	Function declarations
int f(int num); 
int g(int num);

int main()
{
	// Initializations
	int i = 5;
	int j = 9;
	int k;

	// Display
	cout << "************************************************************************************\n";
	cout << "*                                                                                  *\n";
	cout << "*      	     This program will compare ++i and j++ and what runs first.		   * \n";
	cout << "*                                                                                  *\n";
	cout << "************************************************************************************\n" << endl;

	// Testing the program
	cout << "Before: " << endl;
	cout << "f(++i) is " << i << endl;
	cout << "g(i++) is " << i << endl << endl;
	cout << "After: " << endl;

	//for(int n = 0; n < 2; n++)
	k = f(++i) + g(i++) + j + 45;  // i++ runs before ++i on Visual Studio's C++compiler.
								   // ++i runs before i++ on Clang's C++ compiler.
	cout << "\nResult: " << endl;
	cout << "k is " << k << endl;

	// End program
	cin.ignore(999, '\n');
}

// This method displays and returns i.
int f(int num)
{
	// Displays result of integer i.
	cout << "f(++i) is " << num << endl;
	return num;
}

// This method displays and returns j.
int g(int num)
{
	// Displays result of integer j.
	cout << "g(i++) is " << num << endl;
	return num;
}