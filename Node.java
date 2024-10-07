import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.HashMap;

/*
 * Author: Blake Hansen
 * Assignment: Huffman-encoding
 * Version: 1
 */

public class Node {
    char ch;
    int frequency;
    Node left, right;

    public Node(char ch, int frequency) {
        this.ch = ch;
        this.frequency = frequency;
        left = right = null;
    }
}