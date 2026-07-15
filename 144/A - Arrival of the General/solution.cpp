#include <iostream>
using namespace std;
 
int main() {
    int n;
    cin >> n;
 
    int a[101];
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
 
    int maxVal = a[0], minVal = a[0];
 
    for (int i = 1; i < n; i++) {
        if (a[i] > maxVal)
            maxVal = a[i];
        if (a[i] < minVal)
            minVal = a[i];
    }
 
    int maxIndex = 0;
    for (int i = 0; i < n; i++) {
        if (a[i] == maxVal) {
            maxIndex = i;
            break;
        }
    }
 
    int minIndex = n - 1;
    for (int i = n - 1; i >= 0; i--) {
        if (a[i] == minVal) {
            minIndex = i;
            break;
        }
    }
 
    int swaps = maxIndex + (n - 1 - minIndex);
 
    if (maxIndex > minIndex)
        swaps--;
 
    cout << swaps << endl;
 
    return 0;
}