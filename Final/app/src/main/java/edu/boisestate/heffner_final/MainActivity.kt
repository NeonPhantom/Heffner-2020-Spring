package edu.boisestate.heffner_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameText.text = User.name
        dogText.text = User.dogName

        setupUI()
    }

    private fun setupUI() {
        editButton.setOnClickListener {


            val intent = Intent(this, EnterName::class.java).apply {
                //putExtra(EditEvent.KEY_EXTRA, "new value")
            }
            startActivity(intent)

        }

        event1Button.setOnClickListener {
            Events.setIndex(0)
            val intent = Intent(this, Event::class.java).apply {

            }
            startActivity(intent)
        }

        event2Button.setOnClickListener {
            Events.setIndex(1)
            val intent = Intent(this, Event::class.java).apply {

            }
            startActivity(intent)
        }

        event3Button.setOnClickListener {
            Events.setIndex(2)
            val intent = Intent(this, Event::class.java).apply {

            }
            startActivity(intent)
        }

        event4Button.setOnClickListener {
            Events.setIndex(3)
            val intent = Intent(this, Event::class.java).apply {

            }
            startActivity(intent)
        }

        event5Button.setOnClickListener {
            Events.setIndex(4)
            val intent = Intent(this, Event::class.java).apply {

            }
            startActivity(intent)
        }

        event6Button.setOnClickListener {
            Events.setIndex(5)
            val intent = Intent(this, Event::class.java).apply {

            }
            startActivity(intent)
        }

        event7Button.setOnClickListener {
            Events.setIndex(6)
            val intent = Intent(this, Event::class.java).apply {

            }
            startActivity(intent)
        }

        event8Button.setOnClickListener {
            Events.setIndex(7)
            val intent = Intent(this, Event::class.java).apply {

            }
            startActivity(intent)
        }

        event9Button.setOnClickListener {
            Events.setIndex(8)
            val intent = Intent(this, Event::class.java).apply {

            }
            startActivity(intent)
        }

        val activity = AppCompatActivity()

    }
}
