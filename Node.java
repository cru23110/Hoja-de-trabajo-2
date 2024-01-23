/**
 * Universidad del Valle de Guatemala
 * @author Angie Nadissa Vela López, 23764
 * @author Juan Marcos Cruz Melara, 23110 
 * @description clase que modela un nodo, componente principal de la clase Stack, almacena un dato de cualquier
 * tipo y el nodo siguiente 
 * @date creación 19/01/2024 última modificación 23/01/2024
 */

public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    
    /** 
     * @return T
     */
    public T getData() {
        return data;
    }

    
    /** 
     * @return Node<T>
     */
    public Node<T> getNext() {
        return next;
    }

    
    /** 
     * @param newData
     */
    public void setData(T newData){
        data = newData;
    }

    
    /** 
     * @param next
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }
}

