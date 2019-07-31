package app.com.rezaachmadfauzi.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import app.com.rezaachmadfauzi.R;
import app.com.rezaachmadfauzi.walkthrough.IntroActivity;
import app.com.rezaachmadfauzi.walkthrough.IntroModel;

public class IntroViewPagerAdapter extends PagerAdapter {
    Context mContext ;
    List<IntroModel> mListScreen;

    public IntroViewPagerAdapter(Context mContext, List<IntroModel> mListScreen) {
        this.mContext = mContext;
        this.mListScreen = mListScreen;
    }

    public IntroViewPagerAdapter(IntroActivity mContext, List<IntroModel> mList) {

    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View IntroScreen = inflater.inflate(R.layout.intro_screen,null);

        ImageView imgSlide = IntroScreen.findViewById( R.id.onboardingImg);
        TextView title = IntroScreen.findViewById(R.id.onboardingTitle);
        TextView description = IntroScreen.findViewById(R.id.onboardingDescription);

        title.setText(mListScreen.get(position).getTitle());
        description.setText(mListScreen.get(position).getDescription());
        imgSlide.setImageResource(mListScreen.get(position).getOnBoardingImg());

        container.addView(IntroScreen);

        return IntroScreen;
    }

    @Override
    public int getCount() {
        return mListScreen.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}