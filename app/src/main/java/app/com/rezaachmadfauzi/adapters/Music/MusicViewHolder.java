package app.com.rezaachmadfauzi.adapters.Music;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import app.com.rezaachmadfauzi.MusicActivity;
import app.com.rezaachmadfauzi.MusicFragment;
import app.com.rezaachmadfauzi.R;
import app.com.rezaachmadfauzi.models.ResultKajian;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MusicViewHolder extends RecyclerView.ViewHolder {
    @BindView( R.id.txtTitleKajian )
    TextView txtTitleKajian;
    @BindView( R.id.imgKajian )
    ImageView imgKajian;
    List<ResultKajian> resultKajianList=new ArrayList<>(  );

    public MusicViewHolder(@NonNull View itemView) {
        super( itemView );
        ButterKnife.bind( this,itemView );
    }

    public void setItem(List<ResultKajian> resultKajianList){
        this.resultKajianList=resultKajianList;
    }

    @OnClick()
    public void klik(@NonNull View itemView){
        int position=getAdapterPosition();

        String Title = resultKajianList.get( position ).getTitle();
        String Audio = resultKajianList.get( position ).getAudioUrl();
        String Gambar = resultKajianList.get( position ).getImageUrl();
        String Speaker= resultKajianList.get( position ).getSpeaker();
        Toast.makeText( itemView.getContext(),"Kajian : "+resultKajianList.get( position ).getTitle(),Toast.LENGTH_LONG ).show();


        Intent intent = new Intent( itemView.getContext(),MusicActivity.class );
        intent.putExtra( "Title",Title );
        intent.putExtra( "Audio",Audio );
        intent.putExtra( "Gambar",Gambar );
        intent.putExtra( "Speaker",Speaker );

        itemView.getContext().startActivity( intent );


    }
}
