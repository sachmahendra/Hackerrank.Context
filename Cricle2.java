
    class Circle{
        public double radius;
        public double area(){
            return Math.PI *radius*radius;
        } 
        public double perimeter(){
            return Math.PI * 2*radius;
        }
        public double circumference(){
            return perimeter();
        }
    }

    public class Cricle2 {
    public static void main(String[] args) {
        Circle c= new Circle();
        c.radius = 10;
        System.out.println(c.area());
        System.out.println(c.perimeter());
        System.out.println(c.circumference());

    }
}
