# Getting Started

This combines 2 word lists
1/ The unigram_freq is taken from Kaggle https://www.kaggle.com/rtatman/english-word-frequency?select=unigram_freq.csv
2/ THe word_alpha.txt file, taken from the englih_words github repo, which I have cloned https://github.com/khylo/english-words


To filter we just used excel, and did a ISNUMBER(MATCH) o find the words that matched the word_alpha list and saved that as filteredWordFreq.csv
However unigram_freq.csv contains internet abreviations (e.g. dwnlds) so we filtered it against the words_alpha.txt file to remove words which down't exist

We plan to use this updated list to generate anagram game, and solver.

 