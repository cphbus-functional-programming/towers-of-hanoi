package dk.cphbusiness.towersofhanoi;

public class Program {
  private static Tower a = new Tower(10);
  private static  Tower b = new Tower(0);
  private static  Tower c = new Tower(0);
  
  
  public static void print() throws InterruptedException {
    for (int height = 12; height >= 0; height--)
      System.out.println(a.text(height)+b.text(height)+c.text(height));
    Thread.sleep(500);
    }
  
  private static void move(int count, Tower source, Tower target, Tower intermediate) throws InterruptedException {
    if (count == 0) return;
    move(count - 1, source, intermediate, target);
    source.moveTo(target);
    print();
    move(count - 1, intermediate, target, source);
    }
  
  public static void main(String[] args) throws InterruptedException {
    print();
    move(10, a, c, b);
    }
  
  }
