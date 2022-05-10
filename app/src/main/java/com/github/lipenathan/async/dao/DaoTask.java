package com.github.lipenathan.async.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.github.lipenathan.async.model.Task;

import java.util.List;

@Dao
public interface DaoTask {

    @Insert
    void salvar(Task task);

    @Query("select * from task")
    List<Task> buscarTodos();

    @Delete
    void remover(Task task);

    @Update
    void editar(Task task);
}
