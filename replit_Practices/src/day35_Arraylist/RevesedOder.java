package day35_Arraylist;

import java.util.ArrayList;

public class RevesedOder {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(2,99);
        list.add(20);
        list.add(20);

        for (int i =list.size()-1; i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }


    }
}
