package BaekJun.CodePlus.lecture2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
/*count를 이용해서 풀 수도 있음 (>0일때 false)*/
public class ex_9012 {
    public static void main(String arg[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            Boolean isv=true;
            String str=br.readLine();
            Stack<Character> stack=new Stack<>();
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j)=='('){
                    stack.push(str.charAt(j));
                }else{
                    if(stack.isEmpty()){
                        isv=false;
                        break;
                    }else {
                        stack.pop();
                    }
                }
            }
         if(isv==true&&stack.isEmpty()){
             System.out.println("YES");
         }else{
             System.out.println("NO");
         }
        }
    }
}


