import java.util.LinkedList;
 
public class Demo {
   public static void main(String[] args) {
      LinkedList lList = new LinkedList();
      lList.add("1");
      lList.add("2");
      lList.add("3");
      lList.add("4");
      lList.add("5");
      System.out.println("LinkedList is : ");
      for(int i = 0; i< lList.size(); i++) { 
         System.out.println(lList.get(i));
      } 
   }
}
