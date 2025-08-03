fun main() {
    // Create TemporaryStaff object
    val temp = TemporaryStaff("Nimi", 101, 800.0)
    temp.displayRole()
    println("Weekly Pay for 40 hours: ${temp.calculateWeeklyPay(40)}")

    println()

    // Create PermanentStaff object
    val perm = PermanentStaff("Ravi", 102, 50000.0)
    perm.displayRole()
    println("Annual Bonus: ${perm.getAnnualBonus()}")
}
