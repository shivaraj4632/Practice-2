class Shape{
    void draw(){
        System.out.println("Drawing shape");
    }
    void erase(){
        System.out.println("Erasing shape");
    }
}

class circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a circle");
    }

    void erase(){
        System.out.println("Erasing a circle");
    }
}
class triangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a tringle");
    }

    void erase(){
        System.out.println("Erasing a triangle");
    }
}

class square extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a square");
    }
    void erase(){
        System.out.println("Erasing a square ");
    }
    public static void main(String[] args){
        Shape s;

        s = new circle();
        s.draw();
        s.erase();

        s = new triangle();
        s.draw();
        s.erase();

        s = new square();
        s.draw();
        s.erase();
    }
}
