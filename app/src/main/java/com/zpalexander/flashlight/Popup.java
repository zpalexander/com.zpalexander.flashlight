package com.zpalexander.flashlight;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Popup extends Activity 
{

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.popup);
    }
	
	public void goBack(View view) {
		Intent intent = new Intent(this,Flashlight.class);
		this.startActivity(intent);
	}

}
