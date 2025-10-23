package com.example.questadvancelayout_249

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AktivitasPertama(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(top = 40.dp, start = 16.dp, end = 16.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text = stringResource(id = R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(id = R.string.univ),
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(height = 25.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth(), // Padding 12.dp dihapus agar mepet
            colors = CardDefaults.cardColors(
                containerColor = Color.Black // Diubah ke Hitam
            )
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                val gambar = painterResource(id = R.drawable.umy)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier
                        .size(size = 100.dp)
                        .padding(all = 5.dp)
                )
                Column {
                    Text(
                        text = stringResource(id = R.string.nama),
                        fontSize = 38.sp,
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.Bold,
                        color = Color.Yellow,
                        modifier = Modifier.padding(bottom = 10.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.alamat),
                        fontSize = 16.sp,
                        color = Color.Yellow,
                        modifier = Modifier.padding(bottom = 10.dp)
                    )
                }
            }
        }

        // Spacer antar kartu
        Spacer(modifier = Modifier.height(10.dp))

        // Card 2 (Biru) - Format Asli + No HP
        Card(
            modifier = Modifier
                .fillMaxWidth(), // Padding 12.dp dihapus
            colors = CardDefaults.cardColors(
                containerColor = Color.Blue
            )
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                val gambar = painterResource(id = R.drawable.umy)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier
                        .size(size = 100.dp)
                        .padding(all = 5.dp)
                )
                Column {
                    Text(
                        text = stringResource(id = R.string.nama),
                        fontSize = 38.sp,
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier.padding(bottom = 10.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.alamat),
                        fontSize = 16.sp,
                        color = Color.White,
                        modifier = Modifier.padding(bottom = 10.dp)
                    )
                    // Penambahan No HP
                    Text(
                        text = stringResource(id = R.string.nomor),
                        fontSize = 16.sp,
                        color = Color.White,
                        modifier = Modifier.padding(bottom = 10.dp)
                    )
                }
            }
        }

        // Spacer antar kartu
        Spacer(modifier = Modifier.height(10.dp))

        // Card 3 (Hijau) - Format Asli + No HP
        Card(
            modifier = Modifier
                .fillMaxWidth(), // Padding 12.dp dihapus
            colors = CardDefaults.cardColors(
                containerColor = Color.Green // Diubah ke Hijau
            )
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                val gambar = painterResource(id = R.drawable.umy)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier
                        .size(size = 100.dp)
                        .padding(all = 5.dp)
                )
                Column {
                    Text(
                        text = stringResource(id = R.string.nama),
                        fontSize = 38.sp,
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier.padding(bottom = 10.dp)
                    )
