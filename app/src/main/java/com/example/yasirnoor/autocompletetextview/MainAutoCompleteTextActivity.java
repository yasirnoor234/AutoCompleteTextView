package com.example.yasirnoor.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainAutoCompleteTextActivity extends AppCompatActivity {

    String[] countryNameList = {"India", "China", "Australia", "New Zealand", "England", "Pakistan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_auto_complete_text);

        AutoCompleteTextView simpleAutoCompleteTextView = (AutoCompleteTextView)findViewById(R.id.simpleAutoCompleteTextView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, countryNameList);

        simpleAutoCompleteTextView.setAdapter(adapter);
        simpleAutoCompleteTextView.setThreshold(1);//start searching from 1 character
        simpleAutoCompleteTextView.setAdapter(adapter);   //set the adapter for displaying country name list

    }
}
