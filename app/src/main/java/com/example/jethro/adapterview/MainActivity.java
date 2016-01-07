package com.example.jethro.adapterview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

   private ImageView imageview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        imageview=(ImageView) findViewById(R.id.imageView);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);


        spinner.setOnItemSelectedListener(this);

        List<String> categories = new ArrayList<String>();
        categories.add("Earth");
        categories.add("Jupiter");
        categories.add("Pluto");
        categories.add("Mercury");
        categories.add("Mars");
        categories.add("Saturn");
        categories.add("Uranus");
        categories.add("Venus");


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(dataAdapter);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();

        if(position==1)
        {

            imageview.setImageResource(R.drawable.earth);
        }
        if(position==2)
        {

            imageview.setImageResource(R.drawable.jupiter);
        }if(position==3)
        {

            imageview.setImageResource(R.drawable.pluto);
        }
        if(position==4)
        {

            imageview.setImageResource(R.drawable.mercury);
        }
        if(position==5)
        {

            imageview.setImageResource(R.drawable.mars);
        }
        if(position==6)
        {

            imageview.setImageResource(R.drawable.saturn);
        }
        if(position==7)
        {

            imageview.setImageResource(R.drawable.uranus);
        }
        if(position==8)
        {

            imageview.setImageResource(R.drawable.venus);
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {



    }
}
