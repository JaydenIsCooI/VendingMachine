package com.gmail.jaydensterba;

import java.util.Scanner;

public class SnackBar
{
    CandyMachine CandyMachine = new CandyMachine();
    SodaMachine SodaMachine = new SodaMachine();
    SnackMachine SnackMachine = new SnackMachine();
    final String line = ("------------------------------------------------------------");

    public void vend()
    {
        Scanner in = new Scanner(System.in);
        System.out.println(line + "\nWelcome to the Snackbar! Type \"exit\" to Leave at any Time!\n" + line);

        final String e = "exit";
        boolean exit = false;
        boolean success = false;
        double bal = 0;
        while (!success)
        {
            try
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("Please Enter Your Balance (Dollars): $");
                String b = sc.nextLine();
                if (b.equalsIgnoreCase(e))
                {
                    return;
                }
                System.out.println(line);
                if (Double.valueOf(b) instanceof Double)
                {
                    bal = Double.parseDouble(b);
                    success = true;
                }
            } catch (Exception ex)
            {
                System.out.println("Please Enter a Valid Number for Your Balance!\n" + line);
            }
        }
        while (!exit)
        {
            System.out.println("                Available Vending Machines\n" + line);
            System.out.println("            Candy    ||    Soda    ||    Snack\n" + line);

            for (int i = 0; i < 1; i++)
            {
                System.out.print("Please Enter a Vending Machine:: ");
                String test = in.nextLine();
                if (test.equalsIgnoreCase(e))
                {
                    return;
                }
                System.out.println(line);

                if (test.equalsIgnoreCase("Candy") || test.equalsIgnoreCase("Soda") || test.equalsIgnoreCase("Snack"))
                {
                    if (test.equalsIgnoreCase("Candy"))
                    {
                        System.out.println("                    Available Candy\n" + line);
                        for (int j = 0; j < CandyMachine.Inventory.length; j++)
                        {
                            if (CandyMachine.Inventory[j].Quantity >= 1)
                            {
                                if (j == CandyMachine.Inventory.length - 1)
                                {
                                    System.out.println(CandyMachine.Inventory[j].getName() + "[$" + CandyMachine.Inventory[j].getPrice() + "]");
                                } else
                                {
                                    System.out.print(CandyMachine.Inventory[j].getName() + "[$" + CandyMachine.Inventory[j].getPrice() + "], ");
                                }
                                if (j != 0 && j % 3 == 0)
                                {
                                    System.out.println();
                                }
                            }
                        }
                        System.out.println(line);

                        for (int j = 0; j < 1; j++)
                        {
                            boolean check = false;
                            System.out.print("Please Make a Selection: ");
                            String temp = in.nextLine();
                            if (temp.equalsIgnoreCase(e))
                            {
                                return;
                            }
                            System.out.println(line);
                            for (int k = 0; k < CandyMachine.Inventory.length; k++)
                            {
                                if (temp.equalsIgnoreCase(CandyMachine.Inventory[k].getName()))
                                {
                                    if (CandyMachine.Inventory[k].getQuantity() >= 1)
                                    {
                                        if (bal >= CandyMachine.Inventory[k].getPrice())
                                        {
                                            bal -= CandyMachine.Inventory[k].getPrice();
                                            CandyMachine.Inventory[k].Quantity -= 1;
                                            System.out.println("Enjoy Your " + CandyMachine.Inventory[k].getName() + "!\n" + "You have $" + bal + " Remaining!\n" + line);
                                        } else
                                        {
                                            System.out.println("Sorry! You do not have enough Money to Purchase that Item!\n" + line + "\n");
                                        }
                                        check = true;
                                    } else
                                    {
                                        check = true;
                                        System.out.println("Sorry! We are currently out of " + CandyMachine.Inventory[k].getName() + "!\n" + line + "\n");
                                    }
                                }
                            }
                            if (!check)
                            {
                                System.out.println("Invalid Input!\nPlease Enter an Available Selection!\n" + line + "\n");
                                j = -1;
                            }
                        }
                    }
                    if (test.equalsIgnoreCase("Soda"))
                    {
                        System.out.println("                    Available Soda\n" + line);
                        for (int j = 0; j < SodaMachine.Inventory.length; j++)
                        {
                            if (SodaMachine.Inventory[j].Quantity != 0)
                            {
                                if (j == SodaMachine.Inventory.length - 1)
                                {
                                    System.out.println(SodaMachine.Inventory[j].getName() + "[$" + SodaMachine.Inventory[j].getPrice() + "]");
                                } else
                                {
                                    System.out.print(SodaMachine.Inventory[j].getName() + "[$" + SodaMachine.Inventory[j].getPrice() + "], ");
                                }
                                if (j != 0 && j % 3 == 0)
                                {
                                    System.out.println();
                                }
                            }
                        }
                        System.out.println(line);

                        for (int j = 0; j < 1; j++)
                        {
                            boolean check = false;
                            System.out.print("Please Make a Selection: ");
                            String temp = in.nextLine();

                            if (temp.equalsIgnoreCase(e))
                            {
                                return;
                            }
                            System.out.println(line);
                            for (int k = 0; k < SodaMachine.Inventory.length; k++)
                            {
                                if (temp.equalsIgnoreCase(SodaMachine.Inventory[k].getName()))
                                {
                                    if (SodaMachine.Inventory[k].getQuantity() >= 1)
                                    {
                                        if (bal >= SodaMachine.Inventory[k].getPrice())
                                        {
                                            bal -= SodaMachine.Inventory[k].getPrice();
                                            SodaMachine.Inventory[k].Quantity -= 1;
                                            System.out.println("Enjoy Your " + SodaMachine.Inventory[k].getName() + "!\n" + "You have $" + bal + " Remaining!\n" + line);
                                        } else
                                        {
                                            System.out.println("Sorry! You do not have enough Money to Purchase that Item!\n" + line + "\n");
                                        }
                                        check = true;
                                    } else
                                    {
                                        check = true;
                                        System.out.println("Sorry! We are currently out of " + SodaMachine.Inventory[k].getName() + "!\n" + line + "\n");
                                    }
                                }
                            }
                            if (!check)
                            {
                                System.out.println("Invalid Input!\nPlease Enter an Available Selection!\n" + line + "\n");
                                j = -1;
                            }
                        }
                    }
                    if (test.equalsIgnoreCase("Snack"))
                    {
                        System.out.println("                    Available Snacks\n" + line);
                        for (int j = 0; j < SnackMachine.Inventory.length; j++)
                        {
                            if (SnackMachine.Inventory[j].Quantity >= 1)
                            {
                                if (j == SnackMachine.Inventory.length - 1)
                                {
                                    System.out.println(SnackMachine.Inventory[j].getName() + "[$" + SnackMachine.Inventory[j].getPrice() + "]");
                                } else
                                {
                                    System.out.print(SnackMachine.Inventory[j].getName() + "[$" + SnackMachine.Inventory[j].getPrice() + "], ");
                                }
                                if (j != 0 && j % 3 == 0)
                                {
                                    System.out.println();
                                }
                            }
                        }
                        System.out.println(line);

                        for (int j = 0; j < 1; j++)
                        {
                            boolean check = false;
                            System.out.print("Please Make a Selection: ");
                            String temp = in.nextLine();

                            if (temp.equalsIgnoreCase(e))
                            {
                                return;
                            }
                            System.out.println(line);
                            for (int k = 0; k < SnackMachine.Inventory.length; k++)
                            {
                                if (temp.equalsIgnoreCase(SnackMachine.Inventory[k].getName()))
                                {
                                    if (SnackMachine.Inventory[k].getQuantity() >= 1)
                                    {
                                        if (bal >= SnackMachine.Inventory[k].getPrice())
                                        {
                                            bal -= SnackMachine.Inventory[k].getPrice();
                                            SnackMachine.Inventory[k].Quantity -= 1;
                                            System.out.println("Enjoy Your " + SnackMachine.Inventory[k].getName() + "!\n" + "You have $" + bal + " Remaining!\n" + line);
                                        } else
                                        {
                                            System.out.println("Sorry! You do not have enough Money to Purchase that Item!\n" + line + "\n");
                                        }
                                        check = true;
                                    } else
                                    {
                                        check = true;
                                        System.out.println("Sorry! We are currently out of " + SnackMachine.Inventory[k].getName() + "!\n" + line + "\n");
                                    }
                                }
                            }
                            if (!check)
                            {
                                System.out.println("Invalid Input!\nPlease Enter an Available Selection!\n" + line + "\n");
                                j = -1;
                            }
                        }
                    }
                } else
                {
                    System.out.println("Invalid Input!\nPlease Enter an Available Vending Machine!\n" + line + "\n");
                    i = -1;
                }
            }
            System.out.println("Welcome back! Remember you can type \"exit\" to leave at any time!\n");
        }
    }

    public void restockItems()
    {
        for (int i = 0; i < CandyMachine.Inventory.length; i++)
        {
            CandyMachine.Inventory[i].setQuantity(CandyMachine.Inventory[i].maxQuantity);
        }
        for (int i = 0; i < SodaMachine.Inventory.length; i++)
        {
            SodaMachine.Inventory[i].setQuantity(SodaMachine.Inventory[i].maxQuantity);
        }
        for (int i = 0; i < SnackMachine.Inventory.length; i++)
        {
            SnackMachine.Inventory[i].setQuantity(SnackMachine.Inventory[i].maxQuantity);
        }
        System.out.println("The Shelves have been Restocked!\n" + line + "\n");
    }

    public void displayShelves()
    {
        System.out.println(line + "\n                    Available Candy\n" + line);
        for (int i = 0; i < CandyMachine.Inventory.length; i++)
        {
            System.out.println("Name: " + CandyMachine.Inventory[i].getName() + "  ||  Price: $" + CandyMachine.Inventory[i].getPrice() + "  ||  Quantity: " + CandyMachine.Inventory[i].getQuantity());
        }
        System.out.println(line + "\n                    Available Sodas\n" + line);
        for (int i = 0; i < SodaMachine.Inventory.length; i++)
        {
            System.out.println("Name: " + SodaMachine.Inventory[i].getName() + "  ||  Price: $" + SodaMachine.Inventory[i].getPrice() + "  ||  Quantity: " + SodaMachine.Inventory[i].getQuantity() + "  ||  Temperature (F): " + SodaMachine.Inventory[i].getTemp());
        }
        System.out.println(line + "\n                    Available Snacks\n" + line);
        for (int i = 0; i < SnackMachine.Inventory.length; i++)
        {
            System.out.println("Name: " + SnackMachine.Inventory[i].getName() + "  ||  Price: $" + SnackMachine.Inventory[i].getPrice() + "  ||  Quantity: " + SnackMachine.Inventory[i].getQuantity());
        }
        System.out.println(line + "\n");
    }
}