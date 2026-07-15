#include <iostream>
using namespace std;
 
int main() {
    int n, x;
    cin >> n;
 
    bool hard = false;
 
    for(int i = 0; i < n; i++) {
        cin >> x;
        if(x == 1) {
            hard = true;
        }
    }
 
    if(hard)
        cout << "HARD";
    else
        cout << "EASY";
 
    return 0;
}