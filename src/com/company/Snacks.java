package com.company;

public class Snacks extends Consumables
{
    public Snacks(String n, double p, int q)
    {
        Name = n;
        Price = p;
        Quantity = q;
    }

    int maxQuantity = 1;
}