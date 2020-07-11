package com.muthi.covid_19_muthi_projectuas.api;

import com.muthi.covid_19_muthi_projectuas.model.CountryModel;
import com.muthi.covid_19_muthi_projectuas.model.RingkasanModel;
import com.muthi.covid_19_muthi_projectuas.model.RiwayatModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiEndPoint {
    @GET(Api.END_POINT_WORLD_HISTORY)
    Call<List<RiwayatModel>> getHistoryList(@Path("date") String date);

    @GET(Api.END_POINT_SUMMARY_WORLD)
    Call<RingkasanModel> getSummaryWorld();

    @GET(Api.END_POINT_IDN)
    Call<CountryModel> getSummaryIdn();
}
