/*
 * Design a data structure that supports the following two operations:

 * void addWord(word)
 * bool search(word)
 * search(word) can search a literal word or a regular expression 
 * string containing only letters a-z or .. A . means it can represent 
 * any one letter.
 * 
 * For example:
 * 
 * addWord("bad")
 * addWord("dad")
 * addWord("mad")
 * search("pad") -> false
 * search("bad") -> true
 * search(".ad") -> true
 * search("b..") -> true
 *
 * Note:
 * You may assume that all words are consist of lowercase letters a-z.
 */
public class AddAndSearchWordDataStructureDesign {

}

class WordDictionary {

    TrieNode root = new TrieNode();

    public void addWord(String word) {
        TrieNode cur = root;
        for (char c : word.toCharArray()) {
            if (cur.children[c - 'a'] == null)
                cur.children[c - 'a'] = new char[26];
            cur = cur.children[c - 'a'];
        }
        cur.isLeaf = true;
    }

    public boolean search(String word) {

    }

    public boolean dfs(TrieNode root, String word) {
        if (word.length() == 1 && root.children[word.charAt(0) - 'a'] != null && root.isLeaf)
            return true;
        if (word.char(0) == '.') {
            
        } else {
            if (root.chidren[word.charAt(0) - 'a'] == null)
                return false;
            dfs(root.children[word.charAt(0) - 'a'], word.substring(1));
        }
    }

}


class TrieNode {
    
    public TrieNode[] children;
    public isLeaf;

    public TrieNode() {
        children = new Trie[26];
        isLeaf = false;
    }

}
