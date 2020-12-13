// Java implementation of the approach 
class GFG 
{ 

static class node 
{ 
	int key; 
	node left, right; 
}; 

// A utility function to create a new BST node 
static node newNode(int item) 
{ 
	node temp = new node(); 
	temp.key = item; 
	temp.left = temp.right = null; 
	return temp; 
} 

/* A utility function to insert 
a new node with given key in BST */
static node insert(node node, int key) 
{ 
	/* If the tree is empty, 
	return a new node */
	if (node == null) 
		return newNode(key); 

	//System.out.println(key +" "+node.key);
	/* Otherwise, recur down the tree */
	if (key < node.key)
		
		node.left = insert(node.left, key); 
	else if (key > node.key) 
		node.right = insert(node.right, key); 

	/* return the (unchanged) node pointer */
	return node; 
} 

/* Compute the "maxDepth" of a tree -- 
the number of nodes along the longest path 
from the root node down to the farthest leaf node.*/
static int maxDepth(node node) 
{ 
	if (node == null) 
		return 0; 
	else
	{ 
		
		/* compute the depth of each subtree */
		int lDepth = maxDepth(node.left); 
		int rDepth = maxDepth(node.right); 

		/* use the larger one */
		if (lDepth > rDepth) 
			return (lDepth + 1); 
		else
			return (rDepth + 1); 
	} 
} 

// Function to return the maximum 
// heights among the BSTs 
static int maxHeight(int a[], int n) 
{ 
	// Create a BST starting from 
		// the first element 
		node rootA = null; 
		rootA = insert(rootA, a[0]); 
		for (int i = 1; i < n; i++) 
			rootA = insert(rootA, a[i]); 

		// Create another BST starting 
		// from the last element 
		node rootB = null; 
		rootB = insert(rootB, a[n - 1]); 
		for (int i = n - 2; i >= 0; i--) 
			rootB =insert(rootB, a[i]); 

		// Find the heights of both the trees 
		int A = maxDepth(rootA) - 1; 
		int B = maxDepth(rootB) - 1; 

		return Math.max(A, B); 
} 

// Driver code 
public static void main(String args[]) 
{ 
	int a[] = { 5,4,6,2,3,4}; 
	int n = a.length; 

	System.out.println(maxHeight(a, n)); 
} 
} 

// This code is contributed by Arnab Kundu 
