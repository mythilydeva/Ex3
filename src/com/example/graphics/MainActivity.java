package com.example.graphics;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;  


public class MainActivity extends ActionBarActivity {
	Button rect,sq,cir,str;
	TextView text;
	EditText ed1,ed2,ed3,ed4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rect=(Button) findViewById(R.id.rect);
        sq=(Button) findViewById(R.id.sq);
        cir=(Button) findViewById(R.id.cir);
        str=(Button) findViewById(R.id.str);
        text=(TextView) findViewById(R.id.text);
        ed1=(EditText) findViewById(R.id.ed1);
        ed2=(EditText) findViewById(R.id.ed2);
        ed3=(EditText) findViewById(R.id.ed3);
        ed4=(EditText) findViewById(R.id.ed4);
        
        rect.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String data=ed1.getText().toString();
				Intent i=new Intent(MainActivity.this,SecondActivity.class);
				i.putExtra("one", data);
				startActivity(i);
			}
		});
        sq.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String data=ed2.getText().toString();
				Intent i=new Intent(MainActivity.this,SecondActivity.class);
				i.putExtra("two", data);
				startActivity(i);
			}
		});
        cir.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			String data=ed3.getText().toString();
			Intent i=new Intent(MainActivity.this,SecondActivity.class);
			i.putExtra("three", data);
			startActivity(i);
		}
	});
        str.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			String data=ed4.getText().toString();
			Intent i=new Intent(MainActivity.this,SecondActivity.class);
			i.putExtra("four", data);
			startActivity(i);
		}
	});
    
    
    

    }
}
   

    

