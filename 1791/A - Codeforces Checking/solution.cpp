#include <bits/stdc++.h>
using namespace std;
 
int main() {
    int t;
    cin >> t;
 
    string s = "codeforces";
 
    while (t--) {
        char c;
        cin >> c;
 
        if (s.find(c) != string::npos)
            cout << "YES
";
        else
            cout << "NO
";
    }
 
    return 0;
}