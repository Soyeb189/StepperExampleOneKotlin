package com.bankasia.stepperexampleonekotlin

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import params.com.stepview.StatusViewScroller

class MainActivity : AppCompatActivity() {

    private lateinit var statusViewScroller:StatusViewScroller

    private lateinit var firstP: Button
   private lateinit var secondP:android.widget.Button
   private lateinit var thirdP:android.widget.Button
   private lateinit var firstN:android.widget.Button
   private lateinit var secondN:android.widget.Button
   private lateinit var thirdN:android.widget.Button
   private lateinit var first: LinearLayout
   private lateinit var second:LinearLayout
   private lateinit var third:LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        statusViewScroller = findViewById(R.id.status)

        firstP = findViewById(R.id.firstPrevious)
        secondP = findViewById(R.id.secondPrevious)
        thirdP = findViewById(R.id.thirdPrevious)
        firstN = findViewById(R.id.firstNext)
        secondN = findViewById(R.id.secondNext)
        thirdN = findViewById(R.id.thirdNext)

        first = findViewById(R.id.firstLyt)
        second = findViewById(R.id.secondtLyt)
        third = findViewById(R.id.thirdLyt)

        statusViewScroller.statusView.run {
            currentCount = 1
            circleFillColorCurrent = Color.RED
        }

        firstN.setOnClickListener {
            statusViewScroller.statusView.run {
                currentCount = 2
                circleFillColorCurrent = Color.RED
            }
            statusViewScroller.smoothScrollToStep(4).run {
                currentFocus
            }
            first.visibility = View.GONE
            second.visibility = View.VISIBLE
            third.visibility = View.GONE
        }

        secondN.setOnClickListener {
            statusViewScroller.statusView.run {
                currentCount = 4
                circleFillColorCurrent = Color.RED
            }
            first.visibility = View.GONE
            second.visibility = View.GONE
            third.visibility = View.VISIBLE
        }

        thirdP.setOnClickListener {
            statusViewScroller.statusView.run {
                currentCount = 2
                circleFillColorCurrent = Color.RED
            }
            first.visibility = View.GONE
            second.visibility = View.VISIBLE
            third.visibility = View.GONE
        }

        secondP.setOnClickListener {
            statusViewScroller.statusView.run {
                currentCount = 1
                circleFillColorCurrent = Color.RED
            }
            first.visibility = View.VISIBLE
            second.visibility = View.GONE
            third.visibility = View.GONE
        }

        //statusViewScroller.scrollToStep(stepCount = 5)

    }
}