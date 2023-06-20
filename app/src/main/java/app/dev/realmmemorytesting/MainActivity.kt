package app.dev.realmmemorytesting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.dev.realmmemorytesting.ui.theme.RealmMemoryTestingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel by viewModels<ActivityViewModel>()
        setContent {
            RealmMemoryTestingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(modifier = Modifier.fillMaxSize()) {
                        Button(
                            onClick = { viewModel.onClick() },
                            modifier = Modifier.align(Alignment.Center)
                        ) {
                            Text("Click me")
                        }
                        Text(
                            text = viewModel.state.value.count().toString(),
                            modifier = Modifier
                                .align(Alignment.Center)
                                .padding(top = 100.dp)
                        )
                        Text(
                            text = viewModel.state2.value.toString(),
                            modifier = Modifier
                                .align(Alignment.Center)
                                .padding(top = 150.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RealmMemoryTestingTheme {
        Greeting("Android")
    }
}