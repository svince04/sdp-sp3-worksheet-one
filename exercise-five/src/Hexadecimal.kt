object Hexadecimal {

    fun toDecimal(s: String): Int {
        val characterArray :MutableList<Char> = s.toCharArray().toMutableList()
        var i = s.length - 1
        var result = 0.0

        for (c in characterArray) {
            val charValue = when (c.toInt()) {
            48 -> 0
            49 -> 1
            50 -> 2
            51 -> 3
            52 -> 4
            53 -> 5
            54 -> 6
            55 -> 7
            56 -> 8
            57 -> 9
            97, 65 -> 10
            98, 66 -> 11
            99, 67 -> 12
            100, 68 -> 13
            101, 69 -> 14
            102, 70 -> 15
            else -> 999
            }
            if (charValue == 999) {
                result = 0.0
                break
            }
            result += (charValue * Math.pow(16.0, i.toDouble()))
            println(result)
            i--
        }

        return result.toInt()
    }
}