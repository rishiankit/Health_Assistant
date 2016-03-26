package com.example.project;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class Fourth extends Activity {
	
	RadioButton rb[]=new RadioButton[10];
	RadioGroup rg;
	TextView tv;
	float res=0;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fourth);
		
		tv=(TextView)findViewById(R.id.textView2);
		
		rg=(RadioGroup)findViewById(R.id.radioGroup1);
		rb[1]=(RadioButton)findViewById(R.id.radioButton1);
		rb[2]=(RadioButton)findViewById(R.id.radioButton2);
		rb[3]=(RadioButton)findViewById(R.id.radioButton3);
		rb[4]=(RadioButton)findViewById(R.id.radioButton4);
		rb[5]=(RadioButton)findViewById(R.id.radioButton5);
		rb[6]=(RadioButton)findViewById(R.id.radioButton6);
		rb[7]=(RadioButton)findViewById(R.id.radioButton7);
		rb[8]=(RadioButton)findViewById(R.id.radioButton8);
		rb[9]=(RadioButton)findViewById(R.id.radioButton9);
		
		rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch(checkedId)
				{
				case R.id.radioButton1 : res=(Third.extraCalories/236)*60; break;
				case R.id.radioButton2 : res=(Third.extraCalories/944)*60; break;
				case R.id.radioButton3 : res=(Third.extraCalories/944)*60; break;
				case R.id.radioButton4 : res=(Third.extraCalories/195)*60; break;
				case R.id.radioButton5 : res=(Third.extraCalories/531)*60; break;
				case R.id.radioButton6 : res=(Third.extraCalories/325)*60; break;
				case R.id.radioButton7 : res=(Third.extraCalories/413)*60; break;
				case R.id.radioButton8 : res=(Third.extraCalories/472)*60; break;
				case R.id.radioButton9 : res=(Third.extraCalories/266)*60; break;
				
				}
				
			tv.setText(String.valueOf(String.format("%.02f",res))+" min");
			
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fourth, menu);
		return true;
	}

}
