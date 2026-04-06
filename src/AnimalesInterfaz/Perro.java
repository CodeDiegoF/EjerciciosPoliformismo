package AnimalesInterfaz;

public class Perro implements Animal {
     @Override
     public void HacerSonidos() {
          System.out.println("Wof wof");
     }
     
     @Override
     public void dormir() {
          System.out.println("zzzzzz...");
     }
}
