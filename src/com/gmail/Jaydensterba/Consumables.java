package com.gmail.Jaydensterba;

public abstract class Consumables
{
    public String Name;
    public double Price;
    public int Quantity;

    public void setName(String n)
    {
        Name = n;
    }

    public void setPrice(double p)
    {
        Price = p;
    }

    public void setQuantity(int q)
    {
        Quantity = q;
    }

    public String getName()
    {
        return Name;
    }

    public double getPrice()
    {
        return Price;
    }

    public int getQuantity()
    {
        return Quantity;
    }
}