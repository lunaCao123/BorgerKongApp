package com.example.borgerkongapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter <MenuAdapter.MenuViewHolder> {

    private ArrayList<MenuItem>menuItems;

    public void setData (ArrayList<MenuItem>menuItems){
        this.menuItems = menuItems;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menuitem,parent, false);
        MenuViewHolder menuViewHolder = new MenuViewHolder(view);

        return menuViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdapter.MenuViewHolder holder, int position) {
        final MenuItem menuitemAtPosition = menuItems.get(position);

        holder.menuitemName.setText(menuitemAtPosition.getMenuitemName());
        Double menuPrice = menuitemAtPosition.getMenuitemPrice();
        holder.menuitemPrice.setText(String.format("%.2f",menuPrice));
        holder.menuitemKJ.setText(menuitemAtPosition.getKilojoules());
        holder.menuitemImage.setImageResource(menuitemAtPosition.getImageDrawableId());
        holder.view.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, MenuitemDetailAcitivity.class);
                intent.putExtra("MenuitemID",menuitemAtPosition.getMenuitemID());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return menuItems.size();
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView menuitemName;
        public TextView menuitemPrice;
        public TextView menuitemKJ;
        public ImageView menuitemImage;

        public MenuViewHolder(View v) {
            super(v);
            view = v;
            menuitemName = itemView.findViewById(R.id.menuItemName);
            menuitemPrice = itemView.findViewById(R.id.itemPrice);
            menuitemKJ = itemView.findViewById(R.id.kilojoules_lb);
            menuitemImage = itemView.findViewById(R.id.itemPicture);

        }
    }
}
