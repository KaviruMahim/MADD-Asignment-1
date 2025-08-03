// Step 1: Abstract class with basic info
abstract class Employee(
    val name: String,
    val id: Int
) {
    // Abstract method (must override in subclasses)
    abstract fun displayRole()
}
