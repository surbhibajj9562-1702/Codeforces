#include <bits/stdc++.h>
using namespace std;
 
int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
 
    int t;
    cin >> t;
    while (t--) {
        long long a, b;
        cin >> a >> b;
        
        long long diff = abs(a - b);
        long long moves = (diff + 9) / 10; // ceil division
        
        cout << moves << "
";
    }
    return 0;
}