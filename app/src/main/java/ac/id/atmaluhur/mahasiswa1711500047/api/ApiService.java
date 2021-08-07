package ac.id.atmaluhur.mahasiswa1711500047.api;

import ac.id.atmaluhur.mahasiswa1711500047.model.ListLocationModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("JsonDisplayMarkerHospital.php")
    Call<ListLocationModel> getHospital();

    @GET("JsonDisplayMarkerRestaurant.php")
    Call<ListLocationModel> getRestaurant();

    @GET("JsonDisplayMarkerSekolah.php")
    Call<ListLocationModel> getSekolah();
}
