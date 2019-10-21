package com.example.borgerkongapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MenuDatabase {

    public static MenuItem getMenuItemById(int menuitemID){return menuitem.get(menuitemID);}

    public static ArrayList<MenuItem>getAllMenuItems(){
        return new ArrayList<MenuItem>((List)Arrays.asList(menuitem.values().toArray()));
    }

    private static final HashMap<Integer, MenuItem>menuitem = new HashMap<>();

    static {
        menuitem.put(1, new MenuItem(
                1,
                "Cheese Borger",
                "Regular Bun, Beef Patty, Regular Onions, Mustard, Ketchup, Pickles, Sliced Cheese",
                3.30,
                1260,
                R.drawable.cheeseburger
        ));
        menuitem.put(2, new MenuItem(
                2,
                "Angus Clubhouse",
                "Borger Bun, Angus Beef, Big Borger Special Sauce, Whole Leaf Lettuce, Sliced Tomato, Rasher Bacon, Caramelised Grilled Onions, Aussie Jack Cheese, Angus Seasoning",
                8.85,
                3040,
                R.drawable.angusclubhouse
        ));
        menuitem.put(3, new MenuItem(
                3,
                "Crispy Spyicy Chicken Clubhouse",
                "Borger Bun, Crispy Chicken, Sriracha Sauce, Big Borger Special Sauce, Whole Leaf Lettuce, Sliced Tomato, Aussie Jack Cheese, Rasher Bacon, Caramelised Grilled Onions",
                7.45,
                2220,
                R.drawable.crispyspicychicken
        ));
    }
}
