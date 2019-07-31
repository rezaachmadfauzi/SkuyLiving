package app.com.rezaachmadfauzi.walkthrough;

public class IntroModel {

    String Title,Description;
    int Intro;

    public IntroModel(String title, String description, int screenImg) {
        Title = title;
        Description = description;
        Intro = screenImg;
    }


    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getOnBoardingImg() {
        return Intro;
    }

    public void setOnBoardingImg(int onBoardingImg) {
        Intro = onBoardingImg;
    }

}
