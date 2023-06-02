package com.hashaan.openinapp.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.hashaan.openinapp.interfaces.DashboardRepository
import com.hashaan.openinapp.model.DashboardDetails
import com.hashaan.openinapp.repository.DashboardRepositoryImpl
import com.hashaan.openinapp.utils.Resource
import io.reactivex.disposables.CompositeDisposable

class DashboardViewModel() : ViewModel() {

    private val dashboardRepository: DashboardRepository = DashboardRepositoryImpl()

    fun getNewDashboard() : LiveData<Resource<DashboardDetails>> {
        return dashboardRepository.getNewDashboard()
    }

}