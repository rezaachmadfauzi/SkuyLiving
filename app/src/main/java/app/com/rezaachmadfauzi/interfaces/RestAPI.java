package app.com.rezaachmadfauzi.interfaces;

import app.com.rezaachmadfauzi.models.KajianModels;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RestAPI {


    @GET ("kajian/audio")
    Call<KajianModels> getKajian();


}
