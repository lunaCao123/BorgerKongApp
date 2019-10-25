package com.example.borgerkongapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MenuitemDetailAcitivity extends AppCompatActivity {
    private TextView menuitnameTextView;
    private TextView menuitpriceTextView;
    private TextView menuitkJTextView;
    private ImageView menuitpictureImageView;
    private ImageButton addBtn;
    private ImageButton minusBtn;
    private EditText quantityEditText;
    private TextView menuitdescriptionTextView;
    public static ArrayList<OrderItem>orderItemArrayList;
    public static String orderitemname;
    public static String orderitemcost;
    public static String newQuantity;
    public TextView itemTotalTextView;
    public static String totalCost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuitem_detail_acitivity);
        addBtn = findViewById(R.id.plusBtn);
        addBtn.setImageResource(R.drawable.ic_add);
        minusBtn = findViewById(R.id.minusBtn);
        minusBtn.setImageResource(R.drawable.ic_remove);
        quantityEditText = findViewById(R.id.quantity);
        quantityEditText.setText("0");
        itemTotalTextView = findViewById(R.id.itemTotal);



        Intent intent = getIntent();
        int menuitemID = intent.getIntExtra("MenuitemID",0);
        MenuItem menuItem = MenuDatabase.getMenuItemById(menuitemID);

        menuitnameTextView = findViewById(R.id.detailItemName);
        menuitpriceTextView = findViewById(R.id.detailItemPrice);
        menuitkJTextView = findViewById(R.id.detailmenuitemkJ);
        menuitpictureImageView = findViewById(R.id.detailItemPicture);
        menuitdescriptionTextView = findViewById(R.id.detailItemDescription);

        menuitnameTextView.setText(menuItem.getMenuitemName());
        orderitemname = menuitnameTextView.getText().toString();
        Double menuprice = menuItem.getMenuitemPrice();
        menuitpriceTextView.setText(String.format("%.2f",menuprice));
        orderitemcost = menuitpriceTextView.getText().toString();
        menuitkJTextView.setText(menuItem.getKilojoules());
        menuitdescriptionTextView.setText(menuItem.getMenuitemDescription());
        menuitpictureImageView.setImageResource(menuItem.getImageDrawableId());

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addQuantity();
            }
        });
        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeQuantity();
            }
        });


    }
    public void addQuantity(){
        String currentQuantity = quantityEditText.getText().toString();
        int pasNumber = Integer.parseInt(currentQuantity);
        int newNumber = pasNumber+1;
        newQuantity = Integer.toString(newNumber);
        quantityEditText.setText(newQuantity);
        String price = menuitpriceTextView.getText().toString();
        double menuPrice = Double.parseDouble(price);
        double totalPrice = newNumber * menuPrice;
        double roundedTotal = Math.round(totalPrice*100.00)/100.00;
        totalCost = Double.toString(roundedTotal);
        itemTotalTextView.setText(totalCost);
    }
    public void removeQuantity(){
        String currentQuantity = quantityEditText.getText().toString();
        int pasNumber = Integer.parseInt(currentQuantity);
        int newNumber = pasNumber-1;
        String newQuantity = Integer.toString(newNumber);
        quantityEditText.setText(newQuantity);
        String price = menuitpriceTextView.getText().toString();
        double menuPrice = Double.parseDouble(price);
        double totalPrice = newNumber * menuPrice;
        double roundedTotal = Math.round(totalPrice*100.00)/100.00;
        totalCost = Double.toString(roundedTotal);
        itemTotalTextView.setText(totalCost);
    }
    public void addOrderBtn(View view){
        Intent intent = new Intent(this, ViewOrderDetail.class);
        startActivity(intent);
    }
}
