#include <iostream>
using namespace std;
 
int main() {
    int t;
    cin >> t;
    
    while(t--) {
        long long a, b, c;
        cin >> a >> b >> c;
        
        long long A = 0, B = 0, C = 0;
        
        long long maxBC = max(b, c);
        if(a <= maxBC)
            A = maxBC - a + 1;
        
        long long maxAC = max(a, c);
        if(b <= maxAC)
            B = maxAC - b + 1;
        
        long long maxAB = max(a, b);
        if(c <= maxAB)
            C = maxAB - c + 1;
        
        cout << A << " " << B << " " << C << endl;
    }
    
    return 0;
}