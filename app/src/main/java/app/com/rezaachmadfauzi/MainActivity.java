package app.com.rezaachmadfauzi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import app.com.rezaachmadfauzi.fragments.ChannelFragment;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ChannelFragment myf = new ChannelFragment();

        final android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.mainFrame,myf);
        transaction.addToBackStack(null);
        transaction.commit();

    }
}
