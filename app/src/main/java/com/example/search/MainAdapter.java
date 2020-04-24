package com.example.search;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Set;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> implements Filterable {

    private ArrayList<String> data;
    private Filter fRecords;

    public MainAdapter() {
        data = new ArrayList<>();
    }

    public void update(ArrayList<String> arrayList) {
        data = arrayList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.activity_main_view_holder, parent, false);
        MainViewHolder mainViewHolder = new MainViewHolder(v);

        return mainViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public Filter getFilter() {
        return null;
    }
}