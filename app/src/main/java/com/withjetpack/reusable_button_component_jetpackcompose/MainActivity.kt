package com.withjetpack.reusable_button_component_jetpackcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.withjetpack.reusable_button_component_jetpackcompose.ui.theme.ReusableButtonComponentjetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReusableButtonComponentjetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ScreenContent()
                }
            }
        }
    }
}

@Composable
fun ScreenContent() {

    val context= LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        GenericButton(text = "Click me", backgroundColorx = Color.Blue, onClick = {
            Toast.makeText(context,"Click me",Toast.LENGTH_SHORT).show()
        }, padding = 16.dp)

        GenericButton(text = "Submit", backgroundColorx = Color.Red, onClick = {
            Toast.makeText(context,"Submit",Toast.LENGTH_SHORT).show()

        }, padding = 25.dp)

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ReusableButtonComponentjetpackComposeTheme {
        ScreenContent()
    }
}