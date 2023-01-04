//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        long[] ret = new long[N-K+1];
        int index = 0;
        Queue<Long> queue = new LinkedList<>();
        for(int i = 0; i< K; i++){
            if(A[i] < 0){
                queue.add(A[i]);
            }
            
        }
        if(queue.size()!= 0)
            ret[index++] = queue.peek();
        else 
            ret[index++] = 0;
        
            
        // queueElts(queue);
        for(int i = K; i < N; i++){
            // System.out.println("Value of A[i-k]: " + A[i-K]);
            // System.out.println("Value of A[i]: " + A[i]);
            // System.out.println("Value of queue.size(): " + queue.size());
            // if(queue.size()!= 0){
            //     System.out.println("Value of queue.peek(): " + queue.peek());
            // }
            if(A[i-K] < 0){
                queue.poll();
            } 
            
            if(A[i] < 0){
                queue.add(A[i]);
            } 
            if(queue.size() == 0){
                ret[index++] = 0;
            }
            else 
                ret[index++] = queue.peek();
            // queueElts(queue);
        }
        return ret;
        
    }
    
    public void queueElts(Queue<Long> q){
        System.out.println("Queue's elements");
        for(long i:q){
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}