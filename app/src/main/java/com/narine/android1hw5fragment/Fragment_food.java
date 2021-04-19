package com.narine.android1hw5fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;


public class Fragment_food extends Fragment {

    RecyclerView recyclerView;
    FragmentAdapter adapter;
    ArrayList <ItemModel> list;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment_food() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_food.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_food newInstance(String param1, String param2) {
        Fragment_food fragment = new Fragment_food();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)  {
        View view = inflater.inflate(R.layout.fragment_food, container, false);
        recyclerView = view.findViewById(R.id.rv_food);
        adapter = new FragmentAdapter();
        recyclerView.setAdapter(adapter);

        list = new ArrayList<>();
        list.add(0, new ItemModel("Фетучини"));
        list.add(1, new ItemModel("Ганфан"));
        list.add(2, new ItemModel("Медальоны из говядины"));
        list.add(3, new ItemModel("Спагетти болоньезе"));
        list.add(4, new ItemModel("Домашние котлеты с пюре"));
        list.add(5, new ItemModel("Шашлык"));
        list.add(6, new ItemModel("Семга в сливочном соусе"));
        list.add(7, new ItemModel("Макароны с сыром"));
        list.add(8, new ItemModel("Гуляш с рисом"));

        adapter.addText(list);

        return view;



    }

}