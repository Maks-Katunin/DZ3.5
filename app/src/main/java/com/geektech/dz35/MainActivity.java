package com.geektech.dz35;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Model> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);

        initRecycler();
        loadData();
    }

    private void initRecycler() {
        Adapter adapter = new Adapter(data);
        recyclerView.setAdapter(adapter);

    }

    private void loadData() {
        data = new ArrayList<>();
        data.add(new Model(R.drawable.ic_faces, "ghfdsfg", 123659));
        data.add(new Model(R.drawable.ic_faces, "ghfdsfg", 123659));
        data.add(new Model(R.drawable.ic_faces, "ghfdsfg", 123659));
        data.add(new Model(R.drawable.ic_faces, "ghfdsfg", 123659));
        data.add(new Model(R.drawable.ic_faces, "ghfdsfg", 123659));
        data.add(new Model(R.drawable.ic_faces, "ghfdsfg", 123659));
        data.add(new Model(R.drawable.ic_faces, "ghfdsfg", 123659));
        data.add(new Model(R.drawable.ic_faces, "ghfdsfg", 123659));
        data.add(new Model(R.drawable.ic_faces, "ghfdsfg", 123659));
        data.add(new Model(R.drawable.ic_faces, "ghfdsfg", 123659));
        data.add(new Model(R.drawable.ic_faces, "ghfdsfg", 123659));
        data.add(new Model(R.drawable.ic_faces, "ghfdsfg", 123659));
        data.add(new Model(R.drawable.ic_faces, "ghfdsfg", 123659));
    }
}