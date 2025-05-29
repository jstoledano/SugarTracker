package dev.toledano.sugartracker

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import dev.toledano.sugartracker.ui.MainScreen

@Composable
fun SugarTrackerApp() {
    Surface(color = MaterialTheme.colorScheme.background) {
        MainScreen()
    }
}