import java.util.*;

class Computer {
    int hdisk, RAM;
    float freq;
    String make;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        hdisk = sc.nextInt();
        RAM = sc.nextInt();
        freq = sc.nextFloat();
        make = sc.next();
    }

    void display() {
        System.out.println(hdisk);
        System.out.println(RAM);
        System.out.println(freq);
        System.out.println(make);
    }
}

class MainC {
    public static void main(String[] args) {
        
    }
}
