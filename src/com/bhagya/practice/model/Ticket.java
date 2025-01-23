package com.bhagya.practice.model;

public class Ticket {


    private String seatPreference;
    private String Destination;
    private String AddMeal;
    private double TicketAmount;

    public Ticket (){

    }

    @Override
    public String toString() {
        return "Ticket{" +
                "seatPreference='" + seatPreference + '\'' +
                ", Destination='" + Destination + '\'' +
                ", AddMeal='" + AddMeal + '\'' +
                ", TicketAmount=" + TicketAmount +
                '}';
    }

    public Ticket (String seatPreference, String Destination,String AddMeal, double TicketAmount ){
        this.seatPreference = seatPreference;
        this.Destination = Destination;
        this.AddMeal = AddMeal;
        this.TicketAmount = TicketAmount;

    }
}
