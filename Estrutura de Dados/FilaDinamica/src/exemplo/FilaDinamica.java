package exemplo;

public class FilaDinamica {
    private Node head;
    private Node tail;
    
    public FilaDinamica(){
        head = null;
        tail = null;
    }
    
    public void enqueue (Object x){
        Node novo = new Node();
        novo.setDado(x);
        novo.setProx(null);
        if(tail == null){
            head = novo;
            tail = novo;
        }else{
            tail.setProx(novo);
            tail = novo;
        }
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public Object dequeue(){
        Object resp = null;
        if(!isEmpty()){
            resp = head.getDado();
            head = head.getProx();
            if(head == null){
                tail = null;
            }
        }else{
            System.out.println("Fila Vazia");                   
        }
        return resp;
    }
    
    public void print(){
        if(!isEmpty()){
            Node aux;
            aux = head;
            while(aux.getProx() !=null){
                System.out.println(aux.getDado().toString()+" ");
                aux = aux.getProx();
            }
            System.out.println(aux.getDado().toString()+ "\n");           
        }else{
            System.out.println("Fila vazia");
        }
    }
}
