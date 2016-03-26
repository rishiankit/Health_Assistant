package com.example.project;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		@SuppressWarnings("unused")
		MenuInflater inflater = getMenuInflater();
		return true;
		 
	        
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		
		switch (item.getItemId()) {
		
		case R.id.BMI : Toast.makeText(getApplicationContext(), "BMI",Toast.LENGTH_SHORT).show();
						Intent i=new Intent(MainActivity.this,Second.class);
						startActivity(i);
							break;
		case R.id.Calories : Toast.makeText(getApplicationContext(), "Calories",Toast.LENGTH_SHORT).show();
								Intent i1=new Intent(getApplicationContext(), Third.class);
								startActivity(i1);
								break;
		case R.id.Diet : Toast.makeText(getApplicationContext(), "Diet",Toast.LENGTH_SHORT).show(); 
						 Intent i5=new Intent(getApplicationContext(),DietPlan.class);
						 startActivity(i5);
						 break;
		case R.id.credits : Toast.makeText(getApplicationContext(), "help",Toast.LENGTH_SHORT).show();
							Intent i4=new Intent(getApplicationContext(),Credits.class);
							startActivity(i4);
							break;
		case R.id.About : Toast.makeText(getApplicationContext(), "About",Toast.LENGTH_SHORT).show(); 
							Intent i2=new Intent(getApplicationContext(), About.class);
							startActivity(i2);
							break;
		case R.id.Customer : Toast.makeText(getApplicationContext(), "Customer",Toast.LENGTH_SHORT).show();
							Intent i6=new Intent(getApplicationContext(),Customer.class);
							startActivity(i6);
		
							break;
		
		
		}
		
		return super.onOptionsItemSelected(item);
		
		
		
	}

}
