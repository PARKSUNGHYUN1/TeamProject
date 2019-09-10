package base;
import myInterface.Shape;
/**
 * Write a description of class Circle here.
 *
 * @author (2018315040 김선민, 2018315034 정철우, 2018315031 박성현)
 * @version (2019/09/10)
 */
public class Circle implements Shape
{
    int x;
    int y;
    int radius;
    public void Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public double getArea(){
        return PI * radius * radius;
    }
    public void draw(){
        System.out.println("반지름이"+ radius + "인 원입니다.");
    }
    
}
