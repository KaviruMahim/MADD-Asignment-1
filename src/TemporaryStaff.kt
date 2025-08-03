// Step 2: TemporaryStaff with unique hourlyRate
class TemporaryStaff(
    name: String,
    id: Int,
    val hourlyRate: Double
) : Employee(name, id) {

    override fun displayRole() {
        println("$name (ID: $id) is a Temporary Staff.")
    }

    fun calculateWeeklyPay(hours: Int): Double {
        return hours * hourlyRate
    }
}
