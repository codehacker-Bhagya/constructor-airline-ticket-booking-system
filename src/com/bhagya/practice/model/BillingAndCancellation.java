package com.bhagya.practice.model;

public class BillingAndCancellation {

    private String PaymentMethod;
    private int Upiid;

    public BillingAndCancellation (){

    }

    @Override
    public String toString() {
        return "BillingAndCancellation{" +
                "PaymentMethod='" + PaymentMethod + '\'' +
                ", Upiid=" + Upiid +
                '}';
    }
    public BillingAndCancellation (String PaymentMethod, int Upiid){
        this.PaymentMethod = PaymentMethod;
        this.Upiid = Upiid;

    }
}
