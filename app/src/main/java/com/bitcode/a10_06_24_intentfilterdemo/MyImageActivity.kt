package com.bitcode.a10_06_24_intentfilterdemo

import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bitcode.a10_06_24_intentfilterdemo.databinding.MyimageActivityBinding
import java.io.InputStream
import java.net.URL

class MyImageActivity : AppCompatActivity() {
    private lateinit var myimageActivityBinding: MyimageActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        myimageActivityBinding = MyimageActivityBinding.inflate(layoutInflater)
        setContentView(myimageActivityBinding.root)

        myimageActivityBinding.img.setImageURI(intent.data)

//        if (intent.hasExtra("path")){
//            myimageActivityBinding.img.setImageURI(Uri.parse(intent.getStringExtra("path")))
//        }
    }
}