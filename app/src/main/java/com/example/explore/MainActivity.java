package com.example.explore;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";


    private TextView pD, rD;
    private Spinner  s1, s2, s3;
    private TextView l1, l2, l3, l4, l5;
    private Button b1;
    private DatePickerDialog.OnDateSetListener DataSetListner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1=(TextView) findViewById(R.id.lable1);
        l2=(TextView) findViewById(R.id.lable2);
        l3=(TextView) findViewById(R.id.lable3);
        l4=(TextView) findViewById(R.id.lable4);
        l5=(TextView) findViewById(R.id.lable5);

        pD=(TextView) findViewById(R.id.pDate);
        pD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        MainActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        DataSetListner,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        DataSetListner = new DatePickerDialog.OnDateSetListener(){
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                Log.d(TAG,"OnDateSet:mm/dd/yyyy:" + month + "/" +day + "/" +year);

                String date = month+"/"+ day + "/" + year;
                pD.setText(date);



            }
        };


        rD=(TextView) findViewById(R.id.rDate);
        rD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        MainActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        DataSetListner,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        DataSetListner = new DatePickerDialog.OnDateSetListener(){
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                Log.d(TAG,"OnDateSet:mm/dd/yyyy:" + month + "/" +day + "/" +year);

                String date = month+"/"+ day + "/" + year;
                rD.setText(date);


            }
        };


        Spinner s1 =(Spinner) findViewById(R.id.spinner3);

        ArrayAdapter<String> myAdapter= new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_expandable_list_item_1,getResources().getStringArray(R.array.Cars));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(myAdapter);

        Spinner s2 =(Spinner) findViewById(R.id.spinner4);

        ArrayAdapter<String> myAdapter1= new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_expandable_list_item_1,getResources().getStringArray(R.array.model));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(myAdapter);


        Spinner s3 =(Spinner) findViewById(R.id.spinner5);

        ArrayAdapter<String> myAdapter2= new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_expandable_list_item_1,getResources().getStringArray(R.array.colour));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s3.setAdapter(myAdapter);



        b1=(Button) findViewById(R.id.bookbtn);

        Button b1 = (Button) findViewById(R.id.bookbtn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(MainActivity.this,Confirmation.class);
                startActivity(Intent);
            }
        });





    }



}
