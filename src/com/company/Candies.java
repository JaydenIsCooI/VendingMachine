package com.company;

public class Candies extends Consumables
{
    public Candies(String n, double p, int q)
    {
        Name = n;
        Price = p;
        Quantity = q;
    }

    int maxQuantity = 9;
}