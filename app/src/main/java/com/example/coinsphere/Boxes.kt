package com.example.coinsphere

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coinsphere.ui.theme.CoinSphereTheme
import com.example.coinsphere.ui.theme.Surface
import com.example.coinsphere.ui.theme.TextDim
import com.example.coinsphere.ui.theme.TextMain

@Composable
fun Boxes() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {







        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 5.dp)
                .background(
                    color = Surface,
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(15.dp)
        ) {
            Column {
                Text(
                    text = "Global Market Cap",
                    color = TextDim,
                    fontSize = 15.sp
                )
                Text(
                    text = "$2.18T",
                    color = TextMain,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(top = 4.dp)
                )
            }
        }





        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp)
                .background(
                    color = Surface,
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(15.dp)
        ) {
            Column {
                Text(
                    text = "Fear & Greed",
                    color = TextDim,
                    fontSize = 15.sp
                )
                Text(
                    text = "Neutral (54)",
                    color = TextMain,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(top = 4.dp)
                )
            }
        }












        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp)
                .background(
                    color = Surface,
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(15.dp)
        ) {
            Column {
                Text(
                    text = "Altcoin Season",
                    color = TextDim,
                    fontSize = 15.sp
                )
                Text(
                    text = "No",
                    color = TextMain,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(top = 4.dp)
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BoxesPreview() {
    CoinSphereTheme {
        Boxes()
    }
}