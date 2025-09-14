package com.example.coinsphere

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.coinsphere.models.Cryptos
import com.example.coinsphere.ui.theme.CoinSphereTheme
import com.example.coinsphere.ui.theme.Surface
import com.example.coinsphere.ui.theme.TextMain


@Composable
fun PriceRow(crypto: Cryptos) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background( Surface,
                RoundedCornerShape(8.dp))
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = crypto.rank.toString(),
            color = TextMain,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.width(24.dp)
        )

        AsyncImage(
            model = crypto.iconUrl,
            contentDescription = crypto.name,
            modifier = Modifier
                .size(28.dp)
                .padding(end = 8.dp)
        )

        Text(
            text = crypto.name,
            color = TextMain,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.weight(1f)
        )

        Text(
            text = crypto.price,
            color = TextMain,
            fontWeight = FontWeight.Bold
            )
        }
}


