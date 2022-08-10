package com.example.addlist.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.addlist.Models.Notes;

@Database(entities = Notes.class, version = 1, exportSchema = false)
public abstract class RoomDB extends RoomDatabase {
    private static RoomDB databese;
    private static String DATABASE_NAME = "AddList";

    public synchronized static RoomDB getInstance(Context context){
        if (databese == null){
            databese = Room.databaseBuilder(context.getApplicationContext(),
                    RoomDB.class, DATABASE_NAME)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return databese;
    }

    public abstract MainDAO mainDAO();
}
