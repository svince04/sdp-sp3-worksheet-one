class Anagram(private val word: String) {

    fun match(anagrams: Collection<String>): Set<String> {
        val targetWord = normaliseAndSort(word)
        return anagrams.filter { w -> w.length == word.length  }
                .filter { w -> w.toLowerCase() != word.toLowerCase() }
                .filter { w -> normaliseAndSort(w) == targetWord }.toMutableSet()
    }

    private fun normaliseAndSort(input: String) :String {
        val inputCharArray = input.toLowerCase().toCharArray()
        inputCharArray.sort()
        return inputCharArray.joinToString("")

    }

}