package string.leetcode;

/*
    2942. Find words containing character
    https://leetcode.com/problems/find-words-containing-character/description/

    Input: words = ["leet","code"], x = "e"
    Output: [0,1]
    Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
    Output: [0,2]
    Input: words = ["abc","bcd","aaaa","cbc"], x = "z"
    Output: []
*/

import java.util.ArrayList;

public class P005_Find_words_containing_characters {
    public static void main(String[] args) {
        String[] words1 = {"leet","code"}, words2 = {"abc","bcd","aaaa","cbc"};
        String[] words3= {"abc","bcd","aaaa","cbc"};
        char x1 = 'e', x2 = 'a', x3 = 'z';
        System.out.println("Words containing characters are at index : " + findWordsContaining(words1, x1));
        System.out.println("Words containing characters are at index : " + findWordsContaining(words2, x2));
        System.out.println("Words containing characters are at index : " + findWordsContaining(words3, x3));
    }

    // SOLUTION USING LOOP - time complexity - O(n^2)
    // Here time complexity is O(n^2) because indexOf() internally uses a for loop.
    public static ArrayList<Integer> findWordsContaining(String[] words, char x) {
        // Create an ArrayList to store the indexes.
        ArrayList<Integer> listOfWords = new ArrayList<>();
        // Loop through words array and check if the character is present in any index of the word.
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                listOfWords.add(i);
            }
        }
        return listOfWords;
    }
}
