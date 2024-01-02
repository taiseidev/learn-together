package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Body(
                        stringResource(R.string.title),
                        stringResource(R.string.sub_title),
                        stringResource(R.string.content),
                    )
                }
            }
        }
    }
}

@Composable
fun Body(title: String, subTitle: String, content: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column {
        Image(painter = image, contentDescription = null)
        Text(text = title, fontSize = 24.sp, modifier = modifier.padding(16.dp))
        Text(
            text = subTitle,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(horizontal = 16.dp)
        )
        Text(text = content, textAlign = TextAlign.Justify, modifier = modifier.padding(16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        Body(
            stringResource(R.string.title),
            stringResource(R.string.sub_title),
            stringResource(R.string.content),
        )
    }
}