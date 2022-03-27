public class Task01 {
    public static void main(String[]args){
        int array[] = new int[10];
        for (int i = 0; i < array.length ; i++) {
            // Adding the values to the loop
            array[i]=i;
        }
        for (int result:
             array) {
            // printing the result
            System.out.println(result);
        }
    }
}
