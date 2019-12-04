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
public class AreaFragment extends Fragment implements View.OnClickListener{
    private Button btnArea;
    private EditText etradius;
    private TextView tvarearesult;


    public AreaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_area, container, false);

        etradius=view.findViewById(R.id.etradius);
        btnArea=view.findViewById(R.id.btnArea);
        tvarearesult=view.findViewById(R.id.tvarearesult);

        btnArea.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View v)
    {
        float radius = Float.parseFloat( etradius.getText().toString());
        float result = 3.14f * radius * radius;


        Toast.makeText(getActivity(), "Area of circle is:" + result, Toast.LENGTH_SHORT).show();

    }

}
