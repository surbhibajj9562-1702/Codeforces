#include <iostream>
using namespace std;
 
int main() {
    int t;
    cin >> t;
    
    while (t--) {
        string position;
        cin >> position;
        
        char column = position[0];
        char row = position[1];
        
        // Vertical moves (same column)
        for (char r = '1'; r <= '8'; r++) {
            if (r != row) {
                cout << column << r << endl;
            }
        }
        
        // Horizontal moves (same row)
        for (char c = 'a'; c <= 'h'; c++) {
            if (c != column) {
                cout << c << row << endl;
            }
        }
    }
    
    return 0;
}