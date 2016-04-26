package whenAsExpression

import whenAsExpression.Colour.*

enum class Colour {
    BLUE, ORANGE, RED
}

fun updateWeather(celsiusDegrees: Double) {
    val description: String
    val colour: Colour
    when (celsiusDegrees) {
        in -50..0 -> {
            description = "cold"
            colour = BLUE
        }
        in 0..15 -> {
            description = "mild"
            colour = ORANGE
        }
        else -> {
            description = "hot"
            colour = RED
        }
    }
}

fun updateWeather1(celsiusDegrees: Double) {
    val (description, colour) = when (celsiusDegrees) {
        in -50..0 -> "cold" to BLUE
        in 0..15 -> "mild" to ORANGE
        else -> "hot" to RED
    }
}