package edu.boisestate.heffner_final

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.event.*

class Event : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.event)

        eventTitle.text = Events.getTitle()
        eventInfo.text = "Score: " + Events.getScore() + "\n" + Events.getEvent()

        //val extraString:String = intent.getStringExtra(KEY_EXTRA)

        setupUI()
    }

    private fun setupUI() {
        backButton.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java).apply {
                //putExtra(EditEvent.KEY_EXTRA, "new value")
            }
            startActivity(intent)

        }

        editButton.setOnClickListener {

            val intent = Intent(this, EditEvent::class.java).apply {
                //putExtra(EditEvent.KEY_EXTRA, "new value")
            }
            startActivity(intent)

        }

        val activity = AppCompatActivity()

    }

    //TODO: Have a number value from the main activity (if event 1 is picked, then "1" is the number)
    //TODO: Have the title be listOfTitles[1]
    //TODO: Have the description be descriptions[1]

}