package com.example.chapter5_4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chapter5_4.ui.theme.FastCampusComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FastCampusComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

// 단계 4: `compositionLocalOf`에 `8.dp`를 넣어 `LocalElevation`을 할당합니다.
val LocalElevation = compositionLocalOf { 8.dp }

@Composable
fun Greeting() {
    // 단계 1: `CompositionLocalProvider`을 이용하면 특정 블록에 암시적인 값을 설정할 수 있습니다.

    // 단계 2: 중간 중간에 `LocalContentColor.current` 등의 값을 출력해봅시다.
    // 가장 가까운 곳에서 설정한 값을 `current`로 얻을 수 있습니다.

    // 단계 5: Card의 elevation에 `LocalElevation`을 적용해봅시다.

    // 단계 6: LocalElevation의 값을 `CompositionLocalProvider`로
    // 바꾸어 봅시다.
    CompositionLocalProvider(LocalElevation provides 12.dp) {
        Card(
            modifier = Modifier.padding(8.dp),
            elevation = CardDefaults.cardElevation(LocalElevation.current)
        ) {
            CompositionLocalProvider(LocalContentColor provides Color.Red) {
                Column(
                    modifier = Modifier.padding(16.dp),
                ) {
                    Text("안녕하세요. 패스트캠퍼스")
                    Text("스안녕하세요. 패스트캠퍼")
                    Text("${LocalContentColor.current}")
                    CompositionLocalProvider(LocalContentColor provides Color.Yellow) {
                        Text("퍼스안녕하세요. 패스트캠")
                        CompositionLocalProvider(LocalContentColor provides Color.Green) {
                            Text("캠퍼스안녕하세요. 패스트")
                        }
                        CompositionLocalProvider(LocalContentColor provides Color.Blue) {
                            Text("트캠퍼스안녕하세요. 패스")
                            Text("스트캠퍼스안녕하세요. 패")
                            Text("${LocalContentColor.current}")
                        }
                    }
                    Text("패스트캠퍼스안녕하세요.")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FastCampusComposeTheme {
        Greeting()
    }
}