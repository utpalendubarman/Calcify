package com.pavitrawalia.calcify.ui.vat_gst_calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.pavitrawalia.calcify.R;

public class VatGstFragment extends Fragment {


    private int contentView;
    private Button id1;
    private Button id2;


    /*@Override
     public   void onCreateView(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_vat_gst);
         id1= Button.findViewById(R.id.VatButton);
        id1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VatGstFragment.this,VatCalulator.class));
            }
        });
        id2= Button.findViewById(R.id.GstButton);
        id2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VatGstFragment.this,GstCalculator.class));
            }
        });*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_vat_gst, container, false);
        id1= rootView.findViewById(R.id.VatButton);
        id1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VatGstFragment.this.getActivity(), VatCalulator.class);
                startActivity(intent);
            }
        });
        id2= rootView.findViewById(R.id.GstButton);
        id2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VatGstFragment.this.getActivity(),GstCalculator.class));
            }

    });
        return rootView;
    }}



