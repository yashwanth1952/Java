package com.company.helperClasses;

public class Slist<T>{
    public Node<T> head;
    SlistIterator<T> tempHead;
    public Slist(){
        this.head=new Node<>();
    }
    public Slist(T data) {
        this.head = new Node(data);
    }
    public SlistIterator<T> getIterator(){
        tempHead=new SlistIterator(head);
        return tempHead;
    }
    public void tostring(){
        this.head= tempHead.getHead();
        if(this.head.value==null){
            System.out.println("The list is empty");
            return;
        }
        Node<T> temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println();
    }

}
