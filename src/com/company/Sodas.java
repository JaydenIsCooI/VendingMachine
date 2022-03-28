package com.company;

public class Sodas extends Consumables
{
    int maxQuantity = 20;
    double temp;

    public Sodas(String n, double p, int q)
    {
        Name = n;
        Price = p;
        Quantity = q;
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