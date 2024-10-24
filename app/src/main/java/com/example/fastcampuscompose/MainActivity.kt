package com.example.fastcampuscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.fastcampuscompose.ui.theme.FastCampusComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FastCampusComposeTheme {
                CheckBoxEx()
            }
        }
    }
}

@Composable
fun CheckBoxEx() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(end = 12.dp)
    ) {

        /*Checkbox(checked = false, onCheckedChange = {})*/

        /*var checked = false
        Checkbox(
            checked = checked,
            onCheckedChange = {
                checked = !checked
            }
        )*/

        /*val checked = remember { mutableStateOf(false) }
        Checkbox(
            checked = checked.value,
            onCheckedChange = {
                checked.value = !checked.value
            }
        )*/

        /*var checked by remember { mutableStateOf(false) }
        Checkbox(
            checked = checked,
            onCheckedChange = {
                checked = !checked
            }
        )*/

        val (getter, setter) = remember { mutableStateOf(false) }
        Checkbox(
            checked = getter,
            onCheckedChange = setter
        )

        Text(
            text = "프로그래머입니까?",
            modifier = Modifier.clickable {
                setter(!getter)
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FastCampusComposeTheme {
        CheckBoxEx()
    }
}