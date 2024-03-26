public class Instrumento_musical {
   private String nombre;
   private String tipo;
   private boolean afinado;
   private boolean sonando;
   private int volumen;
   private String tono;
   public Instrumento_musical(String nombre, String tipo){
      this.nombre = nombre;
      this.tipo = tipo;
      this.afinado = false;
      this.sonando = false;
      this.volumen = 50;
      this.tono = "C";
   }
   public void afinar(){
      this.afinado = true;
      System.out.println(this.nombre + " ha sido afinado");
   }
   public void tocar(){
      if (this.afinado) {
         this.sonando = true;
         System.out.println(this.nombre + " esta sonando");
      } else {
         System.out.println(this.nombre + " no puede sonar por que no esta afinado.");
      }
   }
   public void tocar(int duracion){
      if (this.afinado) {
         this.sonando = true;
         System.out.println(this.nombre + " está sonando durante " + duracion + " segundos.");
         try {
            Thread.sleep(duracion * 1000);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
         this.sonando = false;
         System.out.println(this.nombre + " ha dejado de sonar.");
      } else {
         System.out.println(this.nombre + " no puede sonar porque no está afinado.");
      }
   }
  
   public void detener(){
      this.sonando = false;
      System.out.println(this.nombre + " ha dejado de sonar");
   }
   public void cambiar_sonido(int new_volumen){
      this.volumen = new_volumen;
      System.out.println("El volumen de "+ this.nombre + " se ha cambiado a " + this.volumen);
   }
   public void cambiar_tono(String new_tono){
      this.tono = new_tono;
      System.out.println("El tono de "+this.nombre+" se ha cambiado a "+this.tono);
   }
   public void cambiar_sonido(int new_volumen, String new_tono){
      this.volumen = new_volumen;
      this.tono = new_tono;
      System.out.println("El volumen y tono de "+ this.nombre + " se han cambiado a " + this.volumen + " y " + this.tono + " respectivamente.");
   }  
   public void obtener_info(){
      System.out.println("---------------------------------\nINFORMACIÓN DEL INSTRUMENTO");
      System.out.println("Instrumento: "+this.nombre);
      System.out.println("Tipo: "+this.tipo);
      System.out.println("Sonando: "+this.sonando);
      System.out.println("Tono: "+this.tono);
      System.out.println("Volumen: "+this.volumen);
   }
   public static void main(String[] args) {
      Instrumento_musical bateria = new Instrumento_musical("Bateria", "Percusión");
      bateria.tocar();
      bateria.cambiar_sonido(60);
      bateria.obtener_info();
      System.out.println();

      Instrumento_musical zampoña = new Instrumento_musical("Zampoña", "Viento");
      zampoña.afinar();
      zampoña.tocar(5);
      zampoña.cambiar_sonido(20,"D#");
      zampoña.obtener_info();
   }
}
