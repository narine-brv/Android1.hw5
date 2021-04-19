package com.narine.android1hw5fragment;

import android.net.sip.SipSession;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;



public class FragmentAdapter extends RecyclerView.Adapter <FragmentHolder> {

    ArrayList <ItemModel> data = new ArrayList<>();


    @NonNull
    @Override
    public FragmentHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from (parent.getContext());
        View view = inflater.inflate(R.layout.item_list, parent,false);

        return new FragmentHolder(view);
    }

    public void addText (ArrayList <ItemModel> list) {
        data = list;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull FragmentHolder holder, int position) {
        holder.onBind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
