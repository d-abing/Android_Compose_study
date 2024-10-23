package com.example.fastcampuscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
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
import androidx.compose.ui.input.key.Key.Companion.Ro
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fastcampuscompose.ui.theme.FastCampusComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FastCampusComposeTheme {
                RowEx()
            }
        }
    }
}

@Composable
fun RowEx() {
    /*Row(modifier = Modifier.height(40.dp)) {
        Text(text = "첫 번째!")
        Text(text = "두 번째!")
        Text(text = "세 번째!")
    }*/

    /*Row(modifier = Modifier.height(40.dp)) {
        Text(text = "첫 번째!", modifier = Modifier.align(Alignment.Top))
        Text(text = "두 번째!", modifier = Modifier.align(Alignment.CenterVertically))
        Text(text = "세 번째!", modifier = Modifier.align(Alignment.Bottom))
    }*/

    /*Row(
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier.height(40.dp)
    ) {
        Text(text = "첫 번째!", modifier = Modifier.align(Alignment.Top))
        Text(text = "두 번째!")
        Text(text = "세 번째!")
    }*/

    /*Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier
            .height(40.dp)
            .width(200.dp)
    ) {
        Text(text = "첫 번째!", modifier = Modifier.align(Alignment.Top))
        Text(text = "두 번째!")
        Text(text = "세 번째!")
    }*/

    /*Row(
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier
            .height(40.dp)
            .width(200.dp)
    ) {
        Text(
            text = "첫 번째!",
            modifier = Modifier.align(Alignment.Top)
                .weight(3f)
        )
        Text(
            text = "두 번째!",
            modifier = Modifier.weight(1f)
        )
        Text(
            text = "세 번째!",
            modifier = Modifier.weight(3f)
        )
    }*/

    Row(
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier
            .height(40.dp)
            .width(200.dp)
    ) {
        Text(
            text = "첫 번째!",
            textAlign = TextAlign.End,
            modifier = Modifier.align(Alignment.Top)
                .weight(3f)
                .background(Color.Magenta)
        )
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = "추가",
            modifier = Modifier
                .weight(1f)
                .background(Color.Cyan)
        )
        Text(
            text = "세 번째!",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .weight(3f)
                .background(Color.Blue)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FastCampusComposeTheme {
        RowEx()
    }
}