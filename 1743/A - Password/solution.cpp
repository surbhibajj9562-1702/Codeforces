#include <bits/stdc++.h>
using namespace std;
 
int main() {
    int t;
    cin >> t;
 
    while (t--) {
        int n;
        cin >> n;
 
        for (int i = 0; i < n; i++) {
            int x;
            cin >> x;
        }
 
        int k = 10 - n;
        int ans = (k * (k - 1) / 2) * 6;
 
        cout << ans << "
";
    }
 
    return 0;
}