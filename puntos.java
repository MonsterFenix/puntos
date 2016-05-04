package pilas;

import java.util.Stack;


public class Pilas {

    
    public static void main(String[] args) {
        
        Stack pila=new Stack();
        
        //pila.push("primer elemento");
        pila.push(7);
        pila.push(5.4);
        pila.push(999999L);//dato tipo long
        pila.push('#');
        pila.push(6.3F);//dato tipo float
    
        System.out.println(pila.size());
        System.out.println(pila);
        System.out.println("cima: "+ pila.peek());
        System.out.println("buscar elemento: "+ pila.search('#'));//busca si esta el elemento literal no por posicion
        System.out.println("quitar ultimo elemento:"+pila.pop());
        System.out.println(pila.size());
        System.out.println("la pila esta vacia? : "+pila.empty());
        
        System.out.println("exercise 1");
        
        Stack juegos=new Stack();
        juegos.push("Gran Turismo 6");
        juegos.push("GTA V");
        juegos.push("Battlefield 4");
        juegos.push("PES 20xx");
        juegos.push("Tekken");
        
        System.out.println(juegos.size());
        System.out.println(juegos);
        System.out.println("cima: "+ juegos.peek());
        System.out.println("buscar elemento: "+ juegos.search("GTA V"));
        System.out.println("quitar ultimo elemento:"+juegos.pop());
        System.out.println(juegos.size());
        System.out.println("la pila esta vacia? : "+juegos.empty());
        
        System.out.println("exercise 2");
       Stack notas=new Stack();
        notas.push(5.5);
        notas.push(6.5);
        notas.push(4.5);
        notas.push(3.5);
        notas.push(7.0);
        int i;
        for( i=0;i<notas.size();i++){
            System.out.println(notas.get(i));
        }
        
            
        
        System.out.println("exercise 3");
        Stack notax=new Stack();
        notax.push(5.5);
        notax.push(6.5);
        notax.push(4.5);
        notax.push(3.5);
        notax.push(7.0);
        for(  Object j:notax){
            System.out.println(j);
        }
    
        
    
            
        System.out.println("exercise 4");
        
        Stack libros=new Stack();
        libros.push("La lista de Schindler");
        libros.push("La guerra del Pacifico: de Pearl Harbor a Guadalcanal ");
        libros.push("La guerra de los mundos");
        while(!libros.empty()){
            System.out.println(libros.pop());
        }
        
}
}
