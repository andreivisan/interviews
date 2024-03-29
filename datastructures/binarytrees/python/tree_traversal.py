from typing import List


class TreeNode:
    def __init__(self, val, left, right) -> None:
        self.val = val
        self.left = left
        self.right = right
        
class TreeTraversal:
    
    def pre_order_iterative(self, root: TreeNode) -> None:
        if root is None:
            return
        
        stack = []
        stack.append(root)
        
        while stack:
            current = stack.pop()
            print(f'{current.val}', end =", ")
            
            if current.right:
                stack.append(current.right)
            
            if current.left:
                stack.append(current.left)
                
            
    def pre_order_recursive(self, root: TreeNode) -> None:
        if root is None:
            return
        
        print(f'{root.val}', end =", ")
        self.pre_order_recursive(root.left)
        self.pre_order_recursive(root.right)
        

    def in_order_iterative(self, root:TreeNode) -> None:
        if root is None:
            return
        
        stack = []
        current = root
        
        while stack or current:
            while current:
                stack.append(current)
                current = current.left
                
            current = stack.pop()
            print(f'{current.val}', end =", ")
            current = current.right
            
    
    def in_order_recursive(self, root: TreeNode) -> None:
        if root is None:
            return
        
        self.in_order_recursive(root.left)
        print(f'{root.val}', end =", ")
        self.in_order_recursive(root.right)
    
    
    def post_order_iterative(self, root: TreeNode) -> List[int]:
        values: List[int] = []
        if not root:
            return values    

        stack = []
        stack.append(root)
        
        while stack:
            current = stack.pop()
            values.insert(0, current.val)
            
            if current.left:
                stack.append(current.left)
                
            if current.right:
                stack.append(current.right)
            
        return values
    
    def post_order_recursive(self, root: TreeNode) -> None:
        if root is None:
            return
        
        self.post_order_recursive(root.left)
        self.post_order_recursive(root.right)
        print(f'{root.val}', end =", ")
                
                
def main():
    node10 = TreeNode(10, None, None)
    node30 = TreeNode(30, None, None)
    node50 = TreeNode(50, None, None)
    node70 = TreeNode(70, None, None)
    node20 = TreeNode(20, node10, node30)
    node60 = TreeNode(60, node50, node70)
    rootNode = TreeNode(40, node20, node60)
    
    tree_traversal = TreeTraversal()
    
    print('**** PRE-ORDER TRAVERSAL ****')
    tree_traversal.pre_order_iterative(rootNode)
    print('**** RECURSIVE ****')
    tree_traversal.pre_order_recursive(rootNode)
    
    print('\n\n')
    print('**** IN-ORDER TRAVERSAL ****')
    tree_traversal.in_order_iterative(rootNode)
    print('**** RECURSIVE ****')
    tree_traversal.in_order_recursive(rootNode)
    
    print('\n\n')
    print('**** POST-ORDER TRAVERSAL ****')
    print(tree_traversal.post_order_iterative(rootNode))
    print('**** RECURSIVE ****')
    tree_traversal.post_order_recursive(rootNode)
    
    
if __name__ == '__main__':
    main()