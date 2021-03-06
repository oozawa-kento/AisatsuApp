package jp.techacademy.kento.oozawa.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.TextureView
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),  View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)



    }


    override fun onClick(v: View) {
        if (v.id == R.id.button1) {
            showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                    Log.d("UI_PARTS", "$hour:$minute")
                },
                13, 0, true)
        timePickerDialog.show()
            if (hourOfDay >= 2  && minute >= 9) {
            textView.setText = "おはよう"
            } else if(hourOfDay >= 10 && minute >= 17) {
            textView.setTex = "こんにちわ"
            } else if (hourOfDay >= 18 && minute >= 1) {
            textView.setText = "こんばんは"
            }
        }


    }


}

