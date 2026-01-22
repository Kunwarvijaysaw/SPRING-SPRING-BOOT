/*Q3) LibraryFineCalculator
Scenario
A library calculates fine based on number of late days and fine amount per day.

Class :LibraryFineCalculator

Fields
int lateDays
double finePerDay

Constructor : Accept lateDays, finePerDay

Method : double calculateFine()

Input
lateDays = 9
finePerDay = 5

Output : Library Fine: ₹45.0
*/
package com.kvs.sbeans;

import org.springframework.stereotype.Component;

@Component("lfc")

public class LibraryFineCalculator {
	int lateDays;
	double finePerDay;
	public void setLateDays(int lateDays) {
		this.lateDays = lateDays;
	}
	public void setFinePerDay(double finePerDay) {
		this.finePerDay = finePerDay;
	}
	
	public double calculateFine() {
		return lateDays*finePerDay;
	}

}
