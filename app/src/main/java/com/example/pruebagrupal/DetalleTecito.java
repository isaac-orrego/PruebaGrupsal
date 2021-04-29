package com.example.pruebagrupal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleTecito extends AppCompatActivity {

    private TextView txt1, txt2;
    private ImageView img1;
    public  Adaptertecito adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_tecito);

        txt1 = (TextView)findViewById(R.id.tvNombre);
        txt2 = (TextView)findViewById((R.id.tvDesc));
        img1 = (ImageView)findViewById(R.id.imageView);

        String str = getIntent().getStringExtra("posicion"); int pos = Integer.parseInt(str);

    }







}