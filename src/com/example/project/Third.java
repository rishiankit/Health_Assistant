package com.example.project;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Third extends Activity {

	Button b1,b2,b3,b4;
	static float totalcal=0,extraCalories=0;
	float totalrem=0;
	TextView tv1,tv2,tv3;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		b3=(Button)findViewById(R.id.button3);
		b4=(Button)findViewById(R.id.button4);
		tv1=(TextView)findViewById(R.id.textView1);
		tv2=(TextView)findViewById(R.id.textView2);
		tv3=(TextView)findViewById(R.id.textView3);
		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(getApplicationContext(), Breakfast.class);
				startActivity(i);
			}
		});
		
		
			b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(getApplicationContext(), Lunch.class);
				startActivity(i);
			}
		});


	b3.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i=new Intent(getApplicationContext(), Dinner.class);
		startActivity(i);
	}
});
	
	tv2.setText(String.valueOf(totalcal));
	if(totalcal>1500){ 
		extraCalories= totalcal-1500;
		tv3.setText(String.valueOf(extraCalories));
	
	}
	
	b4.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		if(extraCalories>0)
			{
			Intent i=new Intent(getApplicationContext(),Fourth.class);
			startActivity(i);
			}
		else
			Toast.makeText(getApplicationContext(), "Hey you can Rest Today ",Toast.LENGTH_SHORT).show();
		}
	});
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		tv2.setText(String.valueOf(totalcal));
		if(totalcal>1500){ 
			extraCalories= totalcal-1500;
			tv3.setText(String.valueOf(extraCalories));
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.third, menu);
		return true;
	}

}
