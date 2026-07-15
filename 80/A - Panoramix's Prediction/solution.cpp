#include <iostream>
using namespace std;
 
bool isPrime(int x) {
    for (int i = 2; i * i <= x; i++) {
        if (x % i == 0) return false;
    }
    return true;
}
 
int main() {
    int n, m;
    cin >> n >> m;
 
    for (int i = n + 1; ; i++) {
        if (isPrime(i)) {
            if (i == m) cout << "YES";
            else cout << "NO";
            break;
        }
    }
 
    return 0;
}