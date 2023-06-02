package com.hashaan.openinapp.repository

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.hashaan.openinapp.interfaces.DashboardHttpInterface
import com.hashaan.openinapp.interfaces.DashboardRepository
import com.hashaan.openinapp.model.DashboardDetails
import com.hashaan.openinapp.utils.AppDelegate
import com.hashaan.openinapp.utils.Constants
import com.hashaan.openinapp.utils.Resource
import com.hashaan.openinapp.utils.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DashboardRepositoryImpl() : DashboardRepository {

    private val dashboardHttpInterface: DashboardHttpInterface

    init {
        dashboardHttpInterface = RetrofitClient.getClientWithInterceptor(AppDelegate.getInstance().bearerToken).create(DashboardHttpInterface::class.java)
    }

    override fun getNewDashboard(): LiveData<Resource<DashboardDetails>> {
        val result: MutableLiveData<Resource<DashboardDetails>> = MutableLiveData<Resource<DashboardDetails>>()
        dashboardHttpInterface.getNewDashboard()
            .enqueue(object : Callback<DashboardDetails> {
                override fun onResponse(
                    call: Call<DashboardDetails>,
                    response: Response<DashboardDetails>,
                ) {
                    if (response.isSuccessful()) {
                        result.setValue(Resource.Companion.success(response.body()))
                    } else {
                        result.setValue(Resource.Companion.error("Error", null))
                    }
                }

                override fun onFailure(call: Call<DashboardDetails>, t: Throwable) {
                    result.setValue(Resource.Companion.error("Error", null))
                }
            })
        return result
    }
}