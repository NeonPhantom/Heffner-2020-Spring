package edu.boisestate.heffner_project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
//import android.view.Menu
//import android.view.MenuItem
import android.widget.TextView
//import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var hasRestarted:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*var count = 0

        Log.d("BSU", "$count")
        count = 3

        Log.d("BSU", "$count")

        count = 10
        Log.d("BSU", "$count")


        Event.state
        Event.whichState()*/


        val charCount = hasRestarted?.count().let {
            Log.d("BSU", "Not null! Value is ${it}")
        }

        for (currentUser in UserStorage.usersList()){
            Log.d("BSU", currentUser.username)
        }
        setupUI()
    }

    private fun setupUI() {
        SignUpButton.setOnClickListener {
            val newUsername = UsernameSignUp.text.toString()
            val newPassword = PasswordSignUp.text.toString()

            val newUser = User()
            newUser.username = newUsername
            newUser.password = newPassword

            if(UserStorage.loginUser(newUser) != true){
                UserStorage.addUser(newUser)
                val intent = Intent(this, SecondActivity::class.java).apply {
                    putExtra(SecondActivity.KEY_EXTRA, "new value")
                }
                startActivity(intent)
                //setContentView(R.layout.activity_second)
            }

        }

        val activity = AppCompatActivity()

    }


    override fun onDestroy() {
        // Tear down here before calling super class's function
        UserStorage.removeAll()
        super.onDestroy()
    }
}
