package com.masrofy.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.masrofy.app.ui.MasrofyScreen
import com.masrofy.app.ui.SettingsManager

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val settingsManager = remember { SettingsManager(this) }
            val isDark by settingsManager.isDarkMode.collectAsState()
            val themeColors = if (isDark) {
                darkColorScheme(
                    primary = Color(0xFF00E5CC),
                    onPrimary = Color(0xFF003833),
                    primaryContainer = Color(0xFF00504A),
                    onPrimaryContainer = Color(0xFF62FFF5),
                    secondary = Color(0xFFFF6E9C),
                    onSecondary = Color(0xFFFFFFFF),
                    secondaryContainer = Color(0xFF8E2A4D),
                    onSecondaryContainer = Color(0xFFFFD9E0),
                    tertiary = Color(0xFFFFD180),
                    onTertiary = Color(0xFF3E2A00),
                    background = Color(0xFF0F1117),
                    onBackground = Color(0xFFE6E8EE),
                    surface = Color(0xFF1A1D27),
                    onSurface = Color(0xFFE6E8EE),
                    surfaceVariant = Color(0xFF252835),
                    onSurfaceVariant = Color(0xFFBFC4D0),
                    error = Color(0xFFFF5252),
                    onError = Color(0xFFFFFFFF),
                    outline = Color(0xFF6B7280),
                )
            } else {
                lightColorScheme(
                    primary = Color(0xFF00BFA5),
                    onPrimary = Color(0xFFFFFFFF),
                    primaryContainer = Color(0xFFA5F4E7),
                    onPrimaryContainer = Color(0xFF00332C),
                    secondary = Color(0xFFFF4081),
                    onSecondary = Color(0xFFFFFFFF),
                    secondaryContainer = Color(0xFFFFD9E0),
                    onSecondaryContainer = Color(0xFF5C0029),
                    tertiary = Color(0xFFFFB300),
                    onTertiary = Color(0xFFFFFFFF),
                    background = Color(0xFFF8FBFF),
                    onBackground = Color(0xFF1A1D27),
                    surface = Color(0xFFFFFFFF),
                    onSurface = Color(0xFF1A1D27),
                    surfaceVariant = Color(0xFFEFF2F8),
                    onSurfaceVariant = Color(0xFF4A5060),
                    error = Color(0xFFE53935),
                    onError = Color(0xFFFFFFFF),
                    outline = Color(0xFF9AA0B0),
                )
            }
            MaterialTheme(colorScheme = themeColors) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MasrofyScreen(settingsManager)
                }
            }
        }
    }
}
