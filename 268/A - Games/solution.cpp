#include <iostream>
using namespace std;
 
int main() {
    int n;
    cin >> n;
 
    int home[30], guest[30];
    int freq[101] = {0};  
 
    for (int i = 0; i < n; i++) {
        cin >> home[i] >> guest[i];
        freq[guest[i]]++;   
    }
 
    int count = 0;
    for (int i = 0; i < n; i++) {
        count += freq[home[i]];
    }
 
    cout << count << endl;
    return 0;
}