package app.com.rezaachmadfauzi;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.io.IOException;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MusicActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_music );

        ButterKnife.bind( this );

        String Title = getIntent().getExtras().getString( "Title" );
        String Audio = getIntent().getExtras().getString( "Audio" );
        String Gambar = getIntent().getExtras().getString( "Gambar" );
        String Speaker = getIntent().getExtras().getString( "Speaker" );

        ImageView GambarK = (ImageView)findViewById( R.id.foto );
        TextView AudioK = (TextView)findViewById( R.id.audio);
        TextView TitleK =(TextView)findViewById( R.id.title);
        TextView Speakerk = (TextView) findViewById( R.id.Speaker );


        AudioK.setText( Audio );
        TitleK.setText( Title );
        Speakerk.setText( Speaker );

        Glide.with(this)
                .load( ""+Gambar )
                .apply( new RequestOptions().override( 150,150  ).centerCrop() )
                .into( GambarK );

         url = Audio; // your URL here
         mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType( AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer.setDataSource(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mediaPlayer.prepare(); // might take long! (for buffering, etc)
        } catch (IOException e) {
            e.printStackTrace();
        }
        mediaPlayer.start();



    }

    @OnClick(R.id.MusikStart)
    public void start(){
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType( AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer.setDataSource(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mediaPlayer.prepare(); // might take long! (for buffering, etc)
        } catch (IOException e) {
            e.printStackTrace();
        }
        mediaPlayer.start();
        mediaPlayer.start();
    }
    @OnClick(R.id.MusikStop)
    public void stop(){
        mediaPlayer.stop();

    }


}
