package org.example.cses;

import java.io.*;
import java.util.StringTokenizer;
/*
        A permutation of integers 1,2,…,n
        is called beautiful if there are no adjacent elements whose difference is 1.
        Given n , construct a beautiful permutation if such a permutation exists.

        Output
        Print a beautiful permutation of integers 1,2,…,n.
        If there are several solutions, you may print any of them. If there are no solutions, print "NO SOLUTION".

        Constraints
        1≤n≤106
*/
public class Permutations {
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }

    }
    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }
        public void print(Object object) throws IOException {
            bw.append("" + object);
        }
        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }
        public void close() throws IOException {
            bw.close();
        }
    }

    public static void main(String[] args) throws IOException {
        FastWriter out  = new FastWriter();
        FastReader in = new FastReader();
        int n=in.nextInt();


        out.close();
    }
}
