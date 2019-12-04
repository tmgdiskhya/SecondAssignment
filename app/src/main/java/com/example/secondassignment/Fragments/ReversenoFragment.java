package com.example.secondassignment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.secondassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReversenoFragment extends Fragment implements View.OnClickListener{

    private EditText etfirstnumber;
    private Button btnreverse;
    private TextView tvresult;

    public ReversenoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_reverseno, container, false);
        etfirstnumber = view.findViewById(R.id.etfirstnumber);
        btnreverse = view.findViewById(R.id.btnreverse);
        tvresult = view.findViewById(R.id.tvresult);

        btnreverse.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v){
        int number = Integer.parseInt(etfirstnumber.getText().toString());

    }

}
