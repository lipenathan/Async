package com.github.lipenathan.async.dao;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.github.lipenathan.async.model.Task;

@Database(entities = {Task.class}, version = 1, exportSchema = false)
public abstract class AsyncDatabase extends RoomDatabase {

    private static final String DB_NAME = "task.db";

    public abstract DaoTask getDaoTask();

    public static AsyncDatabase getInstance(Context context) {
        return Room.databaseBuilder(context, AsyncDatabase.class, DB_NAME).allowMainThreadQueries()
                .addMigrations(new Migration(0, 1) {
                    @Override
                    public void migrate(@NonNull SupportSQLiteDatabase database) {
                        database.execSQL(
                                "CREATE TABLE IF NOT EXISTS `task` " +
                                        "(`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                                        "`description` TEXT," +
                                        "`date` TEXT," +
                                        "`done` TEXT)");
                    }
                }).build();
    }
}
