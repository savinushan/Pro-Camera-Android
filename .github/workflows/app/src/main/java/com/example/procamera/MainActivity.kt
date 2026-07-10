package com.example.procamera

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProCameraScreen()
        }
    }
}

@Composable
fun ProCameraScreen() {
    Box(modifier = Modifier.fillMaxSize().background(Color.Black)) {
        
        // කැමරා දර්ශනය පෙන්වන තැන (Viewfinder Placeholder)
        Box(
            modifier = Modifier.fillMaxSize(), 
            contentAlignment = Alignment.Center
        ) {
            Text("Camera Live Viewfinder", color = Color.DarkGray, fontSize = 20.sp)
        }

        // ඉහළ තීරුව (Top Status Bar) - Blackmagic Style
        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp).align(Alignment.TopCenter),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("4K 24FPS", color = Color.Red, fontWeight = FontWeight.Bold)
            Text("00:00:00:00", color = Color.White)
            Text("LUT: Off", color = Color.Cyan)
        }

        // පහළ මැනුවල් පාලක තීරුව (Manual Controls)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .background(Color.Black.copy(alpha = 0.8f))
                .padding(16.dp)
        ) {
            Text(
                text = "[ . . . . . . | . . . . . . ]", 
                color = Color.Gray, 
                modifier = Modifier.align(Alignment.CenterHorizontally).padding(bottom = 8.dp)
            )
            
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(onClick = { }) { Text("ISO") }
                Button(onClick = { }) { Text("SHUTTER") }
                Button(onClick = { }) { Text("WB") }
                Button(onClick = { }) { Text("FOCUS") }
            }
        }
    }
}
