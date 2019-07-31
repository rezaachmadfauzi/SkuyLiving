package app.com.rezaachmadfauzi.walkthrough;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import app.com.rezaachmadfauzi.BottonNavigationActivity;
import app.com.rezaachmadfauzi.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        requestWindowFeature( Window.FEATURE_NO_TITLE );
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().getDecorView().setSystemUiVisibility( View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView( R.layout.activity_splash_screen );


        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {
                startActivity( new Intent( SplashScreenActivity.this, BottonNavigationActivity.class));
                finish();
            }
        },3000);
    }
}
