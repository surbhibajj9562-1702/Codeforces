#include <iostream>
#include <algorithm>
using namespace std;
 
int main() {
    int n, k, l, c, d, p, nl, np;
    cin >> n >> k >> l >> c >> d >> p >> nl >> np;
 
    int drink = (k * l) / nl;
    int lime = c * d;
    int salt = p / np;
 
    int total_toasts = min({drink, lime, salt});
 
    cout << total_toasts / n;
    return 0;
}