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
public class AutomorphicFragment extends Fragment implements View.OnClickListener{
    private EditText etNumber;
    private Button btnautomorphic;
    private TextView tvautoresult;


    public AutomorphicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_automorphic, container, false);
        etNumber = view.findViewById(R.id.etNumber);
        btnautomorphic = view.findViewById(R.id.btnautomorphic);
        tvautoresult = view.findViewById(R.id.tvautoresult);

        btnautomorphic.setOnClickListener();
        return view;
    }
@Override
    public void onClick(View v)
{
    int number = Integer.parseInt(etNumber.getText().toString());
    int
}
}
