package atividade;

import javax.swing.JOptionPane;

public class FilaDinamica {
    private Livro head;
    private Livro tail;
    
    public FilaDinamica(){
        head = null;
        tail = null;
    }
    
    public void enqueueNome (String x){
        Livro novo = new Livro();
        novo.setNome(x);
        novo.setProx(null);
        if(tail == null){
            head = novo;
            tail = novo;
        }else{
            tail.setProx(novo);
            tail = novo;
        }
    }
    
        public void enqueueAutor (String x){
        Livro novo = new Livro();
        novo.setAutor(x);
        novo.setProx(null);
        if(tail == null){
            head = novo;
            tail = novo;
        }else{
            tail.setProx(novo);
            tail = novo;
        }
    }
        
        public void enqueueCategoria (String x){
        Livro novo = new Livro();
        novo.setCategoria(x);        
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
            resp = head.getNome();
            resp = head.getAutor();
            resp = head.getCategoria();
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
            Livro aux;
            aux = head;
            while(aux.getProx() !=null){
                System.out.println(aux.getNome().toString()+" ");
                System.out.println(aux.getAutor().toString()+" ");
                System.out.println(aux.getCategoria().toString()+" ");
                aux = aux.getProx();
            }
            System.out.println(aux.getNome().toString()+ "\n");
            System.out.println(aux.getAutor().toString()+ "\n");
            System.out.println(aux.getCategoria().toString()+ "\n");
        }else{
            System.out.println("Fila vazia");
        }
    }
}
