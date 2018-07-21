package com.example.csemo.retrofitwithokhttp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.csemo.retrofitwithokhttp.respons.CourseRespons;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



       String BASE_URL = "https://www.udacity.com/public-api/v0/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        IApiService apiService =
                retrofit.create(IApiService.class);


        Call<CourseRespons> call = apiService.getCourses();
        call.enqueue(new Callback<CourseRespons>() {
            @Override
            public void onResponse(Call<CourseRespons> call, Response<CourseRespons> response) {
                int statusCode = response.code();
                CourseRespons courseRespons = response.body();
            }

            @Override
            public void onFailure(Call<CourseRespons> call, Throwable t) {
                // Log error here since request failed
            }
        });

    }
}
