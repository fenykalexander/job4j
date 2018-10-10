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
public  void whenTakeNameThenTreeEchoPlusName() {

String input = "Fenyk Alexandar";
String expect = "Echo, echo, echo : Fenyk Alexandar";
Calculate calculate = new Calculate();
String result = calculate.echo(input);
assertThat(result, is(expect));
}

}

