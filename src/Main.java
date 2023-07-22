public class Main {
    public static void main(String[] args) {
        int []a={1,3,4,5};

        System.out.println(repsEqual(a,1345));
    }
    static int  repsEqual(int[ ] a, int n){
       int repsEqual=0;
       for (int lastIndex=a.length-1;lastIndex>=0;lastIndex--){
           int lastDigit=n%10;
           n/=10;
           if (a[lastIndex]==lastDigit){
               repsEqual=1;
           }
           else repsEqual=0;

       }
       return repsEqual;
    }

}