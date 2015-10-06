package ee.rborissov.twoscreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class SecondScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
    }
    public void goToFirstScreen(View v){
        Intent goFirstIntent = new Intent(this, FirstScreen.class);
        startActivity(goFirstIntent);
    }

    }

