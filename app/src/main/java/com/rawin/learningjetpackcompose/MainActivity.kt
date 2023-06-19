package com.rawin.learningjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rawin.learningjetpackcompose.ui.theme.LearningJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearningJetpackComposeTheme {
                var count = remember {
                    mutableStateOf(0)
                }
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    Column(
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        AppTitle()
                        Display(count = count.value.toString())
                        AppButton(onTap = {
                            count.value++
                        })
                    }

                }
            }
        }
    }
}


@Composable
fun AppTitle() {
    Text(
        text = "Counter app",
        color= Color.Red,
        fontSize = 30.sp,
        fontWeight = FontWeight.Black,
        fontStyle = FontStyle.Italic,
        textAlign = TextAlign.Center,
    )
}

@Composable
fun Display(count:String) {
    Text(
        text = count,
        color= Color.Red,
        fontSize = 30.sp,
        fontWeight = FontWeight.Black,
        fontStyle = FontStyle.Italic,
        textAlign = TextAlign.Center,
    )
}

@Composable
fun AppButton(onTap:()->Unit) {
    Button(
        onClick = onTap,
        modifier = Modifier
            .height(height = 50.dp)
            .width(width = 100.dp)
            .padding(bottom = 10.dp)
    ) {
Icon(
    imageVector = Icons.Rounded.Add,
    contentDescription = null
)
    }
}
