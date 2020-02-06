package com.pavitrawalia.calcify.ui.integral_differential_calculator;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.pavitrawalia.calcify.R;

public class IntegralDifferentialFragment extends Fragment implements View.OnClickListener {

    private IntegralDifferentialViewModel homeViewModel;
    Button integ_btn,diff_btn;
    LinearLayout diff_menu,integ_menu;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(IntegralDifferentialViewModel.class);
        View root = inflater.inflate(R.layout.fragment_integral_differential, container, false);
        diff_btn=root.findViewById(R.id.differentiation_btn);
        integ_btn=root.findViewById(R.id.integration_btn);
        diff_btn.setOnClickListener(this);
        integ_btn.setOnClickListener(this);
        integ_menu=root.findViewById(R.id.integration_menu);
        diff_menu=root.findViewById(R.id.differentiation_menu);
        integ_menu.setVisibility(View.INVISIBLE);
        return root;
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.differentiation_btn){
            diff_btn.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            integ_btn.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            integ_menu.setVisibility(View.INVISIBLE);
            diff_menu.setVisibility(View.VISIBLE);
        }
        if(v.getId()==R.id.integration_btn){
            diff_btn.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            integ_btn.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            diff_menu.setVisibility(View.INVISIBLE);
            integ_menu.setVisibility(View.VISIBLE);

        }
    }
}