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
        eventInfo.text = "Score: " + Events.getScore(Events.getIndex()) + "\n" + Events.getEvent()

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

}