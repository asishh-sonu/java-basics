public class Arrayexamples{
    void sumofArray(){
        int arr[] = {1,5,3,7,80};
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        Arrayexamples obj = new Arrayexamples();
        obj.sumofArray();
    }
}