package com.example.digimonproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import java.util.List;

public class DigimonAdapter extends RecyclerView.Adapter<DigimonHolder> {

    private Context context;
    private List<DigimonModel> digimon;
    public DigimonAdapter(Context context, List<DigimonModel> digimon) {
        this.context = context;
        this.digimon = digimon;

    }
    @NonNull
    @Override
    public DigimonHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DigimonHolder(LayoutInflater.from(context).inflate(R.layout.item_digimon,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull DigimonHolder holder, int position) {
        holder.getName().setText(digimon.get(position).getName());
        holder.getLevel().setText(digimon.get(position).getRankLevel());
        Picasso.get().load(digimon.get(position).getDigImg()).into(holder.getImage());

    }

    @Override
    public int getItemCount() {
        return digimon.size();
    }


}

