import java.util.HashMap; // stores char codes
import java.util.PriorityQueue; // building huffman tree

public class HuffmanCoding {
    // map to store codes for each char
    private HashMap<Character, String> huffmanCode = new HashMap<>();

    // method to make codes for each char
    public void encode(Node root, String str) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            huffmanCode.put(root.ch, str);
        }
        encode(root.left, str + "0");
        encode(root.right, str + "1");
    }

    // print code
    public void printCode() {
        System.out.println("Huffman Code:");
        for (HashMap.Entry<Character, String> entry : huffmanCode.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // make tree from char array and frequencies
    public Node buildHuffmanTree(char[] charArray, int[] charFreq) {
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>((a, b) -> a.frequency - b.frequency);
        for (int i = 0; i < charArray.length; i++)
            priorityQueue.add(new Node(charArray[i], charFreq[i]));{
        }

        // keep combining until one node left in queue
        while (priorityQueue.size() > 1) {
            Node left = priorityQueue.poll();
            Node right = priorityQueue.poll();
            Node newNode = new Node('\0', left.frequency + right.frequency);
            newNode.left = left;
            newNode.right = right;
            priorityQueue.add(newNode);
        }
        return priorityQueue.poll();
    }

    // calculate and print space savings
    public void calculateSavings(String input) {
        int originalSize = input.length() * 8;
        int huffmanSize = 0;

        for (char c : input.toCharArray()) {
            huffmanSize += huffmanCode.get(c).length();
        }

        // print original, Huffman, and savings amount
        System.out.println("Original size in bits:" + originalSize);
        System.out.println("Huffman size in bits:" + huffmanSize);
        System.out.println("Space savings in bits:" + (originalSize - huffmanSize));
    }
}