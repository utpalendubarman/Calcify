package com.pavitrawalia.calcify.ui.unit_conversion;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.pavitrawalia.calcify.R;

public class UnitConversionFragment extends Fragment {

    private UnitConversionViewModel homeViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = ViewModelProviders.of(this).get(UnitConversionViewModel.class);
        View root = inflater.inflate(R.layout.fragment_unit_conversion, container, false);
        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
            }
        });

        EditText edFrom = root.findViewById(R.id.edFromValue);
        final EditText edTo = root.findViewById(R.id.edToValue);

        edFrom.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String newVal = s.toString();
                edTo.setText(newVal);

            }
        });


        Spinner spCategory = root.findViewById(R.id.spUnitCategory);
        String[] categories = new String[]{"Length", "Temperature"};
        ArrayAdapter<String> adapterCategory = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_dropdown_item_1line,
                categories);
        spCategory.setAdapter(adapterCategory);

        Spinner spTypesFrom = root.findViewById(R.id.spFromType);
        String[] types = new String[]{"METER", "MILE"};
        ArrayAdapter<String> adapterFrom = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_dropdown_item_1line,
                types);
        spTypesFrom.setAdapter(adapterFrom);

        spTypesFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Spinner spTypesTo = root.findViewById(R.id.spToType);
        ArrayAdapter<String> adapterTypesTo = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_dropdown_item_1line,
                types);
        spTypesTo.setAdapter(adapterTypesTo);

        spTypesTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        return root;
    }


}