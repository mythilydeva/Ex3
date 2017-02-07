package com.example.graphics;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;  


public class MainActivity extends ActionBarActivity {
	Button rect,sq,cir,str;
	TextView text;
	EditText ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rect=(Button) findViewById(R.id.rect);
        sq=(Button) findViewById(R.id.sq);
        cir=(Button) findViewById(R.id.cir);
        str=(Button) findViewById(R.id.str);
        text=(TextView) findViewById(R.id.text1);
        ed1=(EditText) findViewById(R.id.ed1);
        
        
        rect.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String data="rectangle";
				String val=ed1.getText().toString();
				Intent i=new Intent(MainActivity.this,SecondActivity.class);
				i.putExtra("value", data);
				i.putExtra("dimension", val);
				startActivity(i);
			}
		});
        sq.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String data="square";
				String val=ed1.getText().toString();
				Intent i=new Intent(MainActivity.this,SecondActivity.class);
				i.putExtra("value", data);
				i.putExtra("dimension", val);
				startActivity(i);
			}
		});
        cir.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			String data="circle";
			String val=ed1.getText().toString();
			Intent i=new Intent(MainActivity.this,SecondActivity.class);
			i.putExtra("value", data);
			i.putExtra("dimension", val);
			startActivity(i);
		}
	});
        str.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			String data="string";
			String val=ed1.getText().toString();
			Intent i=new Intent(MainActivity.this,SecondActivity.class);
			i.putExtra("value", data);
			i.putExtra("dimension", val);
			startActivity(i);
		}
	});
    
    
    

    }
}
   

    

