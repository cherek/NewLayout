package com.connected.parking.controller;
  
import com.connected.parking.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

public class AboutController extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.about_controller);
		
		/*final ActionBar actionBar = (ActionBar) findViewById(R.id.actionbar);
        actionBar.setHomeAction(new IntentAction(this, createIntent(this), R.drawable.getback));
        actionBar.setTitle("About");

        final Action shareAction = new IntentAction(this, null, R.drawable.multlist);
        actionBar.addAction(shareAction); */
	}
	
	public static Intent createIntent(Context context) {
		
		Intent i = new Intent(context, SettingController.class);
	    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    return i;
	}

    private Intent createShareIntent() {
    
    	final Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "Shared from the ActionBar widget.");
        return Intent.createChooser(intent, "Share");

    }

	
}
