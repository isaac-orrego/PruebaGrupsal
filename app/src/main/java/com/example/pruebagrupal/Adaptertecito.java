package com.example.pruebagrupal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class Adaptertecito extends RecyclerView.Adapter<Adaptertecito.ViewHolder> {

    private List<Tecito> mData;
    private LayoutInflater mInflater;
    private Context context;
    private ItemClickListener mClickListener;


    Adaptertecito(Context context, List<Tecito> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.terecycler, parent, false);
        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Tecito tecito = mData.get(position);

        holder.nombre.setText(mData.get(position).getNombre());



         holder.foto.setImageResource(mData.get(position).getFoto());





    }


    @Override
    public int getItemCount() {
        return mData.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView nombre;
        ImageView foto;


        ViewHolder(View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.tvnombre);
            foto = itemView.findViewById(R.id.imfoto);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }


  public String getItem(int id) {
        return mData.get(id).getNombre().toString();
    }


    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }


    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}