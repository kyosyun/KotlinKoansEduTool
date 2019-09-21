class LazyProperty(val initializer: () -> Int) {

    var value: Int?

    val lazy: Int
        get() {
            if (value == null) {
                value = initializer()
            }
            return value!!
        }
}
