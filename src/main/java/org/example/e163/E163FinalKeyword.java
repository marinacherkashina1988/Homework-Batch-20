package org.example.e163;

public class E163FinalKeyword {

    public static class StringManipulator{
        private String str;

        public StringManipulator(String str){
            this.str=str;
        }

        final String reverseString(){
            String reversed="";
            for (int i = str.length()-1; i >=0 ; i--) {
                reversed+=str.charAt(i);
            }
            return reversed;
        }
    }

    public static class ArrayManipulator {
        double sum = 0;
        double average = 0;

        int [] array = {3, 4, 5, 6, 6};
        final double avgElements(int [] numbers){
            for (int n:numbers){
                sum+=n;
                average=sum/ numbers.length;
            }
            return average;
        }
    }

    public static void main(String[] args){

        StringManipulator object1 = new StringManipulator("hello");
        ArrayManipulator object2 = new ArrayManipulator();

        System.out.println(object1.reverseString());
        System.out.println(object2.avgElements(object2.array));
    }
}
