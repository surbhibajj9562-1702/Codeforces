#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
 
int main() {
    int t;
    cin >> t;
 
    while (t--) {
        int n;
        cin >> n;
 
        vector<int> a(n);
        for (int i = 0; i < n; i++) {
            cin >> a[i];
        }
 
        sort(a.begin(), a.end());
 
        bool possible = true;
        for (int i = 0; i < n - 1; i++) {
            if (a[i + 1] - a[i] > 1) {
                possible = false;
                break;
            }
        }
 
        if (possible)
            cout << "YES
";
        else
            cout << "NO
";
    }
 
    return 0;
}