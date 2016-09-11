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

	// Testing the program
	cout << "Before: " << endl;
	cout << "i is " << i << endl;
	cout << "j is " << j << endl << endl;

	k = f(++i) + g(j++) + j + 45;  // j++ runs before ++i

	cout << "After: " << endl;
	cout << "i is " << i << endl;
	cout << "j is " << j << endl;

	// End program
	cin.ignore(999, '\n');
}

int f(int num)
{
	return num;
}

int g(int num)
{
	return num;
}