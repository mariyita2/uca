package com.example.alberto.guiaextra.acti.Adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.alberto.guiaextra.Modelos.Student;
import com.example.alberto.guiaextra.R;
import com.example.alberto.guiaextra.acti.Interface.ItemClickListener;
import com.example.alberto.guiaextra.acti.Violder.GradesViewHolder;

import java.util.List;


/**
 * Created by marioperezt on 10/11/17.
 */

public class StudentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Student> mListItems;
    private ItemClickListener<Student> mClickListener;


    public StudentAdapter(List<Student> items, ItemClickListener<Student> clickListener){
        mListItems = items;
        mClickListener = clickListener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grades,parent,false);
        return new GradesViewHolder(v, mClickListener);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        GradesViewHolder viewHolder = (GradesViewHolder) holder;
        viewHolder.setItem(mListItems.get(position));
    }

    @Override
    public int getItemCount() {
        return mListItems.size();
    }
}
