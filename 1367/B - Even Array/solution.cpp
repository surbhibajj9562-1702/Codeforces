#include <iostream>
using namespace std;
 
int main() {
    int t;
    cin >> t;
    
    while (t--) {
        int n;
        cin >> n;
        
        int a[50];
        for (int i = 0; i < n; i++) {
            cin >> a[i];
        }
        
        int evenIndexOddValue = 0;
        int oddIndexEvenValue = 0;
        
        for (int i = 0; i < n; i++) {
            if (i % 2 != a[i] % 2) {
                if (i % 2 == 0)
                    evenIndexOddValue++;
                else
                    oddIndexEvenValue++;
            }
        }
        
        if (evenIndexOddValue == oddIndexEvenValue)
            cout << evenIndexOddValue << endl;
        else
            cout << -1 << endl;
    }
    
    return 0;
}