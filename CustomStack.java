/**
 * Universidad del Valle de Guatemala
 * @author Angie Nadissa Vela López, 23764
 * @author Juan Marcos Cruz Melara, 23110 
 * @description clase que modela una pila o cola (Stack)
 * @date creación 19/01/2024 última modificación 23/01/2024
 */

import java.util.EmptyStackException;

public class CustomStack<T> { 
    private Node<T> lastNode;
    private Node<T> firstNode;

    
    /** 
     * @param value
     * inserta un valor nodo en la pila
     */
    public void push(T value){
        if(lastNode == null){
            lastNode = new Node<T> (value);
            firstNode = lastNode;
        }else{
            Node<T> current = new Node<T>(value);
            current.setNext(firstNode);
            firstNode = current;
        }
    }

    
    /** 
     * @return T
     * remueve un nodo y devuelve su valor en la pila
     */
    public T pop(){
        
        if(firstNode != null){
            T data = firstNode.getData();
            firstNode = firstNode.getNext();
            return data;
        }
        throw new EmptyStackException();
    }
}