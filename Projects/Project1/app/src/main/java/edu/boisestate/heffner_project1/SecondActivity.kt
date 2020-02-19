package edu.boisestate.heffner_project1

import android.content.Intent
import android.os.Bundle
//import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_second.*

//import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    companion object{
        const val KEY_EXTRA = "KEY_EXTRA"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val extraString:String = intent.getStringExtra(KEY_EXTRA)

        /*Log.d("BSU", extraString)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }*/

        setupUI()
    }

    private fun setupUI() {
        ShowUsers.setOnClickListener {

            var listOfUsers = ""
            for(currentUser in UserStorage.usersList()) {
                listOfUsers = listOfUsers + currentUser.username + " " + currentUser.password + "\n"
            }
            UsersList.text = listOfUsers
        }

        ReturnButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra(KEY_EXTRA, "new value")
            }
            startActivity(intent)
        }

        val activity = AppCompatActivity()

    }

}
