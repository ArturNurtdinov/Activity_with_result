package com.example.resultactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        back_button.setOnClickListener {
            val intent = Intent()
            intent.putExtra(MainActivity.KEY, "Some data")
            setResult(MainActivity.RESULT_CODE, intent)
            finish()
        }
    }
}
