package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class TestNG {

   @Test
   public void dpointTest() {
      Point a = new Point(3,5);
      Point b = new Point(4, 10);
      Assert.assertEquals(a.distance(b), 5.0990195135927845);
   }
}
