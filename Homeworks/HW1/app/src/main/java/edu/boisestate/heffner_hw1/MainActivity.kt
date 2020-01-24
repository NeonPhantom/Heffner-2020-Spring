package edu.boisestate.heffner_hw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupUI(NameText)
    }

    private fun setupUI(localTextView: TextView) {
        NameButton.setOnClickListener {
            val firstNameValue = FirstNameInput.text.toString()
            val lastNameValue = LastNameInput.text.toString()
            val outputString = "$firstNameValue $lastNameValue"
//             "Your principal " + $$ + " is " + $$ + "after XX months"
            NameText.text = "$outputString"
        }
        ScoreButton.setOnClickListener {
            val FX = FXScoreInput.text.toString().toDouble()
            val PH = PHScoreInput.text.toString().toDouble()
            val SR = SRScoreInput.text.toString().toDouble()
            val VT = VTScoreInput.text.toString().toDouble()
            val PB = PBScoreInput.text.toString().toDouble()
            val HB = HBScoreInput.text.toString().toDouble()
            val fullScores = FX + PH + SR + VT + PB + HB;
            ScoreText.text = "$fullScores"
        }
    }


    override fun onDestroy() {
        // Tear down here before calling super class's function

        super.onDestroy()
    }

    /*override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            R.id.action_first -> true
            else -> super.onOptionsItemSelected(item)
        }
    }*/
}
