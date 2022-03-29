package com.gmail.jaydensterba;

public class Main
{
    public static void main(String[] args)
    {
        SnackBar snackBar = new SnackBar();
        snackBar.vend();

        snackBar.displayShelves();
        snackBar.restockItems();
        snackBar.displayShelves();
    }
}