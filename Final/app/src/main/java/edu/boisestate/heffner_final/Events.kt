package edu.boisestate.heffner_final

import io.objectbox.annotation.Id
import io.objectbox.kotlin.query
import io.objectbox.query.QueryBuilder


//@Entity
object Events {

    @Id var id:Long = 0

    //private val scoreList = mutableListOf<ScoreItem>()
    private val scoreList = mutableListOf(0, 0, 0, 0, 0, 0, 0, 0, 0)

    private val scoreBox = ObjectBox.boxStore.boxFor(ScoreItem::class.java)
    /*val query = scoreBox.query {
        order(ScoreItem_.scorePriority, QueryBuilder.DESCENDING)
    }
    init {
        val results = query.find()
        scoreList.addAll(results)
    }*/

    private val titleList = mutableListOf("Regular Event", "Jumpers", "Chances", "Tunnelers", "Weavers", "Touch n Go",
        "Hoopers", "Barrelers", "Gamblers")
    private val eventList = mutableListOf("The Regular Agility class is a numbered course that may consist of any of the obstacles allowed on the NADAC equipment list. Judges may offer courses that will use some or all of the acceptable obstacles on a course.",
        "The Jumpers class is a special skills class that is a numbered course that consists of jumps and possibly 1-3 tunnel performances. This class highlights the natural jumping ability of the dog and tests the handler for effective handling styles, while moving at a rapid pace.",
        "The Chances class is a special skills class that is a numbered course that could have any of the acceptable obstacles listed in the NADAC equipment list. The goal of the Chances class is to test the distance, directional and discrimination (DD&D) skills of the dog and handler team. The Chances course shall consist of a numbered sequence of 10-14 obstacles. In addition, the course shall include distance tests, discrimination tests, and directional tests.",
        "The Tunnelers class is a special skills class that is a numbered course comprised of mostly tunnels. The goal of the Tunnelers class is to demonstrate the dog’s ability to respond quickly to directional commands from the handler while negotiating a course comprised of only tunnels.",
        "The Weavers class is a special skills class that is a numbered course comprised of weave poles, tunnels, hoops, and/or barrels.\n" +
                "The goal of the Weavers class is to demonstrate the dog’s ability to correctly enter weave poles at a variety of angles and at greater speeds than required in the Regular Agility class.",
        "The Touch N Go class is a special skills class that is a numbered course comprised of contact obstacles, tunnels, barrels, and/or hoops. The goal of the Touch N Go class is to demonstrate the dog’s ability to perform contact obstacles with directional and discrimination tests.",
        "The Hoopers class is a special skills class that emphasizes handling via a numbered course comprised of hoops.\n" +
                "The goal of the Hoopers class is to demonstrate the handler’s ability to direct their dog through a series of ground-based obstacles – hoops. The handler must create the best path for the dog by communicating with body language and verbal skills for the dog to follow efficiently and rapidly.",
        "The Barrelers class is a special skills class that emphasizes handling via a numbered course comprised of barrels, hoops and tunnels.\n" +
                "The goal of the Barrelers class is to demonstrate the handler’s ability to direct their dog through a series of ground-based obstacles – hoops, tunnels and barrels.",
        "The Gamblers class is a strategy game combined with a small distance test, referred to as the Gamble. Handlers will have a set amount of time to complete the course based on their dogs jumping height. All NADAC approved obstacles can be placed on course.")

    private var index = 0

    fun getTitle(): String {
        return titleList[index]
    }

    fun getEvent(): String {
        return eventList[index]
    }

    fun getScore(number: Int): Int {
        if (scoreList[number] == null) {
            return 0
        } else {
            return scoreList[number]
        }
    }

    fun getIndex(): Int {
        return index
    }

    fun setScore(number: Int) {
        scoreList[index] = number
        //val newScore = ScoreItem(score = number, scorePriority = getIndex())
        //scoreList.add(number, newScore)
        //scoreBox.put(newScore)
    }

    fun setIndex(number: Int) {
        index = number
    }
}