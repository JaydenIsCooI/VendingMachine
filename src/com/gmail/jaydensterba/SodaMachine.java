package com.gmail.jaydensterba;

public class SodaMachine
{
    double temp = 33;

    Sodas Pepsi = new Sodas("Pepsi", 1.50, 20, temp);
    Sodas MountainDew = new Sodas("Mountain Dew", 1.50, 20, temp);
    Sodas DrPepper = new Sodas("Dr. Pepper", 1.50, 20, temp);
    Sodas Sprite = new Sodas("Sprite", 1.50, 20, temp);
    Sodas RootBeer = new Sodas("Root Beer", 1.50, 20, temp);
    Sodas OrangeFanta = new Sodas("Orange Fanta", 1.50, 20, temp);

    Sodas[] Inventory = {Pepsi, MountainDew, DrPepper, Sprite, RootBeer, OrangeFanta};

    public void setTemp(double t)
    {
        temp = t;
    }

    public double getTemp()
    {
        return temp;
    }
}