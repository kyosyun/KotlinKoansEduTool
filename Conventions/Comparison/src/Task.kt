data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        return when {
            year.compareTo(other.year) != 0 -> {
                year.compareTo(other.year)
            }
            month.compareTo(other.month) != 0 -> {
                month.compareTo(other.month)
            }
            else -> {
                this.dayOfMonth.compareTo(other.dayOfMonth)
            }
        }
    }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2
