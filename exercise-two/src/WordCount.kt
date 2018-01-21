object WordCount {

    fun phrase(phrase: String) :Map<String, Int> {
        val words :List<String> = phrase.toLowerCase()
                .split(" ", ", ", ",")

        val returnList :List<String> = words.map { w -> w.replace(Regex("[^\\w\']"), "")
                .trim('\'') }

        return returnList.groupingBy { it }.eachCount()
    }

}