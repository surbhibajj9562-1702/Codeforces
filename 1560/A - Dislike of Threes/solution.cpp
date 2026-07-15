#include <bits/stdc++.h>
using namespace std;
 
int main() {
    int t;
    cin >> t;
 
    while (t--) {
        int k;
        cin >> k;
 
        int count = 0;
        int num = 1;
 
        while (true) {
            if (num % 3 != 0 && num % 10 != 3) {
                count++;
                if (count == k) {
                    cout << num << "
";
                    break;
                }
            }
            num++;
        }
    }
 
    return 0;
}