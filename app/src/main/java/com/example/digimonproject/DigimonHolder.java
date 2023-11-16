package com.example.digimonproject;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DigimonHolder extends RecyclerView.ViewHolder {

    private TextView name, level;

    private ImageView image;


    public DigimonHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
        level = itemView.findViewById(R.id.level);
        image = itemView.findViewById(R.id.imageView);


    }


    public ImageView getImage() {
        return image;
    }


    public TextView getName() {
        return name;
    }


    public TextView getLevel() {
        return level;
    }


}

