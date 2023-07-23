package com.example.naluripi

import android.app.Application
import com.example.naluripi.util.viewModelModule
import org.koin.core.context.startKoin

class NaluriApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        //init koin
        startKoin{
            modules(viewModelModule)
        }
    }
}