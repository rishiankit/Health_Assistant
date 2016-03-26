package com.example.project;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DietPlan extends Activity {
	float goal=0;
	EditText et;
	TextView tv;
	Button b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_diet_plan);
		
		et=(EditText)findViewById(R.id.editText1);
		tv=(TextView)findViewById(R.id.textView2);
		b=(Button)findViewById(R.id.button1);
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				goal=(float)28.5*(Float.parseFloat(et.getText().toString()));
				tv.setText(String.valueOf(goal)+" Calories needed to maintain your weight ");
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.diet_plan, menu);
		return true;
	}

}
