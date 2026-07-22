#include <bits/stdc++.h>
using namespace std;
 
int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
 
    int t;
    cin >> t;
 
    while (t--) {
        int n;
        cin >> n;
 
        map<int, int> mp;
        for (int i = 0; i < n; i++) {
            int x;
            cin >> x;
            mp[x]++;
        }
 
        if (mp.size() > 2) {
            cout << "No
";
        } 
        else if (mp.size() == 1) {
            cout << "Yes
";
        } 
        else {
            auto it = mp.begin();
            int f1 = it->second;
            ++it;
            int f2 = it->second;
 
            if (abs(f1 - f2) <= 1)
                cout << "Yes
";
            else
                cout << "No
";
        }
    }
 
    return 0;
}