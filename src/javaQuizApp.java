import com.javaSolutions.DistinctPairs.DistinctPairs;
import com.javaSolutions.LinkedList.LinkList;

/**
 * Created by prasad on 2/20/2017.
 */
public class javaQuizApp {

    public static void main(String args[]){

        DistinctPairs distPairs = new DistinctPairs();

        int[] arrayInput = {6, 6, 3, 9, 3, 5, 1};
        int k = 12;
        System.out.println("Solution for the Distinct Pairs Problem::");
        System.out.println("total Number of distinct Pairs are:: "+distPairs.checkNumOfpairs(arrayInput, k)+"\n");
        System.out.println("*******************************************************************");

        System.out.println("Solution for the Reversed LinkedList Problem::");
        LinkList ll = new LinkList();

        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(10);
        ll.addFirst(15);

        System.out.println("Original Linked List::");
        ll.printLinkList(ll.first);
        System.out.println("\nLinklist after reversal::");
        ll.printLinkList(ll.reverseLinkList(ll.first));
    }
}
