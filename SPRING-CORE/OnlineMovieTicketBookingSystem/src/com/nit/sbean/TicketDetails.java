package com.nit.sbean;

public class TicketDetails {

	private double ticketPrice;

	private int numberOfTickets;

	private double entertainmentTaxPercentage;

	public TicketDetails(double ticketPrice, int numberOfTickets, double entertainmentTaxPercentage) {
		super();
		this.ticketPrice = ticketPrice;
		this.numberOfTickets = numberOfTickets;
		this.entertainmentTaxPercentage = entertainmentTaxPercentage;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

	public double getEntertainmentTaxPercentage() {
		return entertainmentTaxPercentage;
	}

	public void setEntertainmentTaxPercentage(double entertainmentTaxPercentage) {
		this.entertainmentTaxPercentage = entertainmentTaxPercentage;
	}
	
	
}
