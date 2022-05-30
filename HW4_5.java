interface Shape
{
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw()
    {
        System.out.print("-- 다시 그립니다. ");
        draw();
    }
}

class Circle implements Shape
{
    private int r;

    Circle(int r)
    {
        this.r = r;
    }

    public void draw()
    {
        System.out.println("반지름이 " +r+"인 원입니다.");
    }

    public double getArea()
    {
        return PI * r * r;
    }
}

class Oval implements Shape
{
    private int width, height;

    Oval(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public void draw()
    {
        System.out.println(width+ "x" +height+ "에 내접하는 타원입니다.");
    }

    public double getArea() //타원의 면적 리턴
    {
        return PI * (width/2) * (height/2);
    }
}

class Rect implements Shape
{
    private int width, height;

    Rect(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public void draw()
    {
        System.out.println(width+ "x" +height+ "크기의 사각형입니다.");
    }

    public double getArea() //사각형의 면적 리턴
    {
        return width * height;
    }
}

public class HW4_5 {
    public static void main(String[] args)
    {
        Shape[] list = new Shape[3]; //Shape을 상속받은 클래스 객체의 래퍼런스 배열
        list[0] = new Circle(10); //반지름이 10인 원 객체
        list[1] = new Oval(20,30); //20x30 사각형에 내접하는 타원
        list[2] = new Rect(10,40); //10x40 크기의 사각형

        for(int i=0; i<list.length; i++)
            list[i].redraw();
        for(int i=0; i<list.length; i++)
            System.out.println("면적은 " +list[i].getArea());
    }
}
