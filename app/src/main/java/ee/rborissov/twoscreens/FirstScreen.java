package ee.rborissov.twoscreens;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class FirstScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
    }

   public void goToSecondScreen(View v){
       Intent goSecondintent = new Intent(this, SecondScreen.class);
       startActivity(goSecondintent);
    }
}

