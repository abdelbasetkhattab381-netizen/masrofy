package com.masrofy.app.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MasrofyScreen() {
    var expenseText by remember { mutableStateOf("") }
    var amountText by remember { mutableStateOf("") }
    var categoryText by remember { mutableStateOf("") }
    val snackbarHostState = remember { SnackbarHostState() }
    var progress by remember { mutableStateOf(0.65f) }
    var isLoading by remember { mutableStateOf(false) }

    val glassBrush = Brush.linearGradient(
        colors = listOf(Color.White.copy(alpha = 0.25f), Color.White.copy(alpha = 0.05f))
    )
    val backgroundBrush = Brush.verticalGradient(
        colors = listOf(Color(0xFF6A11CB), Color(0xFF2575FC))
    )

    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
        containerColor = Color.Transparent,
        modifier = Modifier.fillMaxSize().background(backgroundBrush)
    ) { padding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(padding).padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(24.dp)).background(glassBrush).padding(20.dp)
            ) {
                Column {
                    Text("مصروفي", fontSize = 28.sp, color = Color.White)
                    Text("تتبع مصاريفك بذكاء", color = Color.White.copy(alpha = 0.8f))
                    Spacer(modifier = Modifier.height(16.dp))
                    CircularProgressIndicator(
                        progress = { progress },
                        modifier = Modifier.size(60.dp),
                        color = Color.White,
                        trackColor = Color.White.copy(alpha = 0.2f),
                        strokeWidth = 6.dp
                    )
                }
            }
            Box(
                modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(24.dp)).background(glassBrush).padding(20.dp)
            ) {
                Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    OutlinedTextField(value = expenseText, onValueChange = { expenseText = it }, label = { Text("اسم المصروف", color = Color.White) }, modifier = Modifier.fillMaxWidth(), colors = OutlinedTextFieldDefaults.colors(focusedTextColor = Color.White, unfocusedTextColor = Color.White, focusedBorderColor = Color.White, unfocusedBorderColor = Color.White.copy(alpha = 0.5f)))
                    OutlinedTextField(value = amountText, onValueChange = { amountText = it }, label = { Text("المبلغ", color = Color.White) }, modifier = Modifier.fillMaxWidth(), colors = OutlinedTextFieldDefaults.colors(focusedTextColor = Color.White, unfocusedTextColor = Color.White, focusedBorderColor = Color.White, unfocusedBorderColor = Color.White.copy(alpha = 0.5f)))
                    OutlinedTextField(value = categoryText, onValueChange = { categoryText = it }, label = { Text("الفئة", color = Color.White) }, modifier = Modifier.fillMaxWidth(), colors = OutlinedTextFieldDefaults.colors(focusedTextColor = Color.White, unfocusedTextColor = Color.White, focusedBorderColor = Color.White, unfocusedBorderColor = Color.White.copy(alpha = 0.5f)))
                    Button(onClick = { isLoading = true }, modifier = Modifier.fillMaxWidth().height(50.dp), colors = ButtonDefaults.buttonColors(containerColor = Color.White, contentColor = Color(0xFF6A11CB)), shape = RoundedCornerShape(12.dp)) {
                        if (isLoading) { CircularProgressIndicator(modifier = Modifier.size(20.dp), color = Color(0xFF6A11CB), strokeWidth = 2.dp) } else { Text("إضافة") }
                    }
                }
            }
            Box(modifier = Modifier.fillMaxWidth().height(60.dp).clip(RoundedCornerShape(16.dp)).background(Color.Black.copy(alpha = 0.2f)), contentAlignment = Alignment.Center) {
                Text("AdMob Banner Ad Here", color = Color.White.copy(alpha = 0.6f), fontSize = 12.sp)
            }
        }
    }
}