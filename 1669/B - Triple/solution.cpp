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
 
        vector<int> freq(n + 1, 0);
        int x;
        int answer = -1;
 
        for (int i = 0; i < n; i++) {
            cin >> x;
            freq[x]++;
 
            if (freq[x] == 3) {
                answer = x;
            }
        }
 
        cout << answer << "
";
    }
 
    return 0;
}