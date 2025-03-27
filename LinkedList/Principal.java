package LinkedList;
public class Principal {
    public static void main(String[] args) {
        System.out.println("Running");

        LinkedList<Node<Integer>> ll = new LinkedList<>(); 
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(15);
        Node<Integer> n3 = new Node<>(9);
        Node<Integer> n4 = new Node<>(10);

        ll.add(n1);
        ll.add(n2);
        ll.add(n3);
        ll.add(n4);

        System.out.println(ll.toString());
    }
    
}
