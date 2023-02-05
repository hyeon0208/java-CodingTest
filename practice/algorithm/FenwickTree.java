package algorithm;

import java.util.*;
import java.io.*;

public class FenwickTree {

    static long[] arr;
    static Ftree ft;
    private static class Ftree {
        long[] FtreeArr;

        Ftree(int length){
            FtreeArr = new long[length];
        }

        void update(int idx, long num) {
            while(idx<FtreeArr.length) {
                FtreeArr[idx]+=num;
                idx+=(idx & -idx);
            }
        }
        long sum(int idx) {
            long sum = 0;
            while(idx>0) {
                sum+=FtreeArr[idx];
                idx-=(idx & -idx);
            }
            return sum;
        }
    }

    public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = stoi(st.nextToken());
        int M = stoi(st.nextToken());
        int K = stoi(st.nextToken());

        arr = new long[N+1];
        ft = new Ftree(N+1);

        for(int i=1; i<=N; i++) {
            arr[i] = stol(br.readLine());
            ft.update(i, arr[i]);
        }

        for(int i=1; i<=M+K; i++) {
            st = new StringTokenizer(br.readLine());
            if(stoi(st.nextToken())==1) {
                int idx = stoi(st.nextToken());
                long updateInput = stol(st.nextToken());
                ft.update(idx, updateInput-arr[idx]);
                arr[idx] = updateInput;
            }else {
                int left = stoi(st.nextToken());
                int right = stoi(st.nextToken());
                sb.append(ft.sum(right)-ft.sum(left-1)+"\n");

            }
        }

        System.out.println(sb.toString());

    }

    private static int stoi(String str) {
        return Integer.parseInt(str);
    }
    private static long stol(String str) {
        return Long.parseLong(str);
    }
}