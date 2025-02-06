public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int index = 2;
        if(index >= 0 && index < arr.length){
            System.out.println(arr[index]); // Accessing a valid element
        } else {
            System.out.println("Index out of bounds");
        }
    }
}