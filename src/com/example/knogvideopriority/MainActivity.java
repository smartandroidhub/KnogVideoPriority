package com.example.knogvideopriority;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {
	
	String[] videoHigh = {"H1", "H2", "H3", "H4", "H5"};
	String[] videoMed = {"M1", "M2", "M3"};
	String[] videoLow = {"L1", "L2", "L3"};
	
	String sequence="";
int firstLoop, secondLoop, lowLoop=4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		while(firstLoop<=0){
			firstLoop = videoLow.length;
		}
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
