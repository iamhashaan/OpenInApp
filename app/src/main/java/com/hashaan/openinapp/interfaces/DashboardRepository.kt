package com.hashaan.openinapp.interfaces

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.hashaan.openinapp.model.DashboardDetails
import com.hashaan.openinapp.utils.Resource
import retrofit2.http.GET

interface DashboardRepository {

    fun getNewDashboard(): LiveData<Resource<DashboardDetails>>
}