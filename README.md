# Huffman Encoding Program

# Overview
This Java program implements the Huffman coding algorithm, which is used for data compression. It takes an input string, 
constructs a Huffman tree based on character frequencies, generates binary Huffman codes, and calculates space savings compared to the original string.

# Key Features:
- Takes a string as input.
- Calculates character frequencies.
- Constructs a Huffman tree.
- Generates Huffman codes for each character.
- Displays Huffman codes and calculates space savings.

# Node Class
The Node class represents a node in the Huffman tree. Each node stores:
- A character (ch)
- Its frequency (frequency)
- Left and right child nodes ("left", "right")

# HuffmanCoding Class
The HuffmanCoding class handles the core functionality of the Huffman coding algorithm, including:
- **encode(Node root, String str)**: Recursively generates Huffman codes for each character starting from the root of the Huffman tree.
- **printCode()**: Prints the generated Huffman codes.
- **buildHuffmanTree(char[] charArray, int[] charFreq)**: Builds a Huffman tree from character frequencies.
- **calculateSavings(String input)**: Calculates and prints the space savings between the original string and its Huffman encoded form.

# HuffmanEncoding Class
The HuffmanEncoding class contains the main method and handles user input and output. It:
- Reads a string from the user.
- Calculates character frequencies.
- Builds the Huffman tree and generates codes.
- Prints the Huffman codes and the space savings.

# Usage Instructions:
# Step 1: Run the Program
Run the program by pressing the play button in IntelliJ IDEA while in the HuffmanEncoding.java class.

# Step 2: Input a String
The program will prompt you to enter a string. Type in the string you wish to encode.

# Step 3: Output
The program will output the following:
- The Huffman codes for each character in the string.
- The original size of the string in bits.
- The size of the string after Huffman encoding.
- The space savings in bits.

# Example
### Input:
Welcome to Huffman Encoding Program!

### Output:
Huffman Code:
W: 1010
e: 00
l: 111
c: 1101
o: 1110
m: 010
t: 0110
: 1100
h: 0111
f: 10110
a: 10111
n: 1000
  : 1001
p: 01101
g: 0100
r: 0011
u: 0010

Original size in bits: 224
Huffman size in bits: 152
Space savings in bits: 72

# Explanation of How the Program Works
1. **User Input**: The program prompts the user for an input string.
2. **Frequency Calculation**: It calculates the frequency of each character in the string.
3. **Huffman Tree Construction**: Using a priority queue, the program builds a Huffman tree. Nodes with lower frequencies are merged first to create the tree structure.
4. **Encoding**: The program generates Huffman codes by traversing the tree. Left branches are represented by "0", and right branches by "1".
5. **Output**: The Huffman codes for each character are displayed, along with the size of the original and encoded strings. The space savings are calculated and shown.
