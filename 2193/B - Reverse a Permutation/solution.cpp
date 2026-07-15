#include <bits/stdc++.h>
using namespace std;
 
int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
 
    int t;
    cin >> t;
 
    while (t--) {
        int n;
        cin >> n;
 
        vector<int> p(n);
        vector<int> pos(n + 1);
 
        for (int i = 0; i < n; i++) {
            cin >> p[i];
            pos[p[i]] = i;   
        }
 
        for (int i = 0; i < n; i++) {
            int desired = n - i;   
            
            if (p[i] == desired) continue;
 
            int idx = pos[desired];
 
            if (idx > i) {
                reverse(p.begin() + i, p.begin() + idx + 1);
            }
            break;  
        }
 
        for (int x : p)
            cout << x << " ";
        cout << "
";
    }
 
    return 0;
}