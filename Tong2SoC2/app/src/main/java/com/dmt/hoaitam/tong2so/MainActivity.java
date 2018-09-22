package com.dmt.hoaitam.tong2so;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableRow;
import android.widget.TextView;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    EditText edta,edtb;
    TextView tvSum;
    Button btSum,btClear,btExit;
    Context context = this;
    int a,b,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // kết nối id xml với class
        edta =(EditText)findViewById(R.id.edta);
        edtb =(EditText)findViewById(R.id.edtb);

        btSum = (Button)findViewById(R.id.bttong);
        tvSum=(TextView)findViewById(R.id.tvSum);

        // gọi các hàm
        Tinh_tong();


    }



    public void Tinh_tong()
    {
        btSum.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // kiểm tra nhập số liệu có đúng kiểu nguyên không
                try {
                    a =Integer.parseInt(edta.getText()+"");
                } catch (Exception e) {
                    edta.setText("");
                    edta.requestFocus();
                    Toast.makeText(getApplication(), "", 1).show();
                    return;
                }

                try {
                    b=Integer.parseInt(edtb.getText()+"");
                } catch (Exception e) {
                    edtb.setText("");
                    edtb.requestFocus();
                    Toast.makeText(getApplication(), "", 1).show();
                    return;
                }
                // bắt đầu tính toán
                // tổng hai số
                sum = a+b;
                //hiện thị tổng
                tvSum.setText(tvSum.getText().toString()+sum);


            }
        });
    }
    public void clear_data()
    {
        btClear.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                edta.setText("");
                edtb.setText("");
                a=b=sum=0;
                tvSum.setText("");
            }
        });
    }
}

