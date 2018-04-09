package com.kuligowski.maciej.platformy.lab4.allegretto.exceptions;

public class OrderNotValid extends Exception{

    public OrderNotValid(String message)
    {
        super(message);
    }

    public OrderNotValid()
    {
        super();
    }
}
