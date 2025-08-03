// Step 3: PermanentStaff with unique salary
class PermanentStaff(
    name: String,
    id: Int,
    val salary: Double
) : Employee(name, id) {

    override fun displayRole() {
        println("$name (ID: $id) is a Permanent Staff.")
    }

    fun getAnnualBonus(): Double {
        return salary * 0.1
    }
}
