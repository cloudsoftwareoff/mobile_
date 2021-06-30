package com.example.myapplication;
import android.widget.*;
import android.content.*;
import android.view.*;
import android.app.Activity;
import android.os.Bundle;

import com.example.myapplication.R;

public class ResultActivity extends Activity {

private LinearLayout linear1;
private TextView textview1;
private TextView textview2;
@Override
  protected void onCreate(Bundle savedInstanceState) { 
         super.onCreate(savedInstanceState);
   setContentView(R.layout.result);
         
         
linear1 = (LinearLayout) findViewById(R.id.linear1); 
textview1 = (TextView) findViewById(R.id.textview1); 
textview2 = (TextView) findViewById(R.id.textview2);

textview2.setText(getIntent().getStringExtra("res"));
}}