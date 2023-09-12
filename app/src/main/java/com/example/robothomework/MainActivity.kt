package com.example.robothomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var redRobot : ImageView
    private lateinit var whiteRobot : ImageView
    private lateinit var yellowRobot : ImageView
    private var turnCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        redRobot = findViewById(R.id.redRobot)
        whiteRobot = findViewById(R.id.whiteRobot)
        yellowRobot = findViewById(R.id.yellowRobot)

        redRobot.setOnClickListener{ view : View -> toggleImg() }
        whiteRobot.setOnClickListener{ view : View -> toggleImg() }
        yellowRobot.setOnClickListener{ view : View -> toggleImg() }
    }

    /*
     * turnCount == 0 -> yellow is large
     * turnCount == 1 -> red is large
     * turnCount == 2 -> white is large
     */
    private fun toggleImg() {
        turnCount++
        if (turnCount > 3) {
            turnCount = 1
        }
        if (turnCount == 1) {
            redRobot.setImageResource(R.drawable.king_of_detroit_robot_red_large)
            whiteRobot.setImageResource(R.drawable.king_of_detroit_robot_white_small)
            yellowRobot.setImageResource(R.drawable.king_of_detroit_robot_yellow_small)
        } else if (turnCount == 2) {
            redRobot.setImageResource(R.drawable.king_of_detroit_robot_red_small)
            whiteRobot.setImageResource(R.drawable.king_of_detroit_robot_white_large)
            yellowRobot.setImageResource(R.drawable.king_of_detroit_robot_yellow_small)
        } else {
            redRobot.setImageResource(R.drawable.king_of_detroit_robot_red_small)
            whiteRobot.setImageResource(R.drawable.king_of_detroit_robot_white_small)
            yellowRobot.setImageResource(R.drawable.king_of_detroit_robot_yellow_large)
        }
    }
}