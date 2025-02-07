package BaekJoon.OneDayCoding.Bronze4.Day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex11945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0 ; i < n; i++){
            char[] b = br.readLine().toCharArray();
            for (int j = m - 1; j >= 0; j--) {
                System.out.print(b[j]);
            }
            System.out.println();
        }
    }
}
