package com.example.a7minutworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import com.example.a7minutworkout.databinding.ActivityExerciseBinding

class ExerciseActivity : AppCompatActivity() {

    // GLOBAL VARIABLES:

    // Create an object starting with "Activity" + "YurActivityNameStart" + "Binding" .
    private var binding: ActivityExerciseBinding? = null

    // Variable for Timer which will be initialized later.
    private var countDownTimer: CountDownTimer? = null

    // The duration of the timer in milliseconds
    private var timerDuration: Long = 60000

    // pauseOffset = timerDuration -time lift
    private var pauseOffset: Long = 0
    private var isOn = false

    //MY GLOBAL VARIABLES:
    private var exerciseMap = hashMapOf<String, Double>()


    // onCreate:
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // INITIALIZATIONS:
        exerciseMap.put("JUMP", 0.5)
        exerciseMap.put("RUN", 0.5)



        // Setting Up:
        // Assign bindingObject to layoutInflater  (fill)
        binding = ActivityExerciseBinding.inflate(layoutInflater)
        // Set Content View with (binding?.root)
        setContentView(binding?.root)

        // Enabling the Toolbar as an ActionBar.
        setSupportActionBar(binding?.toolbarExercise)
        if (supportActionBar != null) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
        // Enabling back navigation button.
        binding?.toolbarExercise?.setNavigationOnClickListener {
            onBackPressed()
            resetTimer()
        }

//        for (exercise in exerciseMap) {
//
//            binding?.tvTitle?.text = exercise.key
//            timerDuration = ((exercise.value * 60) * 1000).toLong()
//            binding?.tvTimer?.text = "${exercise.value * 60}"
//            binding?.prgressBar?.max = (exercise.value * 60).toInt()
//            binding?.prgressBar?.progress = (timerDuration / 1000).toInt()
//            startTimer(pauseOffset)
//            isOn = true
//            resetTimer()
//
//        }





//        // TIMER ON CLICK:
//        binding?.flProgressBar?.setOnClickListener {
//            if (!isOn) {
//                startTimer(pauseOffset)
//            } else {
//                pauseTimer()
//            }
//            isOn = isOn != true
//
//        }

    }

    // onDestroy
    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }


    //Functions:
    private fun startTimer(pauseOffsetL: Long) {
        countDownTimer = object : CountDownTimer(timerDuration - pauseOffsetL, 1000) {
            override fun onTick(millisUntilFinished: Long) {


                pauseOffset = timerDuration - millisUntilFinished
                binding?.tvTimer?.text = (millisUntilFinished / 1000).toString()
                binding?.prgressBar?.progress = (millisUntilFinished / 1000).toInt()

            }

            override fun onFinish() {
                Toast.makeText(this@ExerciseActivity, "Timer is finished", Toast.LENGTH_SHORT)
                    .show()
            }
        }.start()
    }

    private fun pauseTimer() {
        if (countDownTimer != null) {
            countDownTimer!!.cancel()
        }
    }

    private fun resetTimer() {
        if (countDownTimer != null) {
            countDownTimer!!.cancel()
            binding?.tvTimer?.text = "${(timerDuration / 1000).toString()}"
            binding?.prgressBar?.progress = (timerDuration / 1000).toInt()
            countDownTimer = null
            pauseOffset = 0
        }
    }
}