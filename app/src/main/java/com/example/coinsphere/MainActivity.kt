package com.example.coinsphere


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coinsphere.ui.theme.Background
import com.example.coinsphere.ui.theme.CoinSphereTheme
import com.example.coinsphere.ui.theme.TextMain

@Composable
fun MainPage(){
    Column(

        modifier = Modifier
            .fillMaxSize()
            .background(color = Background)
    ){
        Text(
            modifier = Modifier
                .padding(14.dp),
            text = "CoinSphere",
            style = MaterialTheme.typography.headlineMedium,
            color = TextMain,
            fontWeight = FontWeight.Bold,

        )
        Boxes(

        )


    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CoinSphereTheme {
        MainPage()
    }
}