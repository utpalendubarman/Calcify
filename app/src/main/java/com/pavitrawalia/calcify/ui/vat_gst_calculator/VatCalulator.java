package com.pavitrawalia.calcify.ui.vat_gst_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.pavitrawalia.calcify.R;

public class VatCalulator extends AppCompatActivity implements View.OnClickListener {
    EditText vatAmount,vatRate;
    Button addVat,removeVat;
    TextView result;
    private float amount,rate,vat,total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vat_calulator);
        vatAmount=findViewById(R.id.vatAmount);
        vatRate=findViewById(R.id.vatRate);
        addVat=findViewById(R.id.addVat);
        removeVat=findViewById(R.id.removeVat);
        result=findViewById(R.id.vatResult);
        addVat.setOnClickListener(this);
        removeVat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        amount=Integer.parseInt(vatAmount.getText().toString());
        rate=Integer.parseInt(vatRate.getText().toString());
        if(v.getId()==R.id.addVat){
            total=amount*((rate/100)+1);
            result.setText(Float.toString(total));
        }
        if(v.getId()==R.id.removeVat){
            vat=((rate/100)+1)/amount;
            total=(amount*vat);
            total-=amount;
            total*=-1;
            result.setText(Float.toString(total));
        }
    }
}
