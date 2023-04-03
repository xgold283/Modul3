
package com.main.latihan2m4;
import java.util.LinkedList;
import java.util.Queue;

public class Latihan2m4 {

   public void queueExample() {
        Queue queue = new LinkedList();
        queue.add("Java");
        queue.add("Dotnet");
        queue.offer("PHP");
        queue.offer("HTML");

        System.out.println("remove : " + queue.remove());
        System.out.println("element : " + queue.element());
        System.out.println("poll : " + queue.poll());
        System.out.println("peek : " + queue.peek());
    }

public static void main(String[] args) {
        new Latihan2m4 ().queueExample();
    
    }
}
