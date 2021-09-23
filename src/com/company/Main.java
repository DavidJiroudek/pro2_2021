package com.company;

import com.company.modules.PizzaMenu;
import com.company.modules.PizzaMenuItem;


public class Main {

    public static void main(String[] args) {
	// write your code here

        PizzaMenu menu = new PizzaMenu();

        menu.addItem(new PizzaMenuItem("quatroFormaggi", 160.00, "hooodně sýra"));
        menu.addItem(new PizzaMenuItem("ne", 180.00, "ne sýra"));
        System.out.println(menu.countItems());
        for (PizzaMenuItem pizzaItem : menu.getPizzaMenu()) {
            System.out.println(pizzaItem.getName());
        }
    }
}
