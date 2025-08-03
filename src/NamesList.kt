fun main() {
    val names = mutableListOf<String>()

    // 👉 Get 5 names from user
    for (i in 1..5) {
        print("Enter name $i: ")
        val name = readLine() ?: ""
        names.add(name)
    }

    println("\nHere are the names with their index:")

    // 👉 Print names with index
    for ((index, name) in names.withIndex()) {
        println("$index: $name")
    }
}
