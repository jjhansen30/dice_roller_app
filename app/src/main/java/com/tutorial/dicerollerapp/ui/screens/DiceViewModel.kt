package com.tutorial.dicerollerapp.ui.screens

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel
import com.tutorial.dicerollerapp.R

class DiceViewModel : ViewModel() {

    var diceImage: MutableState<Int> = mutableIntStateOf(R.drawable.dice_1)
    private var rollResult: Int = 1

    fun rollDice() {
        rollResult = (1..6).random()
        setDiceImage()
    }

    private fun setDiceImage() {
        val newImage = when (rollResult) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_1
        }
        diceImage.value = newImage
    }
}