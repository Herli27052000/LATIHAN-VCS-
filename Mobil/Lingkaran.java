public class Lingkaran {
  public int jari2;
  public double phi,luas;
      //konstruktor
     Lingkaran(){
          phi = 3.14;
          
}
      void setjari2(int jari2){
          this.jari2 = jari2;
      }
      int getjari2(){
          return this.jari2;
      }
      double HitungLuas(){
          this.luas = phi * getjari2() * getjari2();
          return this.luas;
      }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
      Lingkaran Ling_1 = new Lingkaran();
      Ling_1.setjari2(50);
      
      System.out.println("Nama        : Herliyansyah");
      System.out.println("NIM         : 312010387");
      System.out.println("Jari-jari   :"+Ling_1.getjari2());
      System.out.println("Luas        :"+Ling_1.HitungLuas());
  }
  
}
