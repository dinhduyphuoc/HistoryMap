package com.example.history.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.history.MapActivity;
import com.example.history.R;

public class FragmentSearch extends Fragment implements View.OnClickListener {

    private View view;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_search, container, false);
        button = (Button) view.findViewById(R.id.btn_map);
        button.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        //do what you want to do when button is clicked
        switch (view.getId()) {
            case R.id.btn_map:
                Intent intent = new Intent(view.getContext(), MapActivity.class);
                view.getContext().startActivity(intent);
                break;
        }
    }
}