package com.sbu.todolistv17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static List<Task> Task_List = new LinkedList<>();
    ListView listView;
    TaskAdapter ListAdapter;
    final Context context = this;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTask();
    }

    public void setTask(){
        listView = findViewById(R.id.ListView);
        ListAdapter = new TaskAdapter(this,R.layout.task_layout, Task_List);
        listView.setAdapter(ListAdapter);
        button = findViewById(R.id.addTask);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, AddingTask.class);
                context.startActivity(intent);
            }
        });
    }
}
