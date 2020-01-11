package com.pavitrawalia.calcify.ui.vat_gst_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.pavitrawalia.calcify.R;

public class GstCalculator extends AppCompatActivity implements View.OnClickListener {
    EditText gstAmount, gstRate;
    Button addGst,removeGst;
    private float amount=0,rate=0;
    private float total=0,gst=0;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gst_calculator);
        gstAmount=findViewById(R.id.gstAmount);
        gstRate=findViewById(R.id.gstRate);
        addGst=findViewById(R.id.AddGst);
        removeGst=findViewById(R.id.RemoveGst);
        addGst.setOnClickListener(this);
        result=findViewById(R.id.gstResult);
        removeGst.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        amount=Integer.parseInt(gstAmount.getText().toString());
        rate=Integer.parseInt(gstRate.getText().toString());
        gst=(rate/100)*amount;
        if(v.getId()==R.id.AddGst){
            total=gst+amount;
            result.setText(Float.toString(total));
        }
        if(v.getId()==R.id.RemoveGst){
            total=amount-gst;
            result.setText(Float.toString(total));
        }
    }
}
