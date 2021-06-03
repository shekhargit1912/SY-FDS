class BST_class { 
   class Node { 
        int key; 
        Node left, right; 
   
        public Node(int data){ 
            key = data; 
            left = right = null; 
        } 
    } 
  
    Node root; 
    BST_class(){ 
        root = null; 
    } 
   
    void deleteKey(int key) { 
        root = delete_Recursive(root, key); 
    } 
   
  
    Node delete_Recursive(Node root, int key)  { 
       
        if (root == null)  return root; 
   
   
        if (key < root.key)     
            root.left = delete_Recursive(root.left, key); 
        else if (key > root.key) 
            root.right = delete_Recursive(root.right, key); 
        else  { 
           
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
   
          
           
            root.key = minValue(root.right); 
   
           
            root.right = delete_Recursive(root.right, root.key); 
        } 
        return root; 
    } 
   
    int minValue(Node root)  { 
     
        int minval = root.key; 
       
        while (root.left != null)  { 
            minval = root.left.key; 
            root = root.left; 
        } 
        return minval; 
    } 
   
  
    void insert(int key)  { 
        root = insert_Recursive(root, key); 
    } 
   
   
    Node insert_Recursive(Node root, int key) { 
      
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
      
        if (key < root.key)    
            root.left = insert_Recursive(root.left, key); 
        else if (key > root.key)
            root.right = insert_Recursive(root.right, key); 
         
        return root; 
    } 
 

    void inorder() { 
        inorder_Recursive(root); 
    } 
   
  
    void inorder_Recursive(Node root) { 
        if (root != null) { 
            inorder_Recursive(root.left); 
            System.out.print(root.key + " "); 
            inorder_Recursive(root.right); 
        } 
    } 
     
    boolean search(int key)  { 
        root = search_Recursive(root, key); 
        if (root!= null)
            return true;
        else
            return false;
    } 
   
   
    Node search_Recursive(Node root, int key)  { 
      
        if (root==null || root.key==key) 
            return root; 
     
        if (root.key > key) 
            return search_Recursive(root.left, key); 
       
        return search_Recursive(root.right, key); 
    } 
}
class Main{
    public static void main(String[] args)  { 
      BST_class bst = new BST_class(); 
        bst.insert(60); 
        bst.insert(50); 
        bst.insert(40); 
        bst.insert(30); 
        bst.insert(20); 
        bst.insert(10); 
        bst.inorder(); 
        
        System.out.println("\n The output after Delete 60"); 
        bst.deleteKey(50); 
        bst.inorder(); 
       
        System.out.println("\n The output after Delete 40"); 
        bst.deleteKey(30); 
        bst.inorder(); 
        
        System.out.println("\n The output after Delete 20"); 
        bst.deleteKey(10); 
        bst.inorder(); 
     } 
}

