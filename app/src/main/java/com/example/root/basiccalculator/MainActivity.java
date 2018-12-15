package com.example.root.basiccalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //siapkan Variable
    private EditText editNilai1,editNilai2;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNilai1 = (EditText) findViewById(R.id.et1);
        editNilai2 = (EditText) findViewById(R.id.et2);

        tvHasil =(TextView) findViewById(R.id.tvHasil);
    }

    public void kali(View view) {
        int var1, var2;

        var1 = Integer.parseInt(editNilai1.getText().toString());
        var2 = Integer.parseInt(editNilai2.getText().toString());

        int hasil = var1*var2;

        tvHasil.setText(String.valueOf(hasil));

        Intent intent = new Intent(getApplicationContext(),HasilActivity.class);
        intent.putExtra("dataHasil",String.valueOf(hasil));
        startActivity(intent);
    }

    public void tambah(View view) {
        int var1, var2;

        var1 = Integer.parseInt(editNilai1.getText().toString());
        var2 = Integer.parseInt(editNilai2.getText().toString());

        int hasil = var1+var2;

        tvHasil.setText(String.valueOf(hasil));

        Intent intent = new Intent(getApplicationContext(),HasilActivity.class);
        intent.putExtra("dataHasil",String.valueOf(hasil));
        startActivity(intent);
    }

    public void kurang(View view) {
        int var1, var2;

        var1 = Integer.parseInt(editNilai1.getText().toString());
        var2 = Integer.parseInt(editNilai2.getText().toString());

        int hasil = var1-var2;

        tvHasil.setText(String.valueOf(hasil));

        Intent intent = new Intent(getApplicationContext(),HasilActivity.class);
        intent.putExtra("dataHasil",String.valueOf(hasil));
        startActivity(intent);
    }

    public void bagi(View view) {
        int var1, var2;

        var1 = Integer.parseInt(editNilai1.getText().toString());
        var2 = Integer.parseInt(editNilai2.getText().toString());

        double hasil = (double)var1/var2;

        tvHasil.setText(String.valueOf(hasil));

        Intent intent = new Intent(getApplicationContext(),HasilActivity.class);
        intent.putExtra("dataHasil",String.valueOf(hasil));
        startActivity(intent);
    }
}
