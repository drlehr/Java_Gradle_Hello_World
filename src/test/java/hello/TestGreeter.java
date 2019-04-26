package hello;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestGreeter {

   private Greeter g = new Greeter();

   @Test
   @DisplayName("Test for Empty Name")
   public void testGreeterEmpty()

   {
      assertEquals(g.getName(),"");
      assertEquals(g.sayHello(),"Hello!");
   }



   @Test
   @DisplayName("Test for Name='World'")
   public void testGreeter()
   {

      g.setName("Worldss");
      assertEquals(g.getName(),"Worldss");
      assertEquals(g.sayHello(),"Hello Worldss!");
   }

   @Test
   @DisplayName("Test for Name='Worldsss'")
   public void testGreeters()
   {

      g.setName("Worldsss");
      assertEquals(g.getName(),"Worldsss");
      assertEquals(g.sayHello(),"Hello Worldsss!");
   }
   
}
