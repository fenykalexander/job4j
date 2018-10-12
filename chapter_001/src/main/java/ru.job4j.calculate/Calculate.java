
package ru.job4j.calculate;

/**
 * Calculate.
 *  @author Fenyk Alexander(aleksandar.fenyuk@yandex.ru)
 * @since 21/092018
 */
public class Calculate {
/**
 * Main.
 * @param args  - args.
 */
private double result;
public void add(double first,double second){
 this.result=first+second;
}

    public double result() {
        return this.result;
    }

public void div(double first,double second){
    this.result=first/second;
}
public double getResultTwo(){

    return this.result;
}

    public void subtract(double first,double second) {
        this.result = first-second;
    }
public double getResultTree(){
    return this.result;
}

public void multiple(double first,double second){
    this.result=first*second;
}
public double getResultFour(){
    return this.result;
}
    public  static void main(String[] args) {

System.out.println("Hello World");
}




/**
* Method echo.
* @param name Your name.
* @return Echo plus your name.
*/

public String  echo(String name) {

return ("Echo, echo, echo : " + name);

}

}






