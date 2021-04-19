package com.narine.android1hw5fragment;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FragmentHolder extends RecyclerView.ViewHolder {

    TextView food_name;

    public FragmentHolder(@NonNull View itemView) {

        super(itemView);
        food_name = itemView.findViewById(R.id.tv_food_name);
    }

    public void onBind (ItemModel data) {
        food_name.setText(data.foodName);
    }

}

