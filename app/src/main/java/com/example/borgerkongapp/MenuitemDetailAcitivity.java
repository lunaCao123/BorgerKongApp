package com.example.borgerkongapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuitemDetailAcitivity extends AppCompatActivity {
    private TextView menuitnameTextView;
    private TextView menuitpriceTextView;
    private TextView menuitkJTextView;
    private ImageView menuitpictureImageView;
    private ImageButton addBtn;
    private ImageButton minusBtn;
    private EditText quantityEditText;
    private TextView menuitdescriptionTextView;
    private Button addOrderBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuitem_detail_acitivity);
        addBtn = findViewById(R.id.plusBtn);
        addBtn.setImageResource(R.drawable.ic_add);
        minusBtn = findViewById(R.id.minusBtn);
        minusBtn.setImageResource(R.drawable.ic_remove);

        Intent intent = getIntent();
        int menuitemID = intent.getIntExtra("MenuitemID",0);
        MenuItem menuItem = MenuDatabase.getMenuItemById(menuitemID);

        menuitnameTextView = findViewById(R.id.detailItemName);
        menuitpriceTextView = findViewById(R.id.detailItemPrice);
        menuitkJTextView = findViewById(R.id.detailmenuitemkJ);
        menuitpictureImageView = findViewById(R.id.detailItemPicture);
        menuitdescriptionTextView = findViewById(R.id.detailItemDescription);

        menuitnameTextView.setText(menuItem.getMenuitemName());
        menuitpriceTextView.setText(menuItem.getMenuitemPrice());
        menuitkJTextView.setText(menuItem.getKilojoules());
        menuitdescriptionTextView.setText(menuItem.getMenuitemDescription());
        menuitpictureImageView.setImageResource(menuItem.getImageDrawableId());


    }
}
