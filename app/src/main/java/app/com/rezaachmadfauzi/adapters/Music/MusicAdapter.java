package app.com.rezaachmadfauzi.adapters.Music;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

import app.com.rezaachmadfauzi.R;
import app.com.rezaachmadfauzi.models.ResultKajian;

public class MusicAdapter extends RecyclerView.Adapter<MusicViewHolder> {
    Context context;
    List<ResultKajian> resultKajianList;

    public MusicAdapter(Context context,List<ResultKajian> resultKajianList){
        this.context=context;
        this.resultKajianList=resultKajianList;
    }
    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from( context ).inflate( R.layout.item_music,viewGroup,false );
        return new MusicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder musicViewHolder, int i) {
        ResultKajian resultKajian=resultKajianList.get( i );
        musicViewHolder.txtTitleKajian.setText( resultKajian.getTitle() );
        //Mulai Glide
        Glide.with(context)
                .load(resultKajian.getImageUrl())
                .apply(new RequestOptions().override(100,100).centerCrop())
                .into(musicViewHolder.imgKajian);
        //End Glide
        musicViewHolder.setItem( resultKajianList );
    }

    @Override
    public int getItemCount() {
        return resultKajianList.size();
    }
}
