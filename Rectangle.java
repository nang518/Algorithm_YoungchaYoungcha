/*
너비와 높이를 입력받아 사각형의 합을 출력하는 프로그램
너비와 높이 필드, 면적 값을 제공하는 getArea() 메소드를 가진
클래스를 만들어 활용
 */

import java.util.Scanner;

public class Rectangle
{
    int width;
    int height;

    public int getArea()
    {
        return width * height;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Rectangle rect = new Rectangle();

        System.out.print(">> ");

        rect.width = scanner.nextInt();
        rect.height = scanner.nextInt();

        System.out.println("사각형의 면적은 " +rect.getArea());

        scanner.close();
    }
}
