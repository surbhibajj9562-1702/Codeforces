#include <bits/stdc++.h>
using namespace std;
 
int main() {
    int x[4];
    for (int i = 0; i < 4; i++) {
        cin >> x[i];
    }
 
    sort(x, x + 4);
 
    int sum = x[3];
    int a = sum - x[2];
    int b = sum - x[1];
    int c = sum - x[0];
 
    cout << a << " " << b << " " << c;
    return 0;
}