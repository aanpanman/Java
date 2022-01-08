import java.util.*;

class TriangleNotPossibleException extends Exception {
    TriangleNotPossibleException(){
        System.out.println("Triangle not possible with given points. Try again.");
    }
}

class Line {
    int x1, y1, x2, y2;
    Line() {}
    Line(int x1, int y1, int x2, int y2) throws NumberFormatException {
        this.x1 = x1; this.y1 = y1; this.x2 = x2; this.y2 = y2;
        if (x1==x2 && y1==y2)
        {
            throw new NumberFormatException();
        }
    }
}

class Triangle extends Line {
    Line one, two;
    Triangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) throws TriangleNotPossibleException{
        Line one = new Line(x1, y1, x2, y2);
        Line two = new Line(x3, y3, x4, y4);
        if ((x1!=x3 && y1!=y3) && (x1!=x4 && y1!=y4) && (x2!=x3 && y2!=y3) && (x2!=x3 && y2!=y3))
        {
            throw new TriangleNotPossibleException();
        }
    }
}

class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            try {
                System.out.println("Enter points(x1, y1, x2, y2, x3, y3, x4, y4): ");
                int a1 = sc.nextInt(); int a2 = sc.nextInt();
                int b1 = sc.nextInt(); int b2 = sc.nextInt();
                int c1 = sc.nextInt(); int c2 = sc.nextInt();
                int d1 = sc.nextInt(); int d2 = sc.nextInt();
                Triangle t = new Triangle(a1, a2, b1, b2, c1, c2, d1, d2);
                System.out.println("Triangle possible.");
                break;
            }
            catch (NumberFormatException ne) {
                System.out.println("Some of the points are same. Try again.");
                count++;
                continue;
            }
            catch (TriangleNotPossibleException te) {
                count++;
                continue;
            }
        }
        System.out.println("Number of attempts made: " + count);
    }
}
