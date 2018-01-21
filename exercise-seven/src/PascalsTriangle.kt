object PascalsTriangle {
    fun computeTriangle(rows: Int): List<List<Int>> {
        if (rows < 0) throw IllegalArgumentException("Rows can't be negative!")
        val resultList: MutableList<List<Int>> = mutableListOf()
        if (rows == 0) return resultList
        resultList.add(listOf(1))

        for (n in 1 until rows) {
            val tempList: MutableList<Int> = mutableListOf(1)
            for (i in 1 until n) {
                val lastRow = resultList[resultList.size - 1]
                tempList.add(lastRow[(i - 1) + lastRow[i]])
            }
            tempList.add(1)
            resultList.add(tempList)
        }
        return resultList
    }
}