package dk.cphbusiness.util;

public class Program {

  public static void main(String[] args) {
    Path<String> list = new LinkedPath("Anders", "Bente", "Christine", "Dorte", "Erik");
    while (list != null) {
      System.out.println(list.getFirst());
      list = list.getRest();
      }
    
    }


  }
