package com.zpalexander.flashlight;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupWindow;

public class Flashlight extends Activity {

    Camera camera = null;
    Parameters parameters;
    private PopupWindow pwindo;
    Button btnClosePopup;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashlight);
	    final ImageButton led_toggle = (ImageButton)findViewById(R.id.led_toggle);
	    final ImageButton screen_toggle = (ImageButton)findViewById(R.id.screen_toggle);
	}


    public void changeLED(View view) {
	    if (camera==null) {
		    camera = Camera.open();
		    parameters = camera.getParameters();
		    parameters.setFlashMode(Parameters.FLASH_MODE_TORCH);
		    camera.setParameters(parameters);
	    }
	    else {
		    parameters.setFlashMode(Parameters.FLASH_MODE_OFF);
		    camera.setParameters(parameters);
		    camera.release();
		    camera = null;
	    }
    }


    public void changeScreen(View view) {
    	Intent intent = new Intent(this,Popup.class);
		this.startActivity(intent);
    }
}
