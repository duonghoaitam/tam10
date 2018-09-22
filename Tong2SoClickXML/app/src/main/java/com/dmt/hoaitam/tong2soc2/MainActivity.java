package com.dmt.hoaitam.tong2soc2;



import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends Activity {
    EditText edta,edtb;
    TextView tvSum;
    Button btSum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // kết nối id xml với class
        edta =(EditText)findViewById(R.id.edta);
        edtb =(EditText)findViewById(R.id.edtb);

        btSum = (Button)findViewById(R.id.btSum);
        tvSum=(TextView)findViewById(R.id.tvSum);}
        public void MyClick(View v){
            {
                EditText edita=(EditText) findViewById(R.id.editsoa);
                int a=Integer.parseInt(edita.getText()+"");
                EditText editb=(EditText) findViewById(R.id.editsob);
                int b=Integer.parseInt(editb.getText()+"");
                TextView txtkq=(TextView) findViewById(R.id.txtkq);
                txtkq.setText((a+b)+"");

            }
        }}


