//Given a binary tree, return the inorder traversal of its nodes' values.
//O(n) to go through whole tree and update list 

    public void inorderTraversalHelper(TreeNode root, List<Integer> result) 
    {
        if (root == null) { return; }
        inorderTraversalHelper(root.left, result);
        result.add(root.val); 
        inorderTraversalHelper(root.right, result);
    }
    
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        List<Integer> result = new ArrayList<Integer>();
        inorderTraversalHelper(root, result); 
        return result; 
    }
