import java.util.PriorityQueue;
import java.util.Scanner;
public class Huffman {

	

		public static boolean isLetter(char c) {
		    return Character.isLetter(c);
		  }

		public static void printCode(Node node, String s)
	    {
	 
	        if (node.left == null && node.right == null && isLetter(node.c)) {
	 
	            System.out.println(node.c + ":" + s);
	 
	            return;
	        }
	        printCode(node.left, s + "0");
	        printCode(node.right, s + "1");
	    }


		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			 
	        int n = 8;
	        char[] char_array = { 'A', 'B', 'C', 'D', 'E','F','G','H'};
	        int[] char_frequency = { 20,16,40,24,38,52,23,28 };
	 
	        
	        PriorityQueue<Node> queue = new PriorityQueue<Node>(n, new ImplementComparator());
	 
	        for (int i = 0; i < n; i++) {
	 
	            
	            Node node = new Node();
	 
	            node.c = char_array[i];
	            node.data = char_frequency[i];
	 
	            node.left = null;
	            node.right = null;
	 
	            
	            queue.add(node);
	        }
	        Node root = null;
	        
	        
	        while (queue.size() > 1) {
	 
	            
	            Node min_freq = queue.peek();
	            queue.poll();
	 
	            
	            Node secondMin_freq = queue.peek();
	            queue.poll();
	 
	            
	            Node f = new Node();
	 
	            
	            f.data = min_freq.data + secondMin_freq.data;
	            f.c = '-';
	 
	            
	            f.left = min_freq;
	 
	            
	            f.right = secondMin_freq;
	 
	            
	            root = f;
	 
	            
	            queue.add(f);
	        }
	 
	        
	        printCode(root, "");

		}

	


	}

