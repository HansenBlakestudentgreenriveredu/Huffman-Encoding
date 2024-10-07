import java.util.HashMap;
import java.util.Scanner;

public class HuffmanEncoding {
    public static void main(String[] args) {
        // Create Scanner to read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Huffman Encoding Program!");
        System.out.println("Please enter a string: ");
        String input = scanner.nextLine();

        // store frequency of each char
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Arrays to hold char and frequencies
        char[] charArray = new char[frequencyMap.size()];
        int[] charFreq = new int[frequencyMap.size()];
        int index = 0;

        // fill arrays with the frequency map
        for (HashMap.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            charArray[index] = entry.getKey();
            charFreq[index] = entry.getValue();
            index++;
        }

        // instance of HuffmanCoding class, build tree, generate codes
        HuffmanCoding huffmanCoding = new HuffmanCoding();
        Node root = huffmanCoding.buildHuffmanTree(charArray, charFreq);
        huffmanCoding.encode(root, "");
        huffmanCoding.printCode();
        huffmanCoding.calculateSavings(input);

        scanner.close();
    }
}