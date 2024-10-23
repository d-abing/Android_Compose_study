package com.example.fastcampuscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fastcampuscompose.ui.theme.FastCampusComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FastCampusComposeTheme {
                BoxEx()
            }
        }
    }
}

@Composable
fun BoxEx() {
    /*Box(modifier = Modifier.size(100.dp)) {
        Text(text = "Hello World", modifier = Modifier.align(Alignment.BottomEnd))
        Text(text = "Jetpack", modifier = Modifier.align(Alignment.CenterEnd))
        Text(text = "Compose", modifier = Modifier.align(Alignment.TopStart))
    }*/

    /*Box(modifier = Modifier.size(100.dp)) {
        Box(modifier = Modifier.size(70.dp).background(Color.Cyan).align(Alignment.CenterStart))
        Box(modifier = Modifier.size(70.dp).background(Color.Yellow).align(Alignment.BottomEnd))
    }*/

    Box {
        Box(modifier = Modifier.fillMaxSize().background(Color.Cyan).align(Alignment.CenterStart))
        Box(modifier = Modifier.matchParentSize().background(Color.Green).align(Alignment.CenterStart))
        Box(modifier = Modifier.size(70.dp).background(Color.Yellow).align(Alignment.Center))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FastCampusComposeTheme {
        BoxEx()
    }
}