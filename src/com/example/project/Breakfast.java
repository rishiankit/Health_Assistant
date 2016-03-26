package com.example.project;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class Breakfast extends Activity {
	
	
	//EditText et1,et2,et3,et4,et5,et6,et7,et8,et9,et10,et11,et12,et13,et14,et15,et16;
		EditText et[]=new EditText[17];
		float cal[]=new float[17];
		Button b;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_breakfast);
		this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
		et[1]=(EditText)findViewById(R.id.editText1);
		et[2]=(EditText)findViewById(R.id.editText2);
		et[3]=(EditText)findViewById(R.id.editText3);
		et[4]=(EditText)findViewById(R.id.editText4);
		et[5]=(EditText)findViewById(R.id.editText5);
		et[6]=(EditText)findViewById(R.id.editText6);
		et[7]=(EditText)findViewById(R.id.editText7);
		et[8]=(EditText)findViewById(R.id.editText8);
		et[9]=(EditText)findViewById(R.id.editText9);
		et[10]=(EditText)findViewById(R.id.editText10);
		et[11]=(EditText)findViewById(R.id.editText11);
		et[12]=(EditText)findViewById(R.id.editText12);
		et[13]=(EditText)findViewById(R.id.editText13);
		et[14]=(EditText)findViewById(R.id.editText14);
		et[15]=(EditText)findViewById(R.id.editText15);
		et[16]=(EditText)findViewById(R.id.editText16);
		
		cal[1]=75;
		cal[2]=420;
		cal[3]=95;
		cal[4]=245;
		cal[5]=220;
		cal[6]=105;
		cal[7]=140;
		cal[8]=290;
		cal[9]=105;
		cal[10]=190;
		cal[11]=220;
		cal[12]=1160;
		cal[13]=45;
		cal[14]=155;
		cal[15]=980;
		cal[16]=30;
		
		b=(Button)findViewById(R.id.button1);
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				for(int i=1;i<=16;i++)
				{
					Third.totalcal=Third.totalcal+(Float.parseFloat(et[i].getText().toString())*cal[i]);
				}
		
				
				finish();
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.breakfast, menu);
		return true;
	}

}
