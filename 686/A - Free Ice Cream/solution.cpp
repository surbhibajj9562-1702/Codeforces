#include <iostream>
using namespace std;
 
int main() {
    int n;
    long long ice;
 
    cin >> n >> ice;
 
    int distress = 0;
 
    while (n--) {
        char op;
        long long d;
 
        cin >> op >> d;
 
        if (op == '+') {
            ice += d;
        } else {
            if (ice >= d) {
                ice -= d;
            } else {
                distress++;
            }
        }
    }
 
    cout << ice << " " << distress;
 
    return 0;
}