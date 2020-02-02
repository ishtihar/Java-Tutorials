package com.irk.javatutorials;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";
    private Context context;
    ArrayList<String> titleArrayList;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;
        titleArrayList = new ArrayList<String>();
        titleArrayList.add(Constants.WHAT_IS_JAVA);
        titleArrayList.add(Constants.HISTORY_OF_JAVA);
        titleArrayList.add(Constants.FEATURES_OF_JAVA);
        titleArrayList.add(Constants.FIRST_JAVA_PROGRAM);
        mRecyclerView = (RecyclerView) findViewById(R.id.title_recycler);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.addItemDecoration(new SimpleDividerItemDecoration(this));

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        TitleAdapter adapter = new TitleAdapter(context, titleArrayList, new CustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                Intent descintent=new Intent(context,FinalActivity.class);
                descintent.putExtra("titles",titleArrayList.get(position));
                startActivity(descintent);
                Toast.makeText(context, "clicked - " + titleArrayList.get(position).replace("_"," "), Toast.LENGTH_SHORT).show();
            }
        });
        mRecyclerView.setAdapter(adapter);
    }
}
