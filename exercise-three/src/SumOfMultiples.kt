object SumOfMultiples {

    fun sum(factors: Set<Int>, limit: Int): Int {
        var total = 0
        for (i in 1..(limit -1)) {
            for (f in factors) {
                if(i % f == 0) {
                    total += i
                    break
                }
            }
        }
        return total
    }
}