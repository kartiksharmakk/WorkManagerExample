package com.example.workmanagerexample

import android.content.Context
import android.util.Log
import androidx.work.ListenableWorker
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.lang.Exception

class DownloadingWorker (context: Context, params: WorkerParameters): Worker(context,params) {
    override fun doWork(): ListenableWorker.Result {
        try {
            for (x in 0 until 3000) {
                Log.i("MYTAG", "Downloading $x")
            }

            return Result.success()
        } catch (e: Exception) {
            return Result.failure()
        }
    }
}