#include <iostream>
using namespace std;
 
int main() {
    string n;
    cin >> n;
 
    int countLucky = 0;
 
    for (int i = 0; i < n.length(); i++) {
        if (n[i] == '4' || n[i] == '7') {
            countLucky++;
        }
    }
 
    
    if (countLucky == 0) {
        cout << "NO";
        return 0;
    }
 
    while (countLucky > 0) {
        int digit = countLucky % 10;
        if (digit != 4 && digit != 7) {
            cout << "NO";
            return 0;
        }
        countLucky /= 10;
    }
 
    cout << "YES";
    return 0;
}