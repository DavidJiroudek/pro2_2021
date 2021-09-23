package com.company.modules;

import java.util.ArrayList;
import java.util.List;

public class PizzaMenu {
    private List<PizzaMenuItem> pizzaMenu;

    public PizzaMenu() {
        this.pizzaMenu = new ArrayList<>();
    }

    public void addItem(PizzaMenuItem item){
        pizzaMenu.add(item);

    }

    public List<PizzaMenuItem> getPizzaMenu() {
        return pizzaMenu;
    }

    public int countItems(){
        return this.pizzaMenu.size();

    }
}
