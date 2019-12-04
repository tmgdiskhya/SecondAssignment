package com.example.secondassignment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.secondassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SumFragment extends Fragment implements View.OnClickListener{
    private Button btnSum;
    private EditText etfirst, etsecond;
    private TextView tvsumresult;


    public SumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sum, container, false);
        etfirst = view.findViewById(R.id.etfirst);
        etsecond = view.findViewById(R.id.etsecond);
        btnSum = view.findViewById(R.id.btnSum);
        tvsumresult=view.findViewById(R.id.tvsumresult);

        btnSum.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View v){
        int first = Integer.parseInt(etfirst.getText().toString());
        int second = Integer.parseInt(etsecond.getText().toString());
        int result = first + second;
        tvsumresult.setText(Integer.toString(result));

        Toast.makeText(getActivity(), "Sum is :"+ result, Toast.LENGTH_SHORT).show();
    }


}
