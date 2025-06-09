package com.app.nearby.data.model

import androidx.annotation.DrawableRes
import com.app.nearby.R

enum class NearbyFilterChipView(
    val description: String,
    @DrawableRes val icon: Int
) {
    ALIMENTACAO(description = "Alimentação", icon = R.drawable.ic_tools_kitchen_2),
    COMPRAS(description = "Compras", icon = R.drawable.ic_shopping_bag),
    HOSPEDAGEM(description = "Hospedagem", icon = R.drawable.ic_bed),
    SUPERMERCADO(description = "Supermercado", icon = R.drawable.ic_shopping_cart),
    ENTRETENIMENTO(description = "Entretenimento", icon = R.drawable.ic_movie),
    FARMACIA(description = "Farmácia", icon = R.drawable.ic_first_aid_kit),
    COMBUSTIVEL(description = "Combustível", icon = R.drawable.ic_gas_station),
    CINEMA(description = "Cinema", icon = R.drawable.ic_movie),
    PADARIA(description = "Padaria", icon = R.drawable.ic_bakery);

    companion object {
        fun fromDescription(description: String): NearbyFilterChipView? {
            return entries.find { it.description == description }
        }
    }
}