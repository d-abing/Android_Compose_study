package com.example.fastcampuscompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import androidx.compose.ui.unit.sp
import com.example.fastcampuscompose.ui.theme.FastCampusComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FastCampusComposeTheme {
                    ButtonExample(onButtonClicked = {
                        Toast.makeText(this, "Send clicked", Toast.LENGTH_SHORT).show()
                    })
            }
        }
    }
}

@Composable
fun ButtonExample(onButtonClicked: () -> Unit) {
    /*Button(onClick = onButtonClicked) {
        Text(text = "Send")
    }*/

    /*Button(onClick = onButtonClicked) {
        Icon(
            imageVector = Icons.AutoMirrored.Filled.Send,
            contentDescription = null
        )
        Text(text = "Send")
    }*/

    /*Button(
        onClick = onButtonClicked,
        enabled = false
    ) {
        Icon(
            imageVector = Icons.AutoMirrored.Filled.Send,
            contentDescription = null
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text(text = "Send")
    }*/

    /*Button(
        onClick = onButtonClicked,
        border = BorderStroke(10.dp, Color.Magenta)
    ) {
        Icon(
            imageVector = Icons.AutoMirrored.Filled.Send,
            contentDescription = null
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text(text = "Send")
    }*/

    /*Button(
        onClick = onButtonClicked,
        border = BorderStroke(10.dp, Color.Magenta),
        shape = CircleShape
    ) {
        Icon(
            imageVector = Icons.AutoMirrored.Filled.Send,
            contentDescription = null
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text(text = "Send")
    }*/

    Button(
        onClick = onButtonClicked,
        border = BorderStroke(10.dp, Color.Magenta),
        shape = CircleShape,
        contentPadding = PaddingValues(20.dp)
    ) {
        Icon(
            imageVector = Icons.AutoMirrored.Filled.Send,
            contentDescription = null
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text(text = "Send")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FastCampusComposeTheme {
        ButtonExample{}
    }
}