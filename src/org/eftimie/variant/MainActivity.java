package org.eftimie.variant;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void sendMessage(View view){
		
		
		Random r = new Random();
		
		if (r.nextInt(50)>25){
			
		    TextView textView = new TextView(this);
		    textView.setTextSize(40);
		    CharSequence message = "NO";
			textView.setText(message);
		    // Set the text view as the activity layout
		    setContentView(textView);
		}
		
		else{	
			
	    // Create the text view
		
	    TextView textView = new TextView(this);
	    textView.setTextSize(40);
	    CharSequence message = "YES";
		textView.setText(message);
	    // Set the text view as the activity layout
	    setContentView(textView);
		}
		
	}

}
