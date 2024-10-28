package edu.temple.dicethrow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class DieViewModel : ViewModel() {
    private val dieRoll = MutableLiveData<Int>()
    var hasRolled = false

    fun getDieRoll() : LiveData<Int> {
        hasRolled = false
        return dieRoll
    }

    fun rollDie(dieSides: Int = 6) {
        dieRoll.value = Random.nextInt(dieSides) + 1
    }
}