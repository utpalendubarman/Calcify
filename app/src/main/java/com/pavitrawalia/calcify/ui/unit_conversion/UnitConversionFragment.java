package com.pavitrawalia.calcify.ui.unit_conversion;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.pavitrawalia.calcify.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class UnitConversionFragment extends Fragment {

    private static final String TAG = "UnitConversionFragment";
    @BindView(R.id.spUnitCategory)
    Spinner spUnitCategory;
    @BindView(R.id.edFromValue)
    EditText edFromValue;
    @BindView(R.id.spFromType)
    Spinner spFromType;
    @BindView(R.id.btnSwap)
    Button btnSwap;
    @BindView(R.id.edToValue)
    EditText edToValue;
    @BindView(R.id.spToType)
    Spinner spToType;

    private UnitConversionViewModel homeViewModel;
    private String category;
    private int categoryIndex;
    int pos1,pos2;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = ViewModelProviders.of(this).get(UnitConversionViewModel.class);
        View root = inflater.inflate(R.layout.fragment_unit_conversion, container, false);
        homeViewModel.getText().observe(this, s -> {
        });

        ButterKnife.bind(this, root);


        // watch input value then calculate result.
        edFromValue.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                calculateResult();

            }
        });


        // adapter for category
        ArrayAdapter<String> adapterCategory = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_dropdown_item_1line,
                Converter.converters);
        spUnitCategory.setAdapter(adapterCategory);
        spUnitCategory.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                updateSpinners(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                updateSpinners(0);
            }
        });


        spFromType.setAdapter(getAdapter(0));
        spFromType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                calculateResult();
                pos1=position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spToType.setAdapter(getAdapter(0));
        spToType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                calculateResult();
                pos2=position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        return root;
    }

    private void calculateResult() {
        // after text change make calculation
        try {
            double res = Converter.convert(categoryIndex,
                    (String) (spFromType.getSelectedItem()),
                    (String) (spToType.getSelectedItem()),
                    Double.parseDouble(edFromValue.getText().toString()));
            String newVal = String.valueOf(res);
            edToValue.setText(newVal);
        } catch (Exception e) {
            // here get if input is empty
            edToValue.setText("");
        }
    }

    private void updateSpinners(int position) {
        // save category name to be used later in 'convert' method
        category = Converter.converters[position];
        categoryIndex = position;
        // update adapter with new units
        spFromType.setAdapter(getAdapter(position));
        spToType.setAdapter(getAdapter(position));
        // to choose different unit
        spToType.setSelection(1);
        Log.d(TAG, "updateSpinners: cat" + category);
    }

    private SpinnerAdapter getAdapter(int position) {
        return new ArrayAdapter<>(getContext(),
                android.R.layout.simple_dropdown_item_1line,
                Converter.getConverterUnit(position)
        );
    }


    @OnClick(R.id.btnSwap)
    void onViewClicked() {
        pos1=spFromType.getSelectedItemPosition();
        pos2=spToType.getSelectedItemPosition();
        spToType.setSelection(pos1);
        spFromType.setSelection(pos2);

    }
}