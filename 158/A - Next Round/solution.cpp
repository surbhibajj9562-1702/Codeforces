#include <iostream>
using namespace std;
 
int main() {
    int n, k;
    cin >> n >> k;
 
    int x, threshold;
    for (int i = 1; i <= n; i++) {
        cin >> x;
        if (i == k) 
            threshold = x;   
        if (x > 0 && i <= k) 
            cout << ""; 
    }
 
    cin.clear(); cin.seekg(0);  
    cin >> n >> k;           
 
    int count = 0;
    for (int i = 1; i <= n; i++) {
        cin >> x;
        if (x >= threshold && x > 0)
            count++;
    }
 
    cout << count;
    return 0;
}