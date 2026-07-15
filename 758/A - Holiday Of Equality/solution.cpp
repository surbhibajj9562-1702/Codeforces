#include <bits/stdc++.h>
using namespace std;
 
int main() {
    int n;
    cin >> n;
 
    vector<long long> a(n);
 
    for (int i = 0; i < n; i++)
        cin >> a[i];
 
    long long mx = *max_element(a.begin(), a.end());
    long long sum = 0;
 
    for (int i = 0; i < n; i++)
        sum += mx - a[i];
 
    cout << sum << endl;
 
    return 0;
}