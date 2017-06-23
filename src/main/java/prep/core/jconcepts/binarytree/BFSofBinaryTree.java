/**
 * 
 */
package prep.core.jconcepts.binarytree;

import prep.core.jconcepts.ds.QueueArray;

/**
 * @author Hareesha Jun 16, 2017
 */
public class BFSofBinaryTree {

	/**
	 * Breadth traversal of Binary Tree
	 * 
	 * Queue is used to do BFS, FIFO
	 * 
	 * First Root is enqueued , later it is deququed processed and its left
	 * child and right child are added.
	 * 
	 * First node of the queue is dequeued and processed and its left and right child are enqueued
	 * Same is continued till there are no elements in the queue
	 * 
	 * 
	 */

	public static void main(String[] args) {

		NodeBT<Character> n1 = new NodeBT<>('A');

		NodeBT<Character> n2 = new NodeBT<>('B');

		NodeBT<Character> n3 = new NodeBT<>('C');

		NodeBT<Character> n4 = new NodeBT<>('D');

		NodeBT<Character> n5 = new NodeBT<>('E');

		NodeBT<Character> n6 = new NodeBT<>('F');

		NodeBT<Character> n7 = new NodeBT<>('G');

		NodeBT<Character> n8 = new NodeBT<>('H');

		// Tree arrangement

		n1.setLeftChild(n2);// A ->B
		n1.setRightChild(n3);// A -> C

		n2.setLeftChild(n4);// B- >D
		n2.setRightChild(n5); // B->E

		n3.setLeftChild(n6);// C->F
		n3.setRightChild(n7);// c->G

		n4.setLeftChild(n8); // D->H
		breadthFirstTraversal(n1);
	}

	public static void breadthFirstTraversal(NodeBT root) {
		QueueArray<NodeBT> bt = new QueueArray<NodeBT>(NodeBT.class, 10);
		if (root == null) {
			return;
		}

		bt.enqueue(root);
		while (!bt.isEmpty()) {
			NodeBT node = bt.dequeue();
			if(node==null){ //this is the base case
				break;
			}
				System.out.println(node);

				if (node.getLeftChild() != null) {

					bt.enqueue(node.getLeftChild());
				}
				if (node.getRightChild() != null) {
					bt.enqueue(node.getRightChild());
				}
		}

	}
}

class NodeBT<T> {

	private T val;
	private NodeBT<T> leftChild;
	private NodeBT<T> rightChild;

	public NodeBT(T val) {
		this.val = val;
	}

	public T getVal() {
		return val;
	}

	public NodeBT<T> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(NodeBT<T> leftChild) {
		this.leftChild = leftChild;
	}

	public NodeBT<T> getRightChild() {
		return rightChild;
	}

	public void setRightChild(NodeBT<T> rightChild) {
		this.rightChild = rightChild;
	}
	
	public String toString(){
		return this.val.toString();
		
	}

}