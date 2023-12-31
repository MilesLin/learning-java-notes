import java.util.List;

public interface TreeNode<T extends Comparable<T>> {
    T getValue();
    TreeNode<T> leftNode();

    TreeNode<T> rightNode();
}
