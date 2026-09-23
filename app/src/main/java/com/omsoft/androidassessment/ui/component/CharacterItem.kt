package com.omsoft.androidassessment.ui.component

import androidx.compose.runtime.Composable
import com.omsoft.androidassessment.data.model.CharacterDto
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun CharacterItem(character: CharacterDto) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 3.dp)
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = character.image,
                contentDescription = character.name,
                modifier = Modifier.size(60.dp).clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text(text = character.name, style = MaterialTheme.typography.titleMedium)
                Text(text = "Species: ${character.species}", style = MaterialTheme.typography.bodyMedium)

                val badgeColor = when (character.status.lowercase()) {
                    "alive" -> Color(0xFF4CAF50)
                    "dead" -> Color(0xFFF44336)
                    else -> Color.Gray
                }
                Text(
                    text = "Status: ${character.status}",
                    color = badgeColor,
                    style = MaterialTheme.typography.labelMedium
                )
            }
        }
    }
}