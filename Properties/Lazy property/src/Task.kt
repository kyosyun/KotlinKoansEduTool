class LazyProperty(val initializer: () -> Int) {

    val lazy: Int
        get() {
            // TODO: 再
        }

    operator fun invoke() {
        initializer()
    }
}
