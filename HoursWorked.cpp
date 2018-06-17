/*
									read file

Created by:		Mani Majd
Date:			August 8th 2017
Purpose:		Training

*/
#include<iostream>
#include<fstream> //ifstream : read the file     ofstream: write on the file
#include<String>
using namespace std;

//-------------------------------------- prototype --------------------------------------
void readFile();
//--------------------------------------------------------------------------------------

int main() {

	//ifstream input("hours.txt");
	readFile();

	system("PAUSE");
}//end of main

void readFile() {

	ifstream input("hours.txt");

	int employeeID, id;
	string name;
	double firstD, secondD, thirdD, fourthD, fifthD, totalHoures = 0.0;
	bool foundID = false;

	if (input.is_open()) {
		cout << "Enter an ID = ? " << endl;
		cin >> id;
		while (input >> employeeID >> name >>
			firstD >> secondD >> thirdD >> fourthD >> fifthD) {
			if (id == employeeID) {
				foundID = true;
				totalHoures = (firstD + secondD + thirdD + fourthD + fifthD);
				cout << name << " worked " << totalHoures << " hours ( " << totalHoures / 5 << " hours/day)" << endl;
			}//end of if ID block
		}// end of wile loop

		if (!foundID) {
			cout << "ID# " << id << " not found." << endl;
		}


		input.close();
	}//end of if open block
}