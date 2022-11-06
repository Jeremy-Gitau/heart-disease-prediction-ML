
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		homescreen
	 *	@date 		1656659692218
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.figma;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.content.Intent;
import android.widget.ImageView;

public class homescreen_activity extends Activity {

	
	private View __bg__homescreen_ek2;
	private ImageView e668a7d9c061052ef30f492713addeaf_1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);

		
		__bg__homescreen_ek2 = (View) findViewById(R.id.__bg__homescreen_ek2);
		e668a7d9c061052ef30f492713addeaf_1 = (ImageView) findViewById(R.id.e668a7d9c061052ef30f492713addeaf_1);
	
		
		__bg__homescreen_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), mask_group_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	