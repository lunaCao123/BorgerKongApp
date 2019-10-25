package com.example.borgerkongapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.borgerkongapp.MenuitemDetailAcitivity.newQuantity;

public class ViewOrderDetail extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    public TextView totalCost;
    public TextView orderitemNameTextView;
    public TextView orderitemCostTextView;
    public TextView orderitemQuantity;
    public TextView orderitemTotal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_order_detail);
        totalCost = findViewById(R.id.ordertotalPrice);
        totalCost.setText(MenuitemDetailAcitivity.totalCost);
        orderitemNameTextView = findViewById(R.id.orderedName);
        orderitemNameTextView.setText(MenuitemDetailAcitivity.orderitemname);
        orderitemCostTextView = findViewById(R.id.itemcost);
        orderitemCostTextView.setText(MenuitemDetailAcitivity.orderitemcost);
        orderitemQuantity = findViewById(R.id.orderQuantity);
        orderitemQuantity.setText(newQuantity);
        orderitemTotal = findViewById(R.id.itemTotal);
        orderitemTotal.setText(MenuitemDetailAcitivity.totalCost);



    }
    public void checkoutBtn(View view){
        Toast.makeText(getApplicationContext(),"Thank You for Your Order", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        totalCost.setText("0.00");
    }
    public void orderMore_btn(View view){
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }
}
