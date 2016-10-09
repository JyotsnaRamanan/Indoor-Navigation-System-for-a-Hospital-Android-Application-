package com.android.src.indoornavigation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class XRaydept extends Activity {
	  public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.xraydept);
	        Button btn_back = (Button)findViewById(R.id.btn_xrayback);
	        btn_back.setOnClickListener(new OnClickListener(){
	        	public void onClick(View view){
	        		Intent intent = new Intent(XRaydept.this,IndoorNavigation.class);
	        		startActivity(intent);
	        	}
	        });
	  }

}
