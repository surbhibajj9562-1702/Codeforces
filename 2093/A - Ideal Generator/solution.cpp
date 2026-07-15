#include <iostream>
using namespace std;
 
int main() {
    int t;
    cin >> t;
    
    while (t--) {
        int k;
        cin >> k;
        
        if (k % 2 == 1)
            cout << "YES
";
        else
            cout << "NO
";
    }
    
    return 0;
}