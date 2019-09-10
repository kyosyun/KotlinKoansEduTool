import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

// TODO: 再
operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = this.addTimeIntervals(timeInterval, 1)

operator fun MyDate.plus(repeatTimeInterval: RepeateTimeInterval): MyDate {
    return this.addTimeIntervals(repeatTimeInterval.timeInterval, repeatTimeInterval.num)
}

operator fun TimeInterval.times(num: Int): RepeateTimeInterval {
    return RepeateTimeInterval(this, num)
}

data class RepeateTimeInterval(val timeInterval: TimeInterval, val num: Int)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
