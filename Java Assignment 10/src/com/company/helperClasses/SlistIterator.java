package com.company.helperClasses;

public class SlistIterator<T> {
    Node<T> head;
    public SlistIterator(Node<T> head){
        this.head=head;
    }
    public void insert(T data){
        Node<T> temp=head;
        Node<T> newNode=new Node<>(data);
        System.out.println("Inserting "+data);
        if(temp.value==null){
            head=newNode;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void remove(){
        // if list is empty
        if(head==null){
            System.out.println("The list is empty, we cannot remove elements");
            return;
        }
        System.out.println("Removing ...");
        // if list has only one element
        if(head.next==null){
            head=null;
            return;
        }
        Node<T> temp=head.next;
        Node<T> prev=head;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
    }
    public Node<T> getHead(){
        return head;
    }
}
