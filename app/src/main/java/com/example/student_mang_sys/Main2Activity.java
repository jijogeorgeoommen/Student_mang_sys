package com.example.student_mang_sys;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView newacc=findViewById(R.id.newreg);
    }

    public void newaccount(View view) {
        LayoutInflater inflat=LayoutInflater.from(Main2Activity.this);
        View cuslay=inflat.inflate(R.layout.newaccountalert,null);

        CardView cview=cuslay.findViewById(R.id.cdview);
        Button studentac=cuslay.findViewById(R.id.studacc);
        Button staffac=cuslay.findViewById(R.id.staffacc);
        AlertDialog.Builder AB=new AlertDialog.Builder(Main2Activity.this);
        AB.setView(cuslay);
        final AlertDialog A=AB.create();
        A.show();
        studentac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main2Activity.this,studentreg.class);
                startActivity(i);
            }
        });



    }
}
