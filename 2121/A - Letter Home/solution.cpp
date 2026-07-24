#include <bits/stdc++.h>
using namespace std;
 
int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
 
    int t;
    cin >> t;
 
    while (t--) {
        int n, s;
        cin >> n >> s;
 
        vector<int> x(n);
        for (int i = 0; i < n; i++)
            cin >> x[i];
 
        int L = x[0];
        int R = x[n - 1];
 
        if (s <= L)
            cout << R - s << "
";
        else if (s >= R)
            cout << s - L << "
";
        else
            cout << (R - L) + min(s - L, R - s) << "
";
    }
 
    return 0;
}