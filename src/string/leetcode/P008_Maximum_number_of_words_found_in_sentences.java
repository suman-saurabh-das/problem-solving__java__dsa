package string.leetcode;

/*
    2114. Maximum number of words found in sentences
    https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/

    Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
    Output: 6
    Input: sentences = ["please wait", "continue to fight", "continue to win"]
    Output: 3
*/

public class P008_Maximum_number_of_words_found_in_sentences {
    public static void main(String[] args) {
        String[] sentences1 = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"}, sentences2 = {"please wait", "continue to fight", "continue to win"};
        System.out.println("Maximum number of words : " + mostWordsFound(sentences1));
        System.out.println("Maximum number of words : " + mostWordsFound(sentences2));
    }

    // SOLUTION USING LOOP - time complexity - O(n^2)
    // Here time complexity is O(n^2) because split() internally uses a loop to find all occurrence of delimiter.
    public static int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (int i = 0; i < sentences.length; i++) {
            String str = sentences[i];
            int numWords = str.split(" ").length;
            maxWords = Math.max(numWords, maxWords);
        }
        return maxWords;
    }
}
