package com.gmail.jaydensterba;

public class Sodas extends Consumables
{
    final int maxQuantity = 20;
    double temp;

    public Sodas(String n, double p, int q, double t)
    {
        Name = n;
        Price = p;
        Quantity = q;
        temp = t;
    }

    public void setTemp(double t)
    {
        temp = t;
    }

    public double getTemp()
    {
        return temp;
    }
}