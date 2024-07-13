package com.bitcode.a10_06_24_intentfilterdemo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.StrictMode
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bitcode.a10_06_24_intentfilterdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        StrictMode.setVmPolicy(StrictMode.VmPolicy.Builder().build())

        activityMainBinding.btnViewImage.setOnClickListener {

            val intent = Intent("com.bitcode.action.media.VIEW")
            intent.setAction("android.intent.action.VIEW")
            intent.addCategory("com.bitcode.category.TECHNICAL")
            intent.setDataAndType(Uri.parse("file://${activityMainBinding.edtPath.text.toString()}"),
                "image/png")

//          intent.putExtra("path",activityMainBinding.edtPath.text.toString())
            startActivity(intent)
        }
    }
}