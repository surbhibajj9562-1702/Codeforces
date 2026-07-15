#include <iostream>
#include <algorithm>
using namespace std;
 
int main() {
    string a, b, c;
    cin >> a >> b >> c;
 
    string ab = a + b;
 
    sort(ab.begin(), ab.end());
    sort(c.begin(), c.end());
 
    if (ab == c)
        cout << "YES";
    else
        cout << "NO";
 
    return 0;
}