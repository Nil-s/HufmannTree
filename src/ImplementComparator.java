
import java.util.Comparator;


public class ImplementComparator implements Comparator<Node> {
	public int compare(Node x, Node y)
    {
 
        return x.data - y.data;
    }
}