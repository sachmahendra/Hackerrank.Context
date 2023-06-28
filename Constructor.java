class Ractangle{
   private double length ;
   private double breadth ;
    public Ractangle(){
        double length = 1;
        double breadth= 1;
    }

    public Ractangle(double l, double b){
        length=l;
        breadth=b;

    }

    public double area(){
        return length* breadth;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Ractangle r= new Ractangle(1,1);
        System.out.println(r.area());
    }
}
