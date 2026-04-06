package AnimalesInterfaz;

public class MainAnimal {
     public static void main(String[] args) {
          Gato gato = new Gato();
          gato.dormir();
          gato.HacerSonidos();
          
          Perro perro = new Perro();
          perro.dormir();
          perro.HacerSonidos();
     }
}
