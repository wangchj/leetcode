/**
 * Author: Chih-Jye Wang
 * Date  : Sep 14, 2015
 *
 * Implement a trie with insert, search, and startsWith methods.
 *
 * Note:
 * You may assume that all inputs are consist of lowercase letters a-z.
 *
 * https://leetcode.com/problems/implement-trie-prefix-tree/
 */

import java.util.HashMap;

class TrieNode {
    HashMap<Character, TrieNode> map;
    boolean isWord;

    public TrieNode() {
        map = new HashMap<>();
        isWord = false;    
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode node = root;
        for(int i = 0; i < word.length(); i++) {
            if(node.map.containsKey(word.charAt(i))) {
                node = node.map.get(word.charAt(i));
            }
            else {
                TrieNode n = new TrieNode();
                node.map.put(word.charAt(i), n);
                node = n;
            }
        }
        node.isWord = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode node = root;
        for(int i = 0; i < word.length(); i++) {
            if(!node.map.containsKey(word.charAt(i)))
                return false;
            node = node.map.get(word.charAt(i));
        }
        return node.isWord;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(int i = 0; i < prefix.length(); i++) {
            if(!node.map.containsKey(prefix.charAt(i)))
                return false;
            node = node.map.get(prefix.charAt(i));
        }
        return true;
    }
}