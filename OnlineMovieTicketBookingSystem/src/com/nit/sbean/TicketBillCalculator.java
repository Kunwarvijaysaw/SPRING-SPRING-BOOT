package com.nit.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TicketBillCalculator {

	@Autowired
	TicketDetails ticketDetails;
	public double calculateTotalAmount()
	{
		double total=ticketDetails.getTicketPrice()*ticketDetails.getNumberOfTickets();
		return total+total*0.1;
	}

}
