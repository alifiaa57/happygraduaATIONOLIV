 package com.example.happygraduation

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happygraduation.ui.theme.HappyGraduATIONTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyGraduATIONTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingText(
                        message= "HAPPY WEEKEND JANE!",
                        from = "vanilla",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

 @Composable
 fun GreetingImage(message: String,from: String,modifier: Modifier  = Modifier){
     val image = painterResource(R.drawable.bg)
   Box(modifier){
       Image(
           painter = image,
           contentDescription = null,
           modifier = modifier.fillMaxSize(),
           contentScale = ContentScale.Crop,
           alpha = 0.5F
       )
       GreetingText(
           message = message,
           from = from,
           modifier = modifier
               .fillMaxSize()
               .padding()


       )
   }

 }

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


 @Composable
 fun GreetingText(message: String,from: String,modifier: Modifier = Modifier){
     Column (
         verticalArrangement = Arrangement.Center,
         modifier = modifier.padding(8.dp)
     ){
         Text(
             text = message,
             fontSize = 75.sp,
             lineHeight = 110.sp,
             textAlign = TextAlign.Center
         )
         Text(
             text = from,
             fontSize = 65.sp,
             modifier = Modifier.padding(16.dp)
                 .align(Alignment.End)
         )
     }
 }
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HappyGraduATIONTheme{
        GreetingImage("HAPPY WEEKEND JANE!",
             from = "vanilla")
    }
}