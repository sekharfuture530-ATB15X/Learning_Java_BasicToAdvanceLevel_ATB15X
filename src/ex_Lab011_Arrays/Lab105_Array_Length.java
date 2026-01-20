package ex_Lab011_Arrays;

public class Lab105_Array_Length {

    public static void main(String[] args) {

        int[] marks = {1,2,3,4,5,6,7,8};

//        for(int i = 0; i <= marks.length-1; i++){
//            System.out.println(marks[i]);
//        }
        for(int mark:marks){
            System.out.println(mark);
        }

        System.out.println("================================");
        System.out.println(marks.length);
    }
}
