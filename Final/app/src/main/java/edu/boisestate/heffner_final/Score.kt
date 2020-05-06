package edu.boisestate.heffner_final

import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id
import java.io.Serializable

@Entity
data class ScoreItem (
    @Id var id:Long = 0,

    var score: Int,
    var scorePriority: Int?
):Serializable