package com.example.project;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Second extends Activity {
	
	Button b;
	EditText et1,et2;
	TextView tv1;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		et1=(EditText)findViewById(R.id.editText1);
		et2=(EditText)findViewById(R.id.editText2);
		b=(Button)findViewById(R.id.button1);
		tv1=(TextView)findViewById(R.id.textView2);
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				float height=(Float.parseFloat(et1.getText().toString()))/100;
				float weight=Float.parseFloat(et2.getText().toString());
				float BMI=weight/(height*height);
				tv1.setText(String.valueOf(BMI));
				
			}
		}); 
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

}
