object PrimeFactorCalculator {

    fun primeFactors(int: Int): List<Int> {
        val resultList :MutableList<Int> = mutableListOf()
        var divisor = 2
        var n = int

        while (n > 1) {
            if (n % divisor == 0) {
                n /= divisor
                resultList.add(divisor)
            } else {
                divisor++
            }
        }
        return resultList
    }

    fun primeFactors(long: Long): List<Long> {

        return listOf()
    }
}
