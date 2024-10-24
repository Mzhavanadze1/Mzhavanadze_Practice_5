public class Task2 {
    public int findLargest(int a,int b, int c) {
        int maxnumber = a;
        if (b > a){
            maxnumber= b;
        } if (c > maxnumber){
            maxnumber = c;
        }
        return  maxnumber;

    }
}
