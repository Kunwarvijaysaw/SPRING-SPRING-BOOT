package com.kvs.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tbc")
public class TicketBillCalculator {

	
	TicketDetails ticketDetails;
   
	
//	@Autowired
//	public void setTicketDetails(TicketDetails ticketDetails) {
//		this.ticketDetails = ticketDetails;
//	}



	public double calculateTotalAmount()
	{
		
		double total=ticketDetails.getTicketPrice()*ticketDetails.getNumberOfTickets();
		return total+total*0.10;
	}


public TicketBillCalculator(@Autowired TicketDetails ticketDetails) {
	super();
	this.ticketDetails = ticketDetails;
}


}
