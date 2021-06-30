package com.example.myapplication;
import android.widget.*;
import android.content.*;
import android.view.*;
import android.app.Activity;
import android.os.Bundle;

import com.example.myapplication.R;

public class MainActivity extends Activity {

private LinearLayout linear2; 
private TextView textview1;
private EditText edittext1;
private TextView textview2;
private EditText edittext2;
private CheckBox checkbox1;
private Button button1;
private Intent render = new Intent();
    @Override
  protected void onCreate(Bundle savedInstanceState) { 
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

//initialize(savedInstanceState);

//initialize();
linear2 = (LinearLayout) findViewById(R.id.linear2);
 textview1 = (TextView) findViewById(R.id.textview1);
  textview1 = (TextView)
   findViewById(R.id.textview1);
   edittext2 = (EditText) findViewById(R.id.edittext2);
   edittext2 = (EditText) findViewById(R.id.edittext2);
    checkbox1 = (CheckBox) findViewById(R.id.checkbox1);
     button1 = (Button) findViewById(R.id.button1);
    
//String n1,n2;
button1.setOnClickListener(new View.OnClickListener() { 
@Override
public void onClick(View _view) {  
String n1=edittext1.getText().toString(); 
String n2=edittext2.getText().toString(); 
if(!(n1.equals("")&& n2.equals(""))){  



if (checkbox1.isChecked()) { 
render.putExtra("res",n1.concat(" ".concat(n2))); 
}else{
render.putExtra("res",n1.concat(n2));
} 
render.setClass(getApplicationContext(), ResultActivity.class); startActivity(render);
}else{
Toast.makeText(getApplicationContext(),"Champ vide",Toast.LENGTH_SHORT).show();
//SketchwareUtil.showMessage(getApplicationContext(), "l'un du chain est vide");
}}});

}}
