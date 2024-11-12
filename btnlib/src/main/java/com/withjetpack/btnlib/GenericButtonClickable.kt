package com.withjetpack.btnlib

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GenericButtonClickable(
    btnTitle: String,
    modifier: Modifier = Modifier,
    backgroundcolor: Color = Color.Red,
    onClick: () -> Unit,
    fontSize: TextUnit = 16.sp,
    fontWeight: FontWeight = FontWeight.Normal,
    padding: Dp = 0.dp
) {

    Text(
        text = btnTitle,
        fontSize = fontSize,
        fontWeight = fontWeight,
        color = backgroundcolor,
        modifier = Modifier.clickable { onClick() })

}