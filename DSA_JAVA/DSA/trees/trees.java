package trees;

public class trees {
    
}
class TreeNode <T extends Comparable<T>> 
{
    T data;
    TreeNode<T> left, right;
    TreeNode(T o)
    {
        this.data = o;
        this.left = null;
        this.right = null;
    }
    TreeNode()
    {
        this.data = null;
        this.left = null;
        this.right = null;
    }
    public void insert(T element)
    {
        if(element.compareTo(element) < 0 )
        {
            if(right == null)
            {
                right = new TreeNode(element);
            }
            else
            {
                right.insert(element);
            }
        }
        if(element.compareTo(element) > 0 )
        {
            if(left == null)
            {
                left = new TreeNode(element);
            }
            else
            {
                left.insert(element);
            }
        }
    }
}