package com.withjetpack.reusable_button_component_jetpackcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.withjetpack.btnlib.GenericButton
import com.withjetpack.btnlib.GenericButtonClickable
import com.withjetpack.btnlib.GenericCard
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
//                    ScreenWithClickableText()
                }
            }
        }
    }
}


@Composable
fun ScreenWithClickableText() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {

        GenericButtonClickable(
            btnTitle = "Forgot Password?",
            backgroundcolor = Color.Yellow,
            onClick = { /*TODO*/ })
    }
    Spacer(modifier = Modifier.height(8.dp))

    GenericButtonClickable(
        btnTitle = "Sign Up",
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        backgroundcolor = Color.Green,
        onClick = { /* Handle sign up */ }
    )
}

@Composable
fun CardScreen() {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(5) { index ->
            GenericCard(
                title = "Card Title $index",
                description = "This is a description for card $index",
                buttonText = "Action $index",
                onButtonClick = { /* Handle card button click */ }
            )
        }
    }
}

@Composable
fun ScreenContent() {

    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        GenericButton(text = "Click me", backgroundColorx = Color.Blue, onClick = {
            Toast.makeText(context, "Click me", Toast.LENGTH_SHORT).show()
        }, padding = 16.dp)

        GenericButton(text = "Submit", backgroundColorx = Color.Red, onClick = {
            Toast.makeText(context, "Submit", Toast.LENGTH_SHORT).show()

        }, padding = 25.dp)

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ReusableButtonComponentjetpackComposeTheme {
        CardScreen()
    }
}