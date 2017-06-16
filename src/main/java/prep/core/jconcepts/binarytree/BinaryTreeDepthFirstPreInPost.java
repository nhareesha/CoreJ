/**
 * 
 */
package prep.core.jconcepts.binarytree;

/**
 * @author Hareesha
 * Jun 16, 2017
 */
public class BinaryTreeDepthFirstPreInPost {

	/**
	 * Depth First ; Is the another vairent traversal for Binary tree
	 * 
	 * In Depth first there are 3 varients.
	 * 
	 * PreOrder : While traversing the tree, Node is processed first , before its left and right child is visied
	 * this holds good for every node
	 * 
	 * In order : While traversing the tree, left child is visised and node is processed and then the right child
	 * This hold good for each and every node of the tree, to the depth of the tree
	 * 
	 * Post : left visited fully , right viisted fully, root processed, for each and every node to depth of the node
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		NodeBT<Character> a = new NodeBT<>('A');
		NodeBT<Character> b = new NodeBT<>('B');
		NodeBT<Character> c = new NodeBT<>('C');
		NodeBT<Character> d = new NodeBT<>('D');
		NodeBT<Character> e = new NodeBT<>('E');
		NodeBT<Character> f = new NodeBT<>('F');
		NodeBT<Character> g = new NodeBT<>('G');
		NodeBT<Character> h = new NodeBT<>('H');
		
		//Tree construction
		a.setLeftChild(b);
		a.setRightChild(c);
		b.setLeftChild(d);
		b.setRightChild(e);
		c.setLeftChild(f);
		f.setLeftChild(g);
		f.setRightChild(h);
		
		System.out.println("PRE - ORDER - DEPTH FIRST ");
			preOrder(a);
		
		System.out.println("\n"+"IN - ORDER - DEPTH FIRST ");
		inOrder(a);
		
		System.out.println("\n POST - ORDER - DEPTH FIRST ");
		postOrder(a);
		
		
	}
	
	public static void preOrder(NodeBT node){
		if(node==null){
			return;
		}
		
		print(node);
		preOrder(node.getLeftChild());
		preOrder(node.getRightChild());
	}
	
	public static void inOrder(NodeBT node){
		if(node==null){
			return;
		}
		
		inOrder(node.getLeftChild());
		print(node);
		inOrder(node.getRightChild());
	}
	public static void postOrder(NodeBT node){
		if(node==null){
			return;
		}
		
		postOrder(node.getLeftChild());
		postOrder(node.getRightChild());
		print(node);
	}
	
	private static void print(NodeBT node){
		System.out.print(node.getVal().toString()+"\t");
	}
}
