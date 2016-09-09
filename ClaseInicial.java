package mx.unam.fi.poo.paq01;

public class ClaseInicial
{
 public int a = 10;
 protected int b = 20;
 int c = 30;
 private int d= 40;
 
 public void metodoPublic()
 {
  System.out.println("En el metodo public");
 }
 
 protected void metodoProtected()
 {
  System.out.println("En el metodo protected");
 }
 
 void metodo()
 {
  System.out.println("En el metodo sin modificador");
 }
 
 private void metodoPrivate()
 {
  System.out.println("En el metodo private");
 }
 
 public static void main(String arg[])
 {
  ClaseInicial referencia = new ClaseInicial();
  System.out.println("a = " + referencia.a);
  referencia.metodoPublic();
  System.out.println("b = " + referencia.b);
  referencia.metodoProtected();
  System.out.println("c = " + referencia.c);
  referencia.metodo();
  System.out.println("d = " + referencia.d);
  referencia.metodoPrivate();
 }
}
