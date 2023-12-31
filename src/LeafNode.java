public class LeafNode<T extends Comparable<T>> implements TreeNode<T> {

    private TreeNode<T> n = new LeafNode<>();
    @Override
    public T getValue() {
        return (T)n;
    }

    @Override
    public TreeNode<T> leftNode() {
        return null;
    }

    @Override
    public TreeNode<T> rightNode() {
        return n;
    }
}
