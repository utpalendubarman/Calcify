package com.pavitrawalia.calcify.ui.gpa_calculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.pavitrawalia.calcify.R;

public class GPAFragment extends Fragment {
    EditText g1,g2,g3,g4,g5,c1,c2,c3,c4,c5;
    Button btn;
    float result=0;
    TextView output;
    private GPAViewModel homeViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(GPAViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gpa_calculator, container, false);
        g1=root.findViewById(R.id.grade1);
        g2=root.findViewById(R.id.grade2);
        g3=root.findViewById(R.id.grade3);
        g4=root.findViewById(R.id.grade4);
        g5=root.findViewById(R.id.grade5);
        c1=root.findViewById(R.id.credit1);
        c2=root.findViewById(R.id.credit2);
        c3=root.findViewById(R.id.credit3);
        c4=root.findViewById(R.id.credit4);
        c5=root.findViewById(R.id.credit5);
        btn=root.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float credit1=Float.parseFloat(c1.getText().toString());
                float credit2=Float.parseFloat(c2.getText().toString());
                float credit3=Float.parseFloat(c3.getText().toString());
                float credit4=Float.parseFloat(c4.getText().toString());
                float credit5=Float.parseFloat(c5.getText().toString());
                float grade1=Float.parseFloat(g1.getText().toString());
                float grade2=Float.parseFloat(g2.getText().toString());
                float grade3=Float.parseFloat(g3.getText().toString());
                float grade4=Float.parseFloat(g4.getText().toString());
                float grade5=Float.parseFloat(g5.getText().toString());
                result=(credit1+credit2+credit3+credit4+credit5)/(grade1+grade2+grade3+grade4+grade5);
                output.setText(Float.toString(result));
            }
        });
        output=root.findViewById(R.id.result);
        return root;
    }
}