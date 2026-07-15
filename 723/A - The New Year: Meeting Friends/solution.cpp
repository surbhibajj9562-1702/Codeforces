#include <iostream>
#include <algorithm>
using namespace std;
 
int main() {
    int x1, x2, x3;
    cin >> x1 >> x2 >> x3;
 
    int x[3] = {x1, x2, x3};
    sort(x, x + 3);
 
    int median = x[1];
 
    int distance = abs(x[0] - median) + abs(x[1] - median) + abs(x[2] - median);
 
    cout << distance;
    return 0;
}