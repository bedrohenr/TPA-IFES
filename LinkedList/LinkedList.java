package LinkedList;

public class LinkedList<T> {
    private Node<T> first, last;
    private int size;
    private final boolean sorted;

    public LinkedList(){
        this.sorted = false;
        this.first = this.last = null;
        this.size = 0;
    }

    public void add(T elem){
        Node<T> newE = new Node<>(elem);

        if(this.first == null){
            this.first = newE;
            this.last = newE;
            this.size++;
        } else {
            this.last.setNext(newE);
            this.last = newE;
            this.size++;
        }
    }

    public boolean search(T elem){
        Node<T> aux = this.first;
        while(aux != null){
            if(aux.getValue().equals(elem))
                return true;
        }
        return false;
    }

    public boolean delete(T elem){
        Node<T> aux = this.first;
        Node<T> before = null;

        while ( aux != null ){
            if(aux.getValue().equals(elem)){
                if( aux== this.first){
                    this.first = this.first.getNext();
                    if(aux == this.last)
                    this.last = null;
                } else {
                    before.setNext(aux.getNext());

                    if( aux == this.last )
                        this.last = before;
                }
                this.size--;
                return true;
            } 
            before = aux;
            aux = aux.getNext();
        }
        return false;
    }

    public String toString(){
        Node<T> aux = this.first;
        String s = "[";

        while( aux != null ){
            s += aux.getValue();
            
            if(aux != this.last)
                s += ",";
            
            aux = aux.getNext();
        }

        s += "]";

        return s;
    }

    public int getSize(){
        return this.size;
    }

}
