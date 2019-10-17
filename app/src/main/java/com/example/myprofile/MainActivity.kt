package com.example.myprofile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.myprofile.profile
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var photo:ImageView? = null;
    var edubutton:Button? = null;
    var workbutton:Button? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        photo=findViewById(R.id.profile)
        photo?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity,com.example.myprofile.profile::class.java);
            startActivity(clickIntent);
        })

        edubutton=findViewById(R.id.edubut);
        edubutton?.setOnClickListener({
            var clickIntent=Intent(this@MainActivity,com.example.myprofile.Education::class.java);
            startActivity(clickIntent);
        })

        workbutton=findViewById(R.id.workbut);
        workbutton?.setOnClickListener({
            var clickIntent=Intent(this@MainActivity,com.example.myprofile.WorkExp::class.java);
            startActivity(clickIntent);
        })


    }
}
