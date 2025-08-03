fun whoAmI(input: Any): String {
    return input::class.simpleName ?: "Unknown"
}

fun main() {
    print("Enter something: ")
    val input = readLine() ?: ""

    // The input is always a string, so we try to guess its real type
    val result = when {
        input.toIntOrNull() != null -> whoAmI(input.toInt())
        input.toDoubleOrNull() != null -> whoAmI(input.toDouble())
        input.equals("true", true) || input.equals("false", true) -> whoAmI(input.toBoolean())
        else -> whoAmI(input)
    }

    println("Type: $result")
}
