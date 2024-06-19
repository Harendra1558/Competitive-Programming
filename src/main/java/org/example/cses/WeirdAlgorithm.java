package org.example.cses;


public class WeirdAlgorithm  extends FastReadWrite {
    public static void main(String[] args) {   // 1 <= n <10^6

        FastReader in=new FastReader();
        long n= in.nextLong();
        StringBuilder sb=new StringBuilder();
        while (n!= 1){
            sb.append(n).append(" ");
            if(n%2 ==0) {
                n=n/2;
            }
            else{
                n=(n*3)+1;
            }
        }
        System.out.print(sb);
    }
}
