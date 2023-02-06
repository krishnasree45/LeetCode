//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
  public:
    int findPosition(int N) {
        // code here
        int pos = 0; 
        if( N == 0)
            return -1;
        while(N != 0){
            int andVal = N & 1;
            N = N >> 1;
            pos++;
            if(andVal == 1 && N != 0){
                pos = -1;
                break;
            } else if( andVal == 1)
                break;
        }
        return pos;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;

        cin>>N;

        Solution ob;
        cout << ob.findPosition(N) << endl;
    }
    return 0;
}
// } Driver Code Ends