package com.bhagya.practice.model;

public class Passenger {
    private String fullName;
    private long MoNo;
    private long UIDno;

    public Passenger() {

    }

    @Override
    public String toString() {
        return "Passenger{" +
                "fullName='" + fullName + '\'' +
                ", MoNo=" + MoNo +
                ", UIDno=" + UIDno +
                '}';
    }

    public Passenger(String Name, long Mo, long UID){
        this.fullName = Name;
        this.MoNo = Mo;
        this.UIDno = UID;

    }
}
