package dk.cphbusiness.util;

public class Program {


  public static Path<String> reverse(Path<String> list) {
    return reverse(list, null);
    }
  
  private static Path<String> reverse(Path<String> rest, Path<String> reversed) {
    if (rest == null) return reversed;
    return reverse(rest.getRest(), new LinkedPath(rest.getFirst(), reversed));
    }
  
  public static void main(String[] args) {
    Path<String> list = new LinkedPath("Anders", "Bente", "Christine", "Dorte", "Erik");
    
    Path<String> reversed = reverse(list);

    for (Path<String> p = reversed; p != null; p = p.getRest()) {
      System.out.println(p.getFirst());
      }
    
    }


  }
