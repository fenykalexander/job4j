package ru.job4j.calculate;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

 /**
 * Test
 * CalculateTest.
 *  @author Fenyk Alexander(aleksandar.fenyuk@yandex.ru)
 * @since 21/092018
 */
public class CalculateTest {
     /**
      * Test.
      */
     @Test
     public void whenTakeNameThenTreeEchoPlusName() {

         String input = "Fenyk Alexandar";
         String expect = "Echo, echo, echo : Fenyk Alexandar";
         Calculate calculate = new Calculate();
         String result = calculate.echo(input);
         assertThat(result, is(expect));
     }

     @Test
     public void whenAddOnePlusOneThenTwo() {
         Calculate calc = new Calculate();
         calc.add(1D, 1D);
         double result = calc.result();
         double expected = 2D;
         assertThat(result, is(expected));
     }

     @Test
     public void whenDivOne2On1Then2() {
         Calculate calc = new Calculate();
         calc.add(1D, 1D);
         double result = calc.getResultTwo();
         double expected = 2D;
         assertThat(result, is(expected));
     }

     @Test
     public void whenSubstractOneFromThen() {
         Calculate calc = new Calculate();
         calc.add(1D, 1D);
         double result = calc.getResultTree();
         double expected = 2D;
         assertThat(result, is(expected));
     }

     @Test
     public void whenMultipleOneToSecond() {
         Calculate calc = new Calculate();
         calc.add(1D, 1D);
         double result = calc.getResultFour();
         double expected = 2D;
         assertThat(result, is(expected));
     }
 }