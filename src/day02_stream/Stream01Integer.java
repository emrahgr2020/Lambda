package day02_stream;

import java.util.ArrayList;
import java.util.List;

public class Stream01Integer {
    public static void main(String[] args) {

        List<Integer> rakamlar = new ArrayList<>();
        rakamlar.add(5);
        rakamlar.add(7);
        rakamlar.add(9);
        rakamlar.add(-1);
        rakamlar.add(2);
        rakamlar.add(4);
        rakamlar.add(6);
        rakamlar.add(-100);
        rakamlar.add(4);
        rakamlar.add(8);
        rakamlar.add(9);

        rakamlar.stream().filter(t-> t%2 !=0 ).forEach(System.out::println);
        System.out.println("=================================");
        rakamlar.stream().filter(t-> t%2 ==0 ).forEach(x-> System.out.println(x));
        System.out.println("=================================");
        rakamlar.stream().filter(t-> t%2!=0 ).forEach(Stream01Integer::yazdir);
    }
    public static void yazdir(int x){
        System.out.println(x+" ");
    }
}
