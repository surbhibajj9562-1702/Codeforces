#include <iostream>
#include <algorithm>
#include <string>
 
using namespace std;
 
int main() {
    int Y, W;
    cin >> Y >> W;
 
    int max_val = max(Y, W);
    int num = 6 - max_val + 1;
    int den = 6;
 
    if (num == 0) cout << "0/1" << endl;
    else if (num == 1) cout << "1/6" << endl;
    else if (num == 2) cout << "1/3" << endl;
    else if (num == 3) cout << "1/2" << endl;
    else if (num == 4) cout << "2/3" << endl;
    else if (num == 5) cout << "5/6" << endl;
    else if (num == 6) cout << "1/1" << endl;
 
    return 0;
}