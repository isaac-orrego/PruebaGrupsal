package com.example.pruebagrupal;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.util.UUID;
@Entity(tableName = "nota")
public class Nota {
    @PrimaryKey
    @NonNull
    private String mId;
    @ColumnInfo(name = "contenido")
    private String nombre;
    private String descripcion;
    private int foto;

    public Nota() {
        mId = UUID.randomUUID().toString();
    }

    @NonNull
    public String getId() {
        return mId;
    }

    public void setId(@NonNull String id) {
        mId = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setMensaje(String nombre) {
        nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public Nota(@NonNull String mId, String nombre, String descripcion, int foto) {
        this.mId = mId;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.foto = foto;
    }
}