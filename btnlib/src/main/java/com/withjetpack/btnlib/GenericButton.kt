package com.withjetpack.btnlib

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun GenericButton(
    text: String,
    modifier: Modifier = Modifier,
    backgroundColorx: Color = Color.Blue,
    contentColor: Color = Color.White,
    onClick: () -> Unit,padding:Dp=0.dp
) {

    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColorx,
            contentColor = contentColor
        ),
        modifier = modifier.padding(padding)
    ) {
        Text(text = text)
    }
}
