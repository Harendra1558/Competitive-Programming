package org.example.cses;

import java.io.*;
import java.util.StringTokenizer;

public class Repetitions {

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
            bw.append("").append(String.valueOf(object));
        }
        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }
        public void close() throws IOException {
            bw.close();
        }
    }
    public static void main(String[] args) {
        try {
            FastReader in =new FastReader();
            FastWriter out=new FastWriter();
            String s=in.nextLine();
            int ans=1,temp=1;
            for (int i = 1; i < s.length(); i++) {
                if(s.charAt(i)==s.charAt(i-1)){
                    temp++;
                }
                else temp=1;
                ans=Math.max(ans,temp);
            }
            out.print(ans);
            out.close();
        }
        catch (Exception e) {
            return;
        }
    }
}
