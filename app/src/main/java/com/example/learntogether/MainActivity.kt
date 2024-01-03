package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
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
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
private fun BusinessCard() {
    Column(
        modifier = Modifier.background(Color(0xFFd3e8d5)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Profile()
        ContactInformation()
    }
}

@Composable
private fun Profile() {
    val logo = painterResource(id = R.drawable.android_logo)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = logo,
            contentDescription = null,
            modifier = Modifier
                .background(Color(0xFF073042))
                .size(width = 100.dp, height = 100.dp)
                .padding(8.dp)
        )
        Text(
            text = "Jennifer Doe",
            fontSize = 36.sp,
            fontWeight = FontWeight.W300,
            modifier = Modifier.padding(top = 6.dp)
        )
        Text(
            text = "Android Developer Extraordinaire",
            fontSize = 12.sp,
            fontWeight = FontWeight.W600,
            color = Color(0xff196c3a),
            modifier = Modifier.padding(top = 6.dp)
        )
    }
}

@Composable
private fun ContactInformation() {

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

@Composable
fun TaskManager(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.ic_launcher_background)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            painter = image, contentDescription = null, modifier = modifier.size(150.dp, 150.dp)
        )
        Text(
            text = "All tasks completed",
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(0.dp, 24.dp, 0.dp, 8.dp)
        )
        Text(text = "Nice work!", fontSize = 16.sp)
    }
}

@Composable
fun ComposeQuadrant(modifier: Modifier = Modifier) {
    Column(Modifier.fillMaxWidth()) {
        Row(modifier = modifier.weight(1f)) {
            Item(
                backgroundColor = Color(0xFFEADDFF),
                title = "Text composable",
                content = "Displays text and follows the recommended Material Design guidelines.",
                modifier = Modifier.weight(1f)
            )
            Item(
                backgroundColor = Color(0xFFD0BCFF),
                title = "Image composable",
                content = "Creates a composable that lays out and draws a given Painter class object.",
                modifier = Modifier.weight(1f)
            )
        }
        Row(modifier = modifier.weight(1f)) {
            Item(
                backgroundColor = Color(0xFFB69DF8),
                title = "Row composable",
                content = "A layout composable that places its children in a horizontal sequence.",
                modifier = Modifier.weight(1f)
            )
            Item(
                backgroundColor = Color(0xFFF6EDFF),
                title = "Column composable",
                content = "A layout composable that places its children in a vertical sequence.",
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun Item(
    backgroundColor: Color, title: String, content: String, modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
    ) {
        Text(
            text = title, modifier = modifier.padding(bottom = 16.dp), fontWeight = FontWeight.Bold
        )
        Text(text = content, textAlign = TextAlign.Justify)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        BusinessCard()
//        Body(
//            stringResource(R.string.title),
//            stringResource(R.string.sub_title),
//            stringResource(R.string.content),
//        )
    }
}