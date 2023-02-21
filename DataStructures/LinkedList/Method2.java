import java.io.*;
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

    Node tail;
    LinkedList(){
        head=null;
        tail=null;
    }

    public static LinkedList insert(LinkedList list,int data){
        Node newNode=new Node(data);
        if(list.head==null){
            list.head=newNode;
            
            list.tail=newNode;
        }
        tail.next=newNode;
        tail=tail.next;
        return list;
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

        insert(list,10);
        insert(list,20);
        insert(list,30);
        insert(list,40);

        PrintList(list);
    }
}