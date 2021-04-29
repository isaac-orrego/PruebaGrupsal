package com.example.pruebagrupal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pruebagrupal.database.NotaLab;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Adaptertecito.ItemClickListener {

    ImageView imageView;
    TextView textView;
    TextView textView1;
    ArrayList lasNotas;

    Adaptertecito adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        NotaLab instancia = NotaLab.get(this);

        instancia.addNota(new Nota("111", "Te Verde", "Un Terrible peazo de te", R.drawable.a1));
        instancia.addNota(new Nota("222", "Te Amarillo", "Un Terrible peazo de te", R.drawable.a3));
        instancia.addNota(new Nota("333", "Te Rojo", "Un Terrible peazo de te", R.drawable.a2));
        instancia.addNota(new Nota("444", "Te Negro", "Un Terrible peazo de te", R.drawable.a5));


        lasNotas = new ArrayList();

        lasNotas.add(instancia.getNota("111"));
        lasNotas.add(instancia.getNota("222"));
        lasNotas.add(instancia.getNota("333"));
        lasNotas.add(instancia.getNota("444"));


        RecyclerView recyclerView = findViewById(R.id.rvtecito);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adaptertecito(this, lasNotas);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);



    }



    @Override
    public void onItemClick(View view, int position)  {

        switch (position){

            case 0:
                Intent intent = new Intent(this,DetalleVerde.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(this,DetalleRojo.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(this,DetalleAmarillo.class);
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(this,DetalleTecito.class);
                startActivity(intent3);
                break;
            default:
                Toast.makeText(this, "no hay mas tes", Toast.LENGTH_SHORT).show();
                break;

        }



    }


}