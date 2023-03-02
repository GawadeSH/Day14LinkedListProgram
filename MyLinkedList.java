package linkedlist;

class MyNode<K>
{
    private K key;
    private MyNode next;

    MyNode(K key)
    {
        this.key = key;
        this.next = null;
    }
    void disp()
    {
        System.out.println(key);
    }

    public void setNext(MyNode next)
    {
        this.next = next;
    }

    public MyNode getNext()
    {
        return next;
    }
}
public class MyLinkedList
{
    public static void main(String[] args)
    {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondtNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        myFirstNode.disp();
        mySecondtNode.disp();
        myThirdNode.disp();
        myFirstNode.setNext(mySecondtNode);
        mySecondtNode.setNext(myThirdNode);

        boolean result = myFirstNode.getNext().equals(mySecondtNode) &&
                mySecondtNode.getNext().equals(myThirdNode);
        System.out.println(result);
    }
}

