#include <iostream>
#include <string>
#include <vector>
#include <cmath>
#include <algorithm>
 
using namespace std;
 
void solve() {
    int n;
    cin >> n;
    string s;
    cin >> s;
 
   
    int c0 = 0, c1 = 0;
    for (char c : s) {
        if (c == '0') c0++;
        else c1++;
    }
 
    int cp0 = 0, cp1 = 0;
    for (int i = 0; i < n; i++) {
        if (i == 0 || s[i] != s[i - 1]) {
            if (s[i] == '0') cp0++;
            else cp1++;
        }
    }
 
    int delta_c = c0 - c1;
    
    
    if (abs(delta_c) > 2) {
        cout << -1 << "
";
        return;
    }
 
    int max_len = 0;
    
    
    for (int delta_k = -1; delta_k <= 1; delta_k++) {
        
     
        if (abs(delta_c - delta_k) <= 1) {
            
            
            if (delta_k == 1) { 
           
                int k1 = min(cp0 - 1, cp1);
                if (k1 >= 0) max_len = max(max_len, 2 * k1 + 1);
            } 
            else if (delta_k == -1) { 
           
                int k0 = min(cp0, cp1 - 1);
                if (k0 >= 0) max_len = max(max_len, 2 * k0 + 1);
            } 
            else { 
               
                int k = min(cp0, cp1);
                if (k >= 0) max_len = max(max_len, 2 * k);
            }
        }
    }
 
    if (max_len == 0) {
        cout << -1 << "
"; 
    } else {
        cout << n - max_len << "
";
    }
}
 
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin >> t;
    while (t--) {
        solve();
    }
    return 0;
}