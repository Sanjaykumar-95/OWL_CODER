import java.util.*;
class LinkedList{
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    public static LinkedList list(LinkedList list,int data){
        Node newNode=new Node(data);

        if(list.head!=null){
            list.head=newNode;
        }

        else{
            Node last=list.head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=newNode;
        }
        return list;
    }

    public static void PrintList(LinkedList list){
        Node currentNode=list.head;
        while(currentNode!=null){
            System.out.print(currentNode.data+" ");
            currentNode=currentNode.next;
        }
    }

    public static void main(String args[]){
        LinkedList list=new LinkedList();

        //Inserting at ending point
        list=list.insert(1);
        list=list.insert(2);
        list=list.insert(3);
        list=list.insert(5);
        list=list.insert(6);

        //Printing List
        PrintList(list);

        //inserting at starting point
        
    }
}