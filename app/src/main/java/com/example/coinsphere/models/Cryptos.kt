package com.example.coinsphere.models



data class Cryptos(
    val rank: Int,
    val name: String,
    val price: String,
    val iconUrl: String
)



val cryptos = listOf(
    Cryptos(1, "Bitcoin",   "$109,797.37", "https://cdn-icons-png.flaticon.com/128/5968/5968260.png"),
    Cryptos(2, "Ethereum",  "$4,321.21",   "https://cdn-icons-png.flaticon.com/128/14446/14446160.png"),
    Cryptos(3, "Tether",    "$1.0000",     "https://cdn-icons-png.flaticon.com/128/15207/15207964.png"),
    Cryptos(4, "XRP",       "$2.8100",     "https://cdn-icons-png.flaticon.com/128/12379/12379305.png"),
    Cryptos(5, "BNB",       "$845.0000",   "https://cdn-icons-png.flaticon.com/128/7403/7403652.png"),
    Cryptos(6, "Solana",    "$201.8500",   "https://cdn-icons-png.flaticon.com/128/15208/15208206.png"),
    Cryptos(7, "USDC",      "$0.9998",     "https://cdn-icons-png.flaticon.com/128/14446/14446285.png"),
    Cryptos(8, "Dogecoin",  "$0.1320",     "https://cdn-icons-png.flaticon.com/128/7320/7320825.png"),
    Cryptos(9, "TRON",      "$0.3630",     "https://cdn-icons-png.flaticon.com/128/12114/12114250.png"),
)