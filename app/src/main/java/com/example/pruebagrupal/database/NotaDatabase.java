package com.example.pruebagrupal.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.pruebagrupal.Nota;

@Database(entities = {Nota.class}, version = 1)
public abstract class NotaDatabase extends RoomDatabase {
    public abstract NotaDao getNotaDao();

}