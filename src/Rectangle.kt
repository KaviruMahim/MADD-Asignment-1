// Step 3: Rectangle implements Shape
class Rectangle(val width: Double, val height: Double) : Shape {
    override fun setup() {
        println("Setting up a Rectangle of size $width x $height")
    }

    override fun draw() {
        println("Drawing a Rectangle")
    }
}
