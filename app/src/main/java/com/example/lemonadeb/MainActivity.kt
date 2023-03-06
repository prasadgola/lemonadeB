package com.example.lemonadeb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lemonadeb.ui.theme.LemonadeBTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import androidx.compose.ui.Modifier as Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeBTheme {
                LemonadeApp()
            }
        }
    }
}

@Preview
@Composable
fun LemonadeApp(modifier: Modifier = Modifier
    .fillMaxSize()
) {
    Text(text = "hello")
//    LemonadeWithIamgeAndText()
}

@Composable
fun LemonadeWithIamgeAndText(modifier: Modifier = Modifier) {
    var result by remember { mutableStateOf(1) }
    Column (
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
            ) {
        Text(stringResource(id = R.string.tap_tree_directions))
        Image(painter = painterResource(id = R.drawable.lemon_drink), contentDescription = result.toString() )
    }
}