package com.pavitrawalia.calcify.ui.general;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.pavitrawalia.calcify.R;

public class GeneralFragment extends Fragment implements View.OnClickListener {

    private GeneralViewModel homeViewModel;
    private TextView input, signBox;
    private Button btn_log,btn_ln,btn_root,btn_factorial,btn_power,btn_sin,btn_cos,btn_tan;
    private Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0;
    private Button btn_add,btn_subtract,btn_multiply,btn_divide,btn_equal,btn_dot,btn_clear,btn_delete;
    private String sign, value1, value2;
    private Double num1, num2, result;
    private boolean hasDot;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(GeneralViewModel.class);
        View root = inflater.inflate(R.layout.fragment_general, container, false);
        input=root.findViewById(R.id.input);
        signBox =root.findViewById(R.id.sign);
        hasDot = false;
        btn_1=root.findViewById(R.id.btn_1);
        btn_2=root.findViewById(R.id.btn_2);
        btn_3=root.findViewById(R.id.btn_3);
        btn_4=root.findViewById(R.id.btn_4);
        btn_5=root.findViewById(R.id.btn_5);
        btn_6=root.findViewById(R.id.btn_6);
        btn_7=root.findViewById(R.id.btn_7);
        btn_8=root.findViewById(R.id.btn_8);
        btn_9=root.findViewById(R.id.btn_9);
        btn_0=root.findViewById(R.id.btn_0);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_0.setOnClickListener(this);

        btn_log=root.findViewById(R.id.btn_log);
        btn_ln=root.findViewById(R.id.btn_ln);
        btn_root=root.findViewById(R.id.btn_root);
        btn_factorial=root.findViewById(R.id.btn_factorial);
        btn_power=root.findViewById(R.id.btn_power);
        btn_sin=root.findViewById(R.id.btn_sin);
        btn_cos=root.findViewById(R.id.btn_cos);
        btn_tan=root.findViewById(R.id.btn_tan);

        btn_log.setOnClickListener(this);
        btn_ln.setOnClickListener(this);
        btn_root.setOnClickListener(this);
        btn_factorial.setOnClickListener(this);
        btn_power.setOnClickListener(this);
        btn_sin.setOnClickListener(this);
        btn_cos.setOnClickListener(this);
        btn_tan.setOnClickListener(this);

        btn_add=root.findViewById(R.id.btn_add);
        btn_add.setOnClickListener(this);

        btn_equal=root.findViewById(R.id.btn_equal);
        btn_equal.setOnClickListener(this);

        btn_subtract=root.findViewById(R.id.btn_subtract);
        btn_subtract.setOnClickListener(this);

        btn_multiply=root.findViewById(R.id.btn_multiply);
        btn_multiply.setOnClickListener(this);

        btn_divide=root.findViewById(R.id.btn_divide);
        btn_divide.setOnClickListener(this);

        btn_dot=root.findViewById(R.id.btn_dot);
        btn_dot.setOnClickListener(this);

        btn_clear=root.findViewById(R.id.btn_clear);
        btn_clear.setOnClickListener(this);

        return root;
    }
    //Button Operations
    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn_log)
        {btnClick_log(v);}
        if(v.getId()==R.id.btn_ln)
        { btnClick_ln(v);}
        if(v.getId()==R.id.btn_root)
        {btnClick_root(v);}
        if(v.getId()==R.id.btn_factorial)
        {btnClick_factorial(v);}
        if(v.getId()==R.id.btn_power)
        {btnClick_power(v);}
        if(v.getId()==R.id.btn_sin)
            btnClick_sin(v);
        if(v.getId()==R.id.btn_cos)
            btnClick_cos(v);
        if(v.getId()==R.id.btn_tan)
            btnClick_tan(v);
        if(v.getId()==R.id.btn_add)
            btnClick_add(v);
        if(v.getId()==R.id.btn_subtract)
            btnClick_subtract(v);
        if(v.getId()==R.id.btn_multiply)
            btnClick_multiply(v);
        if(v.getId()==R.id.btn_divide)
            btnClick_divide(v);
        if(v.getId()==R.id.btn_equal)
            btnClick_equal(v);
        if(v.getId()==R.id.btn_clear)
            btnClick_clear(v);
        if(v.getId()==R.id.btn_delete)
            btnClick_delete(v);
        if(v.getId()==R.id.btn_dot)
            btnClick_dot(v);
        if(v.getId()==R.id.btn_1)
            btnClick_1(v);
        if(v.getId()==R.id.btn_2)
            btnClick_2(v);
        if(v.getId()==R.id.btn_3)
            btnClick_3(v);
        if(v.getId()==R.id.btn_4)
            btnClick_4(v);
        if(v.getId()==R.id.btn_5)
            btnClick_5(v);
        if(v.getId()==R.id.btn_6)
            btnClick_6(v);
        if(v.getId()==R.id.btn_7)
            btnClick_7(v);
        if(v.getId()==R.id.btn_8)
            btnClick_8(v);
        if(v.getId()==R.id.btn_9)
            btnClick_9(v);
        if(v.getId()==R.id.btn_0)
            btnClick_0(v);
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_0(View view) {
        input.setText(input.getText() + "0");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_1(View view) {
        input.setText(input.getText() + "1");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_2(View view) {
        input.setText(input.getText() + "2");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_3(View view) {
        input.setText(input.getText() + "3");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_4(View view) {
        input.setText(input.getText() + "4");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_5(View view) {
        input.setText(input.getText() + "5");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_6(View view) {
        input.setText(input.getText() + "6");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_7(View view) {
        input.setText(input.getText() + "7");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_8(View view) {
        input.setText(input.getText() + "8");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_9(View view) {
        input.setText(input.getText() + "9");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_dot(View view) {
        if (!hasDot) {
            if (input.getText().equals("")) {

                input.setText("0.");
            } else {

                input.setText(input.getText() + ".");
            }

            hasDot = true;
        }

    }

    public void btnClick_add(View view) {
        sign = "+";
        value1 = input.getText().toString();
        input.setText(" ");
        signBox.setText(value1+"+");
        hasDot = false;
    }

    public void btnClick_subtract(View view) {
        sign = "-";
        value1 = input.getText().toString();
        input.setText(" ");
        signBox.setText(value1+"-");
        hasDot = false;
    }

    public void btnClick_multiply(View view) {
        sign = "*";
        value1 = input.getText().toString();
        input.setText(" ");
        signBox.setText(value1+"×");
        hasDot = false;
    }

    public void btnClick_divide(View view) {
        sign = "/";
        value1 = input.getText().toString();
        input.setText(" ");
        signBox.setText(value1+"÷");
        hasDot = false;
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_log(View view) {
        sign = "log";
        input.setText(" ");
        signBox.setText("log");
        hasDot = false;
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_ln(View view) {
        sign = "ln";
        input.setText(" ");
        signBox.setText("ln");
        hasDot = false;
    }

    public void btnClick_power(View view) {
        sign = "power";
        value1 = input.getText().toString();
        input.setText(" ");
        hasDot = false;
        signBox.setText("xⁿ");
    }

    public void btnClick_factorial(View view) {
        sign = "factorial";
        input.setText(null);
        hasDot = false;
        signBox.setText("!");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_sin(View view) {
        sign = "sin";
        input.setText(" ");
        hasDot = false;
        signBox.setText("sin");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_cos(View view) {
        sign = "cos";
        input.setText(" ");
        hasDot = false;
        signBox.setText("cos");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_tan(View view) {
        sign = "tan";
        input.setText(" ");
        hasDot = false;
        signBox.setText("tan");
    }

    public void btnClick_root(View view) {
        sign = "root";
        input.setText(" ");
        hasDot = false;
        signBox.setText("√");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_equal(View view) {
        if (sign == null) {
            signBox.setText("Error!");
        } else if (input.getText().equals("")) {
            signBox.setText("Error!");
        } else if ((sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) && value1.equals("")) {
            signBox.setText("Error!");
        } else {
            switch (sign) {
                default:
                    break;
                case "log":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.log10(num1) + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "ln":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.log(num1) + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "power":
                    num1 = Double.parseDouble((value1));
                    value2 = input.getText().toString();
                    num2 = Double.parseDouble(value2);
                    input.setText(Math.pow(num1, num2) + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "root":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.sqrt(num1) + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "factorial":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    int i = Integer.parseInt(value1) - 1;

                    while (i > 0) {
                        num1 = num1 * i;
                        i--;
                    }

                    input.setText(num1 + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "sin":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.sin(num1) + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "cos":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.cos(num1) + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "tan":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.tan(num1) + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "+":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 + num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "-":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 - num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "*":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 * num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    break;
                case "/":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 / num2;
                    input.setText(result + "");
                    sign = null;
                    signBox.setText(null);
                    break;
            }

        }
    }


    public void btnClick_delete(View view) {
        if (input.getText().equals("")) {
            input.setText(null);
        } else {
            int len = input.getText().length();
            String s = input.getText().toString();
            if (s.charAt(len - 1) == '.') {
                hasDot = false;
                input.setText(input.getText().subSequence(0, input.getText().length() - 1));

            } else {
                input.setText(input.getText().subSequence(0, input.getText().length() - 1));
            }
        }
    }

    public void btnClick_clear(View view) {

        input.setText(null);
        signBox.setText(null);
        value1 = null;
        value2 = null;
        sign = null;
        hasDot = false;
    }


}