package com.example.navigationmultipledata_179.ui.view.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.navigationmultipledata_179.model.Mahasiswa
import com.example.navigationmultipledata_179.model.RencanaStudi

@Composable
fun TampilDataView(  //
    mahasiswa: Mahasiswa,
    rencanaStudi: RencanaStudi,
    onBackButtonClicked: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Menampilkan data mahasiswa
        Text(text = "Nama: ${mahasiswa.nama}")
        Text(text = "NIM: ${mahasiswa.nim}")
        Spacer(modifier = Modifier.height(16.dp))

        // Menampilkan data rencana studi
        Text(text = "Mata Kuliah: ${rencanaStudi.namaMK}")
        Text(text = "Kelas: ${rencanaStudi.kelas}")
        Spacer(modifier = Modifier.height(32.dp))

        // Tombol kembali
        Button(onClick = onBackButtonClicked) {
            Text(text = "Kembali")
        }
    }
}