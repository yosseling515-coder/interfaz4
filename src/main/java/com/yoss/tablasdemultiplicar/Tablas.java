package com.yoss.tablasdemultiplicar;

public class Tablas {
  int a;  
  
  public Tablas(){
      
  }
  
   public Tablas(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    public String CalcularTabla(){
       String res = "";
       
       for(int i = 1; i<=12; i++){
           res += a + " x " + i + " = " + (a * i) + "\n";
       }
       return res;
    }

    @Override
    public String toString() {
        return "Tablas{" + "a=" + a + '}';
    }
    
}
