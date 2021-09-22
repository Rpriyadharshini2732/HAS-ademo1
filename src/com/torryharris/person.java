package com.torryharris;

public class person {
    private int personId;
    private String personName;
    private  Address Address;

    public person(int personId, String personName, com.torryharris.Address address) {
        this.personId = personId;
        this.personName = personName;
        Address = address;
    }

    @Override
    public String toString() {
        return "person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", Address=" + Address +
                '}';
    }
}

