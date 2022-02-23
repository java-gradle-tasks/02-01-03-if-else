import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGrade03 {

      @Test
      public void test() {
         boolean expected=true;
         int grade=3;
         boolean actual=MyGrade.isGrade(grade);

         Assertions.assertEquals(expected,actual,grade+" eseten nem jol hatarozza meg, hogy jegy-e!");
      }
   }
