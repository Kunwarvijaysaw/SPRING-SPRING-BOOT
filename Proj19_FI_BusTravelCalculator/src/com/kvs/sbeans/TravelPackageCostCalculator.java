

package com.kvs.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class TravelPackageCostCalculator {
	@Autowired
	PackageDetails packageDetails;

	public double calculateFinalPackageCost() {

		double total = packageDetails.packageCostPerPerson * packageDetails.numberOfTravelers;

		double discount = total * packageDetails.discountPercentage / 100;
		double finalCost = total - discount;
		return finalCost;

	}

}
