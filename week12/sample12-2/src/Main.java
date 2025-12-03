public class Main {
    public static void main(String[] args) {
        int temp;
        float result;

        temp = Input.readData();   // call by name

        result = Compute.convert(temp);   // call by value

        Output.dsiplay(temp, result);   // call by value
    }
}