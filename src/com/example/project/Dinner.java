package com.example.project;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Dinner extends Activity {
	
	EditText et[]=new EditText[17];
	float cal[]=new float[17];
	Button b;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dinner);
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
		
		cal[1]=60;
		cal[2]=75;
		cal[3]=150;
		cal[4]=150;
		cal[5]=100;
		cal[6]=120;
		cal[7]=250;
		cal[8]=150;
		cal[9]=150;
		cal[10]=175;
		cal[11]=150;
		cal[12]=30;
		cal[13]=150;
		cal[14]=200;
		cal[15]=100;
		cal[16]=100;
		
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
		getMenuInflater().inflate(R.menu.dinner, menu);
		return true;
	}

}
