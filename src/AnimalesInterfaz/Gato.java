package AnimalesInterfaz;

public class Gato implements Animal{
     
     @Override
     public void HacerSonidos() {
          System.out.println("Miau");
     }
     
     @Override
     public void dormir() {
          System.out.println("zzzzzz...");
     }
}
