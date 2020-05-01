package edu.boisestate.heffner_final

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.edit_event.*

class EditEvent : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_event)

        //val extraString:String = intent.getStringExtra(KEY_EXTRA)

        setupUI()
    }

    private fun setupUI() {
        backButton.setOnClickListener {

            val intent = Intent(this, Event::class.java).apply {
                //putExtra(EditEvent.KEY_EXTRA, "new value")
            }
            startActivity(intent)

        }

        submitButton.setOnClickListener {

            Events.setScore(scoreText.text.toString().toInt())

            val intent = Intent(this, Event::class.java).apply {
                //putExtra(EditEvent.KEY_EXTRA, "new value")
            }
            startActivity(intent)

        }

        val activity = AppCompatActivity()

    }
}