package com.bhagya.practice.model;

public class Flight {

    private String FlightName;
    private int FlightNo;
    private int FlightTime;
    private String Destination;
    private String Status;

    public Flight(){

    }

    @Override
    public String toString() {
        return "Flight{" +
                "FlightName='" + FlightName + '\'' +
                ", FlightNo=" + FlightNo +
                ", FlightTime=" + FlightTime +
                ", Destination='" + Destination + '\'' +
                ", Status='" + Status + '\'' +
                '}';
    }
    public Flight (String FlightName, int FlightNo, int FlightTime, String Destinetion, String Status){
        this.FlightName = FlightName;
        this.FlightNo = FlightNo;
        this.FlightTime = FlightTime;
        this.Destination = Destinetion;
        this.Status = Status;
    }
}
