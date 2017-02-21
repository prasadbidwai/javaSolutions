package com.javaSolutions.LinkedList;

/**
 * Created by prasad on 2/20/2017.
 */
public class LinkList {
    public Link first;

    public LinkList(){
        first = null;
    }

    public void addFirst(int data){
            Link newLink = new Link(data);
            newLink.next = first;
            first = newLink;
    }
    public void printLinkList(Link node)
    {
        Link current = node;
        while (current!=null)
        {
            System.out.print(current.idata+" ");
            current = current.next;
        }
    }

    public Link reverseLinkList(Link node){
        Link current = first;
        Link previous = null;
        Link next = null;

        while (current != null){
            next= current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        node = previous;
        return node;
    }
}
