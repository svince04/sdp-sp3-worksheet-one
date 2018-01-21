class Anagram(private val word: String) {

    fun match(anagrams: Collection<String>): Set<String> {
        val result :Set<String> = anagrams.filter { anag -> (anag.length == word.length) }
                .toMutableSet()
        val matches :MutableSet<String> = mutableSetOf()
        val targetWord = normaliseAndSort(word)

        for (w in result) {
            if (word.toLowerCase() == w.toLowerCase()) {
                continue
            }
            if (normaliseAndSort(w) == targetWord) matches.add(w)
        }
        return matches
    }

    private fun normaliseAndSort(input: String) :String {
        val inputCharArray = input.toLowerCase().toCharArray()
        inputCharArray.sort()
        return inputCharArray.joinToString("")

    }

}