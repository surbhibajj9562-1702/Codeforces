#include <iostream>
using namespace std;
 
int main() {
    int n;
    cin >> n;
 
    int free = 0, untreated = 0;
 
    for (int i = 0; i < n; i++) {
        int e;
        cin >> e;
 
        if (e > 0) {
            free += e;
        } else { // e == -1
            if (free > 0) {
                free--;
            } else {
                untreated++;
            }
        }
    }
 
    cout << untreated << endl;
    return 0;
}