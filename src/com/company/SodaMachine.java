package com.company;

public class SodaMachine
{
    Sodas Pepsi = new Sodas("Pepsi", 1.50, 20);
    Sodas MountainDew = new Sodas("Mountain Dew", 1.50, 20);
    Sodas DrPepper = new Sodas("Dr. Pepper", 1.50, 20);
    Sodas Sprite = new Sodas("Sprite", 1.50, 20);
    Sodas RootBeer = new Sodas("Root Beer", 1.50, 20);
    Sodas OrangeFanta = new Sodas("Orange Fanta", 1.50, 20);

    Sodas[] Inventory = {Pepsi, MountainDew, DrPepper, Sprite, RootBeer, OrangeFanta};
}