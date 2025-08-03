// Step 2: Circle implements Shape
class Circle(val radius: Double) : Shape {
    override fun setup() {
        println("Setting up a Circle with radius $radius")
    }

    override fun draw() {
        println("Drawing a Circle")
    }
}
