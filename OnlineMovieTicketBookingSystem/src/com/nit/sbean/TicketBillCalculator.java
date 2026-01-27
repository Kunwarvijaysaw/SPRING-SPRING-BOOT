package com.nit.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class TicketBillCalculator {

	//@Autowired
	TicketDetails ticketDetails;
//	@Autowired
//	public void setTicketDetails(TicketDetails ticketDetails) {
//		this.ticketDetails = ticketDetails;
//	}

	public double calculateTotalAmount()
	{
		double total=ticketDetails.getTicketPrice()*ticketDetails.getNumberOfTickets();
		return total+total*0.1;
	}
//	@Autowired 
	public TicketBillCalculator(TicketDetails ticketDetails) {
		this.ticketDetails = ticketDetails;
	}

}









