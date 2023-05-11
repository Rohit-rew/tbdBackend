package com.tbdhealth.assignment.Entities;

public class Customer {

    String name;
    String address;

    String phoneNo;

    public  Customer(String name , String address , String phoneNo){
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
}
