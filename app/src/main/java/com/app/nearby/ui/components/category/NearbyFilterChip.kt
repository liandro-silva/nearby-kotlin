package com.app.nearby.ui.components.category

import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.nearby.data.model.NearbyCategory
import com.app.nearby.ui.theme.Gray300
import com.app.nearby.ui.theme.Gray400
import com.app.nearby.ui.theme.GreenBase
import com.app.nearby.ui.theme.Typography

@Composable
fun NearbyFilterChip(
    modifier: Modifier = Modifier,
    category: NearbyCategory,
    isSelected: Boolean,
    onClick: (isSelected: Boolean) -> Unit
) {
    FilterChip(
        modifier = modifier
            .padding(2.dp)
            .heightIn(min = 36.dp),
        elevation = FilterChipDefaults.filterChipElevation(
            elevation = 8.dp
        ),
        leadingIcon = {
            category.icon?.let {
                Icon(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(id = it),
                    contentDescription = "Ícone de filtro de categoria",
                    tint = if (isSelected) Color.White else Gray400
                )
            }
        },
        border = FilterChipDefaults.filterChipBorder(
            enabled = false,
            selected = isSelected,
            disabledBorderColor = Gray300,
            borderWidth = 1.dp,
            selectedBorderWidth = 0.dp,
            selectedBorderColor = Color.Transparent
        ),
        selected = isSelected,
        onClick = { onClick(!isSelected) },
        colors = FilterChipDefaults.filterChipColors(
            containerColor = Color.White,
            selectedContainerColor = GreenBase
        ),
        label = {
            Text(
                text = category.name,
                style = Typography.bodyMedium,
                color = if (isSelected) Color.White else Gray400
            )
        },
    )
}

@Preview
@Composable
private fun NearbyFilterChipSelectedPreview() {
    NearbyFilterChip(
        category = NearbyCategory(
            id = "1",
            name = "Alimentação"
        ),
        isSelected = true,
        onClick = {}
    )
}

@Preview
@Composable
private fun NearbyFilterChipUnSelectedPreview() {
    NearbyFilterChip(
        category = NearbyCategory(
            id = "1",
            name = "Cinema"
        ),
        isSelected = false,
        onClick = {}
    )
}