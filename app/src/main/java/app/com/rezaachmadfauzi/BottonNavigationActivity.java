package app.com.rezaachmadfauzi;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import app.com.rezaachmadfauzi.fragments.ChannelFragment;

public class BottonNavigationActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener  {
//    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    loadFragment( new ChannelFragment() );
//                    mTextMessage.setText( R.string.title_home );
                    return true;
                case R.id.navigation_dashboard:
                    loadFragment( new MusicFragment() );
//                    mTextMessage.setText( R.string.title_dashboard );
                    return true;
                case R.id.navigation_notifications:
//                    mTextMessage.setText( R.string.title_notifications );
                    loadFragment( new ChannelFragment() );
                    //Toast.makeText( getApplicationContext(),"Belum di set",Toast.LENGTH_LONG ).show();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        requestWindowFeature( Window.FEATURE_NO_TITLE);
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView( R.layout.activity_botton_navigation );
        BottomNavigationView navView = findViewById( R.id.nav_view );
        navView.setOnNavigationItemSelectedListener( mOnNavigationItemSelectedListener );
        String source;





        loadFragment( new ChannelFragment() );
    }

    void loadFragment(Fragment fragment){
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frameLayout,fragment);
        ft.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }
}
