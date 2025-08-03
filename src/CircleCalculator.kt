fun calculateArea(radius: Double): Double {
    val pi = 3.14
    return pi * radius * radius
}

fun calculateCircumference(radius: Double): Double {
    val pi = 3.14
    return 2 * pi * radius
}

fun main() {
    print("Enter the radius: ")
    val radius = readLine()?.toDoubleOrNull()

    if (radius != null && radius > 0) {
        println("Area: ${calculateArea(radius)}")
        println("Circumference: ${calculateCircumference(radius)}")
    } else {
        println("❌ Invalid radius")
    }
}
