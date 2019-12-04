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
public class PalindromeFragment extends Fragment implements View.OnClickListener {
    private EditText etfirst;
    private Button btnpalindrome;
    private TextView tvpresult;


    public PalindromeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_palindrome, container, false);
        etfirst = view.findViewById(R.id.etfirst);
        btnpalindrome = view.findViewById(R.id.btnpalindrome);
        tvpresult = view.findViewById(R.id.tvpresult);

        btnpalindrome.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View v){
        int first= Integer.parseInt(etfirst.getText().toString());


    }

}
