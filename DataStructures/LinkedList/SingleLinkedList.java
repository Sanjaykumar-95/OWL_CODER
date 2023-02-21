import java.io.*;
class LinkedList{

    //Creating Node
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public static LinkedList insert(LinkedList list,int data){
        //Create a new node
        Node newNode=new Node(data);
        
        if(list.head==null){
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

    public static void Size(LinkedList list){
        Node cn=list.head;
        int n=0;
        while(cn!=null){
            cn=cn.next;
            n++;
        }
        System.out.print(n);
    }

    public static void PrintList(LinkedList list){
        Node cn=list.head;
        while(cn!=null){
            System.out.print(cn.data+" ");
            cn=cn.next;
        }
    }

    public static void main(String args[]){
        LinkedList list=new LinkedList();

        list=insert(list,10);
        list=insert(list,20);
        list=insert(list,30);
        list=insert(list,40);

        PrintList(list);

        Size(list);
    }
}