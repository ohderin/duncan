package duncan;
import java.util.Scanner;

public class triangleMan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the x-coordinate and y-coordinate of the first vertex -> ");
        double v0 = scan.nextDouble();  //x1
        double v1 = scan.nextDouble();  //y1
        System.out.print("Enter the x-coordinate and y-coordinate of the second vertex -> ");
        double v2 = scan.nextDouble();  //x2
        double v3 = scan.nextDouble();  //y2
        System.out.print("Enter the x-coordinate and y-coordinate of the third vertex -> ");
        double v4 = scan.nextDouble();  //x3
        double v5 = scan.nextDouble();  //y3
        System.out.printf("Triangle: p1 = (%.3f, %.3f); p2 = (%.3f, %.3f); p3 = (%.3f, %.3f)%n", v0, v1, v2, v3, v4, v5);

        //collinear
        double result = (v3-v1)/(v2-v0), result2 = (v5-v3)/(v4-v2);
        
        boolean isCollinear = false;
        if (result == result2) isCollinear = true; 

        while (isCollinear = true) {
        double length = Math.sqrt(Math.pow(v2 - v0, 2) + Math.pow(v3 - v1, 2));
        double length2 = Math.sqrt(Math.pow(v4 - v2, 2) + Math.pow(v5 - v3, 2));
        double length3 = Math.sqrt(Math.pow(v4 - v0, 2) + Math.pow(v5 - v1, 2));
        System.out.printf("\nSide A = %f; side B = %.3f; side C = %.3f", length, length2, length3);
        double perim = Math.abs(length + length2 + length3);
        double semiPerim = perim / 2;
        double area = Math.sqrt(semiPerim * (semiPerim - length) * (semiPerim - length2) * (semiPerim - length3));
        double c1 = (v0 + v2 + v4) / 3, c2 = (v1 + v3 + v5) / 3;
        System.out.printf("\nPerimeter = %.3f", perim);
        System.out.printf("\nArea = %.3f", area);
        System.out.printf("\nCentroid = (%.3f, %.3f)", c1, c2);
        

        double max, middle, min;
        if (length <= length2)
            if (length <= length3) {  
                min = length;
                if (length2 <= length3) { max = length3; middle = length2; }
                else  max = length2; middle = length3; 
            }
            else { max = length2; middle = length; min = length3; }
        else if (length2 <= length3) {  
                min = length2; 
                if (length <= length3) { max = length3; middle = length; }
                else max = length; middle = length3;
        }
         else  max = length; middle = length2; min = length3; 
        length = min; length2 = middle; length3 = max;
        System.out.printf("\nAfter sorting: Side A = %.3f; side B = %.3f; side C = %.3f;", length, length2, length3);

        String triangleType; 
        if (length == length2)
            if (length == length3) triangleType = "equilateral";
            else triangleType = "isosceles";
        else if (length2 == length3) triangleType = "isosceles";
             else triangleType = "scalene";
        System.out.println("The triangle is " + triangleType);
        }
    }
    
}