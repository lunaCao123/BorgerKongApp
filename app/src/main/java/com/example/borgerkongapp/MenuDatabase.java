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
                "3.30",
                "1260",
                R.drawable.cheeseburger
        ));
        menuitem.put(2, new MenuItem(
                2,
                "Angus Clubhouse",
                "Borger Bun, Angus Beef, Big Borger Special Sauce, Whole Leaf Lettuce, Sliced Tomato, Rasher Bacon, Caramelised Grilled Onions, Aussie Jack Cheese, Angus Seasoning",
                "8.85",
                "3040",
                R.drawable.angusclubhouse
        ));
        menuitem.put(3, new MenuItem(
                3,
                "Crispy Spyicy Chicken Clubhouse",
                "Borger Bun, Crispy Chicken, Sriracha Sauce, Big Borger Special Sauce, Whole Leaf Lettuce, Sliced Tomato, Aussie Jack Cheese, Rasher Bacon, Caramelised Grilled Onions",
                "7.45",
                "2220",
                R.drawable.crispyspicychicken
        ));
        menuitem.put(4, new MenuItem(
                4,
                "Crispy Chicken Borger",
                "Borger Bun, Chicken Patty, Special Chicken Sauce, Shredded Lettuce",
                "6.00",
                "1890",
                R.drawable.chickenburger
        ));
        menuitem.put(5, new MenuItem(
                5,
                "Chicken Caesar Wrap",
                "Wholemeal Tortilla, Crispy Chicken Fillet, Crispy Bacon, Shaved Parmesan Cheese, Diced Lettuce Mix, Caesar Sauce",
                "7.75",
                "2460",
                R.drawable.chickencaesarwrap
        ));
        menuitem.put(6, new MenuItem(
                6,
                "Crispy Chicken Caesar Salad",
                "Crispy Chicken, Creamy Caesar Dressing, Cos-Iceberg Blend, Crispy Bacon, Shaved Parmesan",
                "9.95",
                "2490",
                R.drawable.crispychickencaesarsalad
        ));
        menuitem.put(7, new MenuItem(
                7,
                "Chicken Nuggets 6pc",
                "Deep Fried, Battered Chicken Meat",
                "6.00",
                "1110",
                R.drawable.chickennuggets
        ));
        menuitem.put(8, new MenuItem(
                8,
                "Filet-O-Fish",
                "Regular Bun, Filet-O-Fish Portion, Tartare Sauce, 1/2 Cheese slice",
                "5.25",
                "1410",
                R.drawable.fishburger
        ));
        menuitem.put(9, new MenuItem(
                9,
                "Coffee Frappe",
                "Crushed Ice blended with Coffee, Whipped Cream",
                "4.90",
                "2380",
                R.drawable.coffeefrappe
        ));
        menuitem.put(10, new MenuItem(
                10,
                "Bottled Water 600ml",
                "Refresh yourself with a healthy choice!",
                "3.40",
                "0",
                R.drawable.waterbottled
        ));
        menuitem.put(11, new MenuItem(
                11,
                "Frozen Fanta Raspberry",
                "Pink Raspberry Flavoured Frozen Fanta",
                "1.00",
                "583",
                R.drawable.frozenfanta
        ));
        menuitem.put(12, new MenuItem(
                12,
                "Medium Fries",
                "Deep Fried Thinly Cut Potato, Salt",
                "2.85",
                "1240",
                R.drawable.fries
        ));
        menuitem.put(13, new MenuItem(
                13,
                "Sausage & Egg Muffin",
                "English Muffin, Beef Sausage, Egg, Sliced Cheese",
                "4.50",
                "1560",
                R.drawable.sausageandeggmuffin
        ));
        menuitem.put(14, new MenuItem(
                14,
                "Hotcakes with Butter & Syrup",
                "Hotcake, Syruo, Butter",
                "4.75",
                "2500",
                R.drawable.hotcakes
        ));
        menuitem.put(15, new MenuItem(
                15,
                "Hash Brown",
                "Best Hash Brown in Town",
                "2.25",
                "587",
                R.drawable.hashbrown
        ));
        menuitem.put(16, new MenuItem(
                16,
                "Hot Fudge Sundae",
                "Soft Serve Ice-Cream, Hot Fudge Chocolate Topping",
                "3.60",
                "1460",
                R.drawable.hotfudgesundae
        ));

    }
}
