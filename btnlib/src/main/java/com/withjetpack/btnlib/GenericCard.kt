package com.withjetpack.btnlib

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GenericCard(
    title: String,
    description: String,
    buttonText: String,
    modifier: Modifier = Modifier,
    onButtonClick: () -> Unit
) {

    Card(
        modifier = modifier.padding(8.dp),
        elevation = CardDefaults.cardElevation(4.dp), // For Material3
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = title,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = description,
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.height(16.dp))

            GenericButton(
                text = buttonText,
                onClick = onButtonClick
            )
        }
    }
}
