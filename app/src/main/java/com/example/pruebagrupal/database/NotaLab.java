package com.example.pruebagrupal.database;

import android.annotation.SuppressLint;
import android.content.Context;

import androidx.room.Room;

import com.example.pruebagrupal.Nota;

import java.util.List;

public class NotaLab {
    @SuppressLint("StaticFieldLeak")
    private static NotaLab sNotaLab;

    private NotaDao mNotaDao;

    private NotaLab(Context context) {
        Context appContext = context.getApplicationContext();
        NotaDatabase database = Room.databaseBuilder(appContext, NotaDatabase.class, "nota")
                .allowMainThreadQueries().build();
        mNotaDao = database.getNotaDao();
    }

    public static NotaLab get(Context context) {
        if (sNotaLab == null) {
            sNotaLab = new NotaLab(context);
        }
        return sNotaLab;
    }

    public List<Nota> getNotas() {
        return mNotaDao.getNotas();
    }

    public Nota getNota(String id) {
        return mNotaDao.getNota(id);
    }

    public void addNota(Nota nota) {
        mNotaDao.addNota(nota);
    }

    public void updateNota(Nota nota) {
        mNotaDao.updateNota(nota);
    }

    public void deleteNota(Nota nota) {
        mNotaDao.deleteNota(nota);
    }
}