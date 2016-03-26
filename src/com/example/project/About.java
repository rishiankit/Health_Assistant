package com.example.project;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.app.Activity;
import android.view.Menu;
import android.widget.ScrollView;

public class About extends Activity {
	int i=0;
	ScrollView scroll;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		scroll=(ScrollView)findViewById(R.id.scrollview4);
		
		
		new CountDownTimer(500000,1) { 
		     public void onTick(long millisUntilFinished) { 
		    	 scroll.scrollTo(0,(int) (500000-millisUntilFinished)/50);
		    	 scroll.scrollBy(1,0);
		    	
		   }

			@Override
			public void onFinish() {
				// TODO Auto-generated method stub
				
			}
		}.start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.about, menu);
		return true;
	}

}
