public class JavaApplication1 {
    public static void main(String[] args) {

  circle obj=new circle();
  circle obj1=new circle(1.0);
  obj.getarea();
    }
}
class circle
{
double radius=1.0;
String colour="red";

 circle(double radius){
 System.out.println("radius :"+radius);
 }
 circle(){
    System.out.println("string" +colour);  
 }
 void getarea(){
 double area;
 area=3.14*radius*radius;
 System.out.println("your area:"+area);
 }
    
 }
 