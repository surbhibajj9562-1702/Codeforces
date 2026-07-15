#include <iostream>
#include <algorithm>
using namespace std;
 
int main() {
    int t;
    cin >> t;
    
    while (t--) {
        int n;
        string s;
        cin >> n;
        cin >> s;
        
        if (n != 5) {
            cout << "NO
";
            continue;
        }
        
        sort(s.begin(), s.end());
        string name = "Timur";
        sort(name.begin(), name.end());
        
        if (s == name)
            cout << "YES
";
        else
            cout << "NO
";
    }
    
    return 0;
}