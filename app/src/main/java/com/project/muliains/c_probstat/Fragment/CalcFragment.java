package com.project.muliains.c_probstat.Fragment;


import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.project.muliains.c_probstat.Activity.MainActivity;
import com.project.muliains.c_probstat.Activity.MateriActivity;
import com.project.muliains.c_probstat.R;

/**
 * Created by Muliains on 08-Dec-17.
 */

public class CalcFragment extends android.support.v4.app.Fragment implements View.OnClickListener {
    Button btn;
    TextView a,b;
    EditText hasil,eta,etb;
    TextView tv;
    public CalcFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calc, container, false);
        tv= view.findViewById(R.id.tv_hasil);
        hasil = view.findViewById(R.id.et_hasil);
        eta=view.findViewById(R.id.et_a);
        etb=view.findViewById(R.id.et_b);
        a= view.findViewById(R.id.et_a);
        b= view.findViewById(R.id.et_b);
        btn = view.findViewById(R.id.btn_Hitung);
        btn.setOnClickListener(this);
        return view;
    }

    private void hitung(){

        if(eta.getText().length()<=0 ||etb.getText().length()<=0){
            eta.setHint("Inputkan Angka");

            etb.setHint("inputkan Angka");
//            eta.setHintTextColor(getResources().getColor(R.color.merah));
//            etb.setHintTextColor(getResources().getColor(R.color.merah));
        }else{
            double aa = Double.parseDouble(a.getText().toString());
            double bb = Double.parseDouble(b.getText().toString());
            aa=aa / bb;
            hasil.setText(String.valueOf(aa));
        }

    }

    @Override
    public void onClick(View view) {
        hitung();
    }
}
