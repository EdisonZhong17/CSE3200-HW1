package com.example.robothomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var redRobot : ImageView
    private lateinit var whiteRobot : ImageView
    private lateinit var yellowRobot : ImageView
    private lateinit var clockWiseArrow : ImageButton
    private lateinit var antiClockWiseArrow : ImageButton
    private var turnCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        redRobot = findViewById(R.id.redRobot)
        whiteRobot = findViewById(R.id.whiteRobot)
        yellowRobot = findViewById(R.id.yellowRobot)
        clockWiseArrow = findViewById(R.id.clockwiseArrow)
        antiClockWiseArrow = findViewById(R.id.antiClockwiseArrow)

        clockWiseArrow.setOnClickListener{ view : View -> toggleImgClockwise() }
        antiClockWiseArrow.setOnClickListener{ view : View -> toggleImgAntiClockwise() }
    }
    /*
     * turnCount == 0 -> white robot is large
     * turnCount == 1 -> red robot is large
     * turnCount == 2 -> yellow robot is large
     */
    private fun toggleImgClockwise() {
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
            whiteRobot.setImageResource(R.drawable.king_of_detroit_robot_white_small)
            yellowRobot.setImageResource(R.drawable.king_of_detroit_robot_yellow_large)
        } else {
            redRobot.setImageResource(R.drawable.king_of_detroit_robot_red_small)
            whiteRobot.setImageResource(R.drawable.king_of_detroit_robot_white_large)
            yellowRobot.setImageResource(R.drawable.king_of_detroit_robot_yellow_small)
        }
    }

    /*
     * turnCount == 0 -> white robot is large
     * turnCount == 1 -> red robot is large
     * turnCount == 2 -> yellow robot is large
     */
    private fun toggleImgAntiClockwise() {
        turnCount--
        if (turnCount < 0) {
            turnCount = 2
        }
        if (turnCount == 1) {
            redRobot.setImageResource(R.drawable.king_of_detroit_robot_red_large)
            whiteRobot.setImageResource(R.drawable.king_of_detroit_robot_white_small)
            yellowRobot.setImageResource(R.drawable.king_of_detroit_robot_yellow_small)
        } else if (turnCount == 2) {
            redRobot.setImageResource(R.drawable.king_of_detroit_robot_red_small)
            whiteRobot.setImageResource(R.drawable.king_of_detroit_robot_white_small)
            yellowRobot.setImageResource(R.drawable.king_of_detroit_robot_yellow_large)
        } else {
            redRobot.setImageResource(R.drawable.king_of_detroit_robot_red_small)
            whiteRobot.setImageResource(R.drawable.king_of_detroit_robot_white_large)
            yellowRobot.setImageResource(R.drawable.king_of_detroit_robot_yellow_small)
        }
    }
}