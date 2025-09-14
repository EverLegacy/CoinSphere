package com.example.coinsphere

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coinsphere.ui.theme.Surface
import com.example.coinsphere.ui.theme.TextDim
import com.example.coinsphere.ui.theme.TextMain

@Composable
fun PriceHeader() {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp, vertical = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row {
                Text(
                    text = "#",
                    color = TextDim,
                    fontSize = 10.sp,
                    modifier = Modifier.padding(end = 15.dp)
                )
                Text(
                    text = "   Name",
                    color = TextDim,
                    fontSize = 10.sp,
                )
            }

            Text(
                text = "Price",
                color = TextDim,
                fontSize = 10.sp,
                modifier = Modifier
                    .width(75.dp)
            )
        }

        Divider(
            color = TextDim.copy(alpha = 0.3f),
            thickness = 1.dp,
        )
    }
}




