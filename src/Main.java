public class Main {
    public static void main(String[] args) {
        int []a={1,3,4,5};

        System.out.println(repsEqual(a,1345));
    }
    static int  repsEqual(int[ ] a, int n){
 int i,j,sum=0,repsEqual=0;
 for (i=a.length-1,j=0;i>=0;i--){
     sum+=Math.pow(10,j++)*a[i];
 }
 if (sum==n)repsEqual=1;
return repsEqual;
    }

}