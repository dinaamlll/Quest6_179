package com.example.navigationmultipledata_179.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationmultipledata_179.model.Mahasiswa
import com.example.navigationmultipledata_179.ui.view.screen.MahasiswaFormView
import com.example.navigationmultipledata_179.ui.view.screen.SplashView
import com.example.navigationmultipledata_179.ui.view.viewmodel.MahasiswaViewModel
import java.security.AccessController
import androidx.lifecycle.viewmodel.compose.viewModel as viewModel

enum class Halaman{
    Splash,
    Mahasiswa
}


@Composable
fun MahasiswaApp(
    modifier: Modifier = Modifier,
    mahasiswaViewModel: MahasiswaViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    val mahasiswaUiState = mahasiswaViewModel.mahasiswaUiState.collectAsState().value

    NavHost(
        navController = navController,
        startDestination = Halaman.Splash.name,
        modifier = Modifier.padding()
    ) {
        composable(route = Halaman.Splash.name) {
            SplashView(onMulaiButton = {
                navController.navigate(
                    Halaman.Mahasiswa.name
                )
            })
        }
        composable(route = Halaman.Mahasiswa.name) {
        }
    }
}