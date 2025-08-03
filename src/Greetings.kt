fun greetings(name: String, age: Int) {
    println("Hi $name! You are $age years old.")

    if (age >= 18) {
        println("You are eligible to apply for a driving license!")
    } else {
        println("Sorry, you must be 18 or older to apply for a driving license.")
    }
}

fun main() {
    print("Enter your name: ")
    val name = readLine() ?: ""

    print("Enter your age: ")
    val age = readLine()?.toIntOrNull()

    if (age != null && age >= 0) {
        greetings(name, age)
    } else {
        println("Invalid age input")
    }
}
