package aula04;

public class Circulo {

   private double raio;
   
   public Circulo(double r) {
      setRaio(r);
   }
   
   public void setRaio(double r){
      if (r < 0)
         System.out.println("O raio nao pode ser negativo.");
      else
         raio = r;
   }
   
   public double getRaio(){
      return raio;
   }

   public void exibeDados(){
      System.out.println("Raio: " + getRaio());
   }
}