package com.github.lipenathan.async.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.github.lipenathan.async.dao.AsyncDatabase;
import com.github.lipenathan.async.dao.DaoTask;
import com.github.lipenathan.async.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskListAdapter extends BaseAdapter {

    private final Context context;
    private final List<Task> alunos = new ArrayList<>();
    private DaoTask daoTask;

    public TaskListAdapter(Context context) {
        this.context = context;
        this.daoTask = AsyncDatabase.getInstance(context).getDaoTask();
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
