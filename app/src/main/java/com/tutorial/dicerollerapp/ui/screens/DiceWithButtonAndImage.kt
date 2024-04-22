package com.tutorial.dicerollerapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.tutorial.dicerollerapp.R

@Composable
fun DiceWithButtonAndImage(
    modifier: Modifier = Modifier,
    viewModel: DiceViewModel,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = viewModel.diceImage.value),
            contentDescription = "Dice Image"
        )
        Button(onClick = { viewModel.rollDice() }) {
            Text(text = stringResource(R.string.roll))
        }
    }
}