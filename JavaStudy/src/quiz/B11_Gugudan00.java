package quiz;

public class B11_Gugudan00 {

   public static void main(String[] args) {
      
      int dan = 2, gop = 1;
      
      while (dan <= 19) {
         System.out.printf("%d단: ", dan);
         gop = 1;
         while (gop <= 9) {
            System.out.printf("%dx%d=%-2d ", dan, gop, dan * gop);
            ++gop;
         }
         ++dan;
         System.out.println();
      }
      
      int line = 0;
       
      while (line < 10) {
         int dan1 = 2;
         while (dan1 <= 9) {
            if (line == 0) {
               System.out.printf("%d단\t", dan1);
            } else {
               System.out.printf("%dx%d=%d\t", dan1, line, dan1 * line);
            }
            ++dan1;
         }
         ++line;
         System.out.println();
      }

   }

}