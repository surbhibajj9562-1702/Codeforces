#include <iostream>
using namespace std;
 
int main() {
    int t;
    cin >> t;
    
    while(t--) {
        int n, a, b;
        cin >> n >> a >> b;
        int pair_cost = min(2 * a, b);
        int total_cost = (n / 2) * pair_cost + (n % 2) * a;
        cout << total_cost << endl;
    }
    
    return 0;
}