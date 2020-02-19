package edu.boisestate.heffner_project1

import java.util.*

object UserStorage {
    private val usersList = mutableListOf<User>()


    fun usersList(): List<User> {
        return Collections.unmodifiableList(usersList)
    }

    fun addUser(user:User){
        usersList.add(user)

    }

    fun removeAll(){
        usersList.clear()
    }


    fun loginUser(profile:User):Boolean{

        for (currentUser in usersList()) {
            if( profile.username == currentUser.username){

                //this.profile = profile
                //this.profile!!.loggedInTimes = this.profile!!.loggedInTimes?.plus(1)
                return true
            }
        }

        return false
    }
}