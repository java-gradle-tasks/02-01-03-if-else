import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGrade06 {

      @Test
      public void test() {
         boolean expected=false;
         int grade=6;
         boolean actual=MyGrade.isGrade(grade);

         Assertions.assertEquals(expected,actual,grade+" eseten nem jol hatarozza meg, hogy jegy-e!");
      }
   }
