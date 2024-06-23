package com.sourabh.intentandintentfilters

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sourabh.intentandintentfilters.ui.theme.IntentAndintentFiltersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IntentAndintentFiltersTheme {
                Button(onClick = {
//                    Intent(Intent.ACTION_MAIN).also {
//                        it.`package` = "com.android.chrome"
//                        try {
//                            startActivity(it)
//                        } catch (e: ActivityNotFoundException) {
//                            e.printStackTrace()
//                        }
//                    }
                   val intent =  Intent(Intent.ACTION_SEND).apply {
                        type = "text/plain"
                        putExtra(Intent.EXTRA_EMAIL,"def@gmial.vom")
                        putExtra(Intent.EXTRA_SUBJECT,"Subhejct")
                        putExtra(Intent.EXTRA_TEXT,"gsgsdfg")
                    }
                    if (intent.resolveActivity(packageManager)!=null){
                        startActivity(intent)
                    }
                }) {
                    Text(text = "Click Me")

                }
            }
        }
    }
}