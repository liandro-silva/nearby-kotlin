package com.app.nearby.ui.components.market.details

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.nearby.data.model.NearbyRules
import com.app.nearby.data.model.mocks.mockRules
import com.app.nearby.ui.theme.Gray400
import com.app.nearby.ui.theme.Gray500
import com.app.nearby.ui.theme.Typography

@Composable
fun NearbyMarketDetailsRules(
    modifier: Modifier = Modifier,
    rules: List<NearbyRules>
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = "Regulamento", style = Typography.headlineSmall, color = Gray400)
        Text(
            modifier = Modifier.padding(start = 16.dp),
            text = rules.joinToString(
                separator = "\n",
                transform = { "• ${it.description}" },
            ),
            style = Typography.labelMedium,
            lineHeight = 24.sp,
            color = Gray500
        )
    }
}

@Preview
@Composable
private fun MarketDetailsRulesPreview() {
    NearbyMarketDetailsRules(
        modifier = Modifier.fillMaxWidth(),
        rules = mockRules
    )
}