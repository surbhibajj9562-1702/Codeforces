#include <bits/stdc++.h>
using namespace std;
 
int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
 
    int t;
    cin >> t;
 
    while (t--) {
        string s;
        cin >> s;
 
        int n = stoi(s);
        int r = (int)sqrt(n);
 
        if (r * r == n)
            cout << 0 << " " << r << "
";
        else
            cout << -1 << "
";
    }
 
    return 0;
}