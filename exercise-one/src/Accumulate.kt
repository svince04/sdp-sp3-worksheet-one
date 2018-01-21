object Accumulate {
    fun <T, R> accumulate(collection: List<T>, function: (T) -> R): List<R> {
        val result: MutableList<R> = mutableListOf()

        for (n in collection) {
            result.add(function(n))
        }

        return result
    }
}