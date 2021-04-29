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
    private ArrayList<Tecito> listaproductos;
    Adaptertecito adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        NotaLab instancia = NotaLab.get(this);

        instancia.addNota(new Nota("99","wwwwwww"));

        ArrayList<Tecito> losTes = new ArrayList<>();
        losTes.add(new Tecito(instancia.getNota("99").getMensaje(),R.drawable.a1,"peazo de te" ));
        losTes.add(new Tecito("Te Rojo",R.drawable.a2,"peazo de te"));
        losTes.add(new Tecito("Te Amarillo",R.drawable.a3,"peazo de te"));
        losTes.add(new Tecito("Te Negro",R.drawable.a5,"peazo de te"));









        RecyclerView recyclerView = findViewById(R.id.rvtecito);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adaptertecito(this, losTes);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);



    }



    @Override
    public void onItemClick(View view, int position) {

        Intent i = new Intent(MainActivity.this, DetalleTecito.class);
        i.putExtra("posicion", String.valueOf(position));
        startActivity(i);


    }


}