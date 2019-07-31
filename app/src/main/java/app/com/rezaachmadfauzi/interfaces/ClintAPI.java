package app.com.rezaachmadfauzi.interfaces;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ClintAPI {

    private static Retrofit retrofit;
    public static Retrofit get (String BASE_URL){

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory( GsonConverterFactory.create())
                    .build();
        }
        return retrofit;

    }

}