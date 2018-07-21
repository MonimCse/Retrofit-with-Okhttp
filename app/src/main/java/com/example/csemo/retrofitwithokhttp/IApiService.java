package com.example.csemo.retrofitwithokhttp;

import com.example.csemo.retrofitwithokhttp.respons.CourseRespons;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IApiService {

    @GET("courses")
    Call<CourseRespons> getCourses();

}
