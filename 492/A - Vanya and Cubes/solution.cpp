#include <iostream>
using namespace std;
 
int main() {
    int n;
    cin >> n;
 
    int level = 0;
    int total = 0;
    int i = 1;
 
    while (true) {
        int needed = i * (i + 1) / 2;
        
        if (total + needed > n)
            break;
        
        total += needed;
        level++;
        i++;
    }
 
    cout << level << endl;
 
    return 0;
}