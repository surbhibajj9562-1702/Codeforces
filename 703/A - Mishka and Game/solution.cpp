#include <iostream>
using namespace std;
 
int main() {
    int n;
    cin >> n;
 
    int mish = 0, chris = 0;
 
    for (int i = 0; i < n; i++) {
        int m, c;
        cin >> m >> c;
 
        if (m > c) mish++;
        else if (m < c) chris++;
    }
 
    if (mish > chris)
        cout << "Mishka";
    else if (chris > mish)
        cout << "Chris";
    else
        cout << "Friendship is magic!^^";
 
    return 0;
}