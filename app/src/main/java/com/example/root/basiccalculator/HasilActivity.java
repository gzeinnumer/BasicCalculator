package com.example.root.basiccalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {
    private TextView tvFinal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        tvFinal =(TextView)findViewById(R.id.txtHasilFinal);

        Intent intent = getIntent();
        String data = (String) intent.getSerializableExtra("dataHasil");

        tvFinal.setText(data);


    }
}
