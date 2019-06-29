package com.ardakazanci.colormyviewsapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setListeners()


    }


    /**
     * Tüm view elemanlarına listener ekleniyor.
     */

    private fun setListeners() {

        /**
         * Tüm view elemanlarının id ' si listOf ile list olarak tutuluyor.
         */

        val clickableViews: List<View> =
            listOf(
                box_one_text, box_two_text, box_three_text, box_four_text, box_five_text,

                red_button, yellow_button, green_button
            )


        /**
         * Hangi view elemanına tıklandıysa makeColored metodu çağırılıyor.
         * Bu metot içerisinde when ile tıklanan view elemanının kendisi bulunuyor.
         */
        for (item in clickableViews) {
            item.setOnClickListener {
                makeColored(it)
            }
        }

    }

    private fun makeColored(it: View?) {


        // Hangi view id ' sine sahip elemana tıklanıyorsa renk değiştiriliyor.

        when (it!!.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> it.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> it.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> it.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> it.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> it.setBackgroundResource(android.R.color.holo_green_light)


            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)


            else -> it.setBackgroundColor(Color.LTGRAY)
        }

    }
}
