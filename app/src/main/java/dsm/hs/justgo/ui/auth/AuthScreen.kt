package dsm.hs.justgo.ui.auth

import android.app.ActionBar.LayoutParams
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import dsm.hs.justgo.core.WEB_URL

@Composable
fun AuthScreen(
    modifier: Modifier = Modifier,
    appendUrl: String = "",
) {
    Scaffold(
        modifier = modifier,
    ) { innerPadding ->
        AndroidView(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            factory = {
                WebView(it).apply {
                    layoutParams = ViewGroup.LayoutParams(
                        LayoutParams.MATCH_PARENT,
                        LayoutParams.MATCH_PARENT,
                    )
                    settings.javaScriptEnabled = true
                    webViewClient = WebViewClient()

                    settings.loadWithOverviewMode = true
                    settings.useWideViewPort = true
                    settings.setSupportZoom(true)
                    settings.domStorageEnabled = true
                    webChromeClient = object : WebChromeClient() {
                        override fun onCloseWindow(window: WebView?) {}
                    }
                }
            },
            update = {
                it.loadUrl(WEB_URL + appendUrl)
            },
        )
    }
}
