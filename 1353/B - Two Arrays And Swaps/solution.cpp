#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
 
int main() {
    int t;
    cin >> t;
 
    while (t--) {
        int n, k;
        cin >> n >> k;
 
        vector<int> a(n), b(n);
 
        for (int i = 0; i < n; i++) {
            cin >> a[i];
        }
 
        for (int i = 0; i < n; i++) {
            cin >> b[i];
        }
 
        sort(a.begin(), a.end());
        sort(b.begin(), b.end(), greater<int>());
 
        for (int i = 0; i < min(n, k); i++) {
            if (a[i] < b[i]) {
                swap(a[i], b[i]);
            } else {
                break;
            }
        }
 
        int sum = 0;
        for (int x : a) {
            sum += x;
        }
 
        cout << sum << '
';
    }
 
    return 0;
}