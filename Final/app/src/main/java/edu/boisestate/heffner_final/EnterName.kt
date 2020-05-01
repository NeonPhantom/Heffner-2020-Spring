package edu.boisestate.heffner_final

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.edit_event.backButton
import kotlinx.android.synthetic.main.edit_event.submitButton
import kotlinx.android.synthetic.main.enter_name.*

class EnterName : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.enter_name)

        setupUI()
    }

    private fun setupUI() {
        backButton.setOnClickListener {


            val intent = Intent(this, MainActivity::class.java).apply {
                //putExtra(EditEvent.KEY_EXTRA, "new value")
            }
            startActivity(intent)

        }

        submitButton.setOnClickListener {

            User.name = "Name: " + nameTextEdit.text.toString()
            User.dogName = "Dog: " + dogTextEdit.text.toString()

            val intent = Intent(this, MainActivity::class.java).apply {

            }
            startActivity(intent)

        }

        val activity = AppCompatActivity()

    }
}