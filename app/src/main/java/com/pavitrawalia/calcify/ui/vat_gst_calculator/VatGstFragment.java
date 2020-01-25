package com.pavitrawalia.calcify.ui.vat_gst_calculator;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import com.pavitrawalia.calcify.R;

public class VatGstFragment extends Fragment {


    private int contentView;
    private Button id1;
    private Button id2;
    private LinearLayout vatlayout;
    private LinearLayout gstlayout;

    EditText vatAmount,vatRate;
    Button addVat,removeVat;
    TextView vatresult;
    private float vatamount,vatrate,vat,totalvat;

    EditText gstAmount, gstRate;
    Button addGst,removeGst;
    TextView gstresult;
    private float gstamount=0,gstrate=0,gsttotal=0,gst=0;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_vat_gst, container, false);
        id1= rootView.findViewById(R.id.VatButton);
        id2= rootView.findViewById(R.id.GstButton);
        vatlayout = rootView.findViewById(R.id.vatlayout) ;
        gstlayout = rootView.findViewById(R.id.gstlayout);


        vatAmount=rootView.findViewById(R.id.vatAmount);
        vatRate=rootView.findViewById(R.id.vatRate);
        addVat=rootView.findViewById(R.id.addVat);
        removeVat=rootView.findViewById(R.id.removeVat);
        vatresult=rootView.findViewById(R.id.vatResult);

        addVat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    vatamount = Integer.parseInt(vatAmount.getText().toString());
                } catch(NumberFormatException e) {
                }
                try {
                    vatrate = Integer.parseInt(vatRate.getText().toString());
                } catch(NumberFormatException e) {
                }
                totalvat=vatamount*((vatrate/100)+1);
                vatresult.setText(Float.toString(totalvat));
            }
        });
        removeVat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vat=((vatrate/100)+1)/vatamount;
                totalvat=(vatamount*vat);
                totalvat-=vatamount;
                totalvat*=-1;
                vatresult.setText(Float.toString(totalvat));
            }
        });

        gstAmount=rootView.findViewById(R.id.gstAmount);
        gstRate=rootView.findViewById(R.id.gstRate);
        addGst=rootView.findViewById(R.id.AddGst);
        removeGst=rootView.findViewById(R.id.RemoveGst);
        gstresult=rootView.findViewById(R.id.gstResult);


        addGst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    gstamount = Integer.parseInt(gstAmount.getText().toString());
                } catch(NumberFormatException e) {
                }
                try {
                    gstrate = Integer.parseInt(gstRate.getText().toString());
                } catch(NumberFormatException e) {
                }
                gst=(gstrate/100)*gstamount;
                gsttotal=gst+gstamount;
                gstresult.setText(Float.toString(gsttotal));
            }
        });
        removeGst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gsttotal=gstamount-gst;
                gstresult.setText(Float.toString(gsttotal));
            }
        });


        id1.setBackgroundColor(Color.parseColor("#FFE0F7DE"));
        id1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gstlayout.setVisibility(View.GONE);
                vatlayout.setVisibility(View.VISIBLE);
                id1.setBackgroundColor(Color.parseColor("#FFE0F7DE"));
                id2.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
            }
        });
        id2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gstlayout.setVisibility(View.VISIBLE);
                vatlayout.setVisibility(View.GONE);

                id2.setBackgroundColor(Color.parseColor("#FFE0F7DE"));
                id1.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
            }

    });
        return rootView;
    }}



