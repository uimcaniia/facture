package com.uimainon;

public class Customer {
    private String fullname;
    private String address;

public Customer(String fullname, String address){
    this.fullname = fullname;
    this.address = address;
}

    public String getAddress() {

        return address;
    }

    public String getFullname() {

        return fullname;
    }
}
