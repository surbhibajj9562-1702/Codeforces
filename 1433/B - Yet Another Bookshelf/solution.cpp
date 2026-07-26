#include <iostream>
#include <vector>
 
using namespace std;
 
void solve() {
    int n;
    cin >> n;
    vector<int> a(n);
    int first_one = -1, last_one = -1;
    
    for (int i = 0; i < n; ++i) {
        cin >> a[i];
        if (a[i] == 1) {
            if (first_one == -1) {
                first_one = i; // Record leftmost 1
            }
            last_one = i;      // Continuously update rightmost 1
        }
    }
 
    // Count 0s between the first and last book
    int zeros_between = 0;
    for (int i = first_one; i <= last_one; ++i) {
        if (a[i] == 0) {
            zeros_between++;
        }
    }
 
    cout << zeros_between << "
";
}
 
int main() {
    // Optimize standard I/O operations for speed
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int t;
    cin >> t;
    while (t--) {
        solve();
    }
    return 0;
}