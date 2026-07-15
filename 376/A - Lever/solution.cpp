#include <iostream>
#include <string>
#include <cmath>
 
using namespace std;
 
int main() {
    string s;
    // Read the single string representing the lever
    if (cin >> s) {
        int pivot_index = -1;
        
        // 1. Find the exact position of the pivot '^'
        for (int i = 0; i < s.length(); i++) {
            if (s[i] == '^') {
                pivot_index = i;
                break;
            }
        }
 
        // 2. VERY IMPORTANT: Use long long to prevent integer overflow!
        // The maximum possible torque can easily exceed 2 billion.
        long long left_torque = 0;
        long long right_torque = 0;
 
        // 3. Loop through the string to calculate the forces
        for (int i = 0; i < s.length(); i++) {
            // If the character is a weight (between '1' and '9')
            if (s[i] >= '1' && s[i] <= '9') {
                
                // Convert the char to an actual number
                long long weight = s[i] - '0'; 
                
                // Calculate the absolute distance from the pivot
                long long distance = abs(i - pivot_index);
                
                // Add the torque (Force * Distance) to the correct side
                if (i < pivot_index) {
                    left_torque += (weight * distance);
                } else if (i > pivot_index) {
                    right_torque += (weight * distance);
                }
            }
        }
 
        // 4. The Decision Logic
        if (left_torque > right_torque) {
            cout << "left" << endl;
        } else if (right_torque > left_torque) {
            cout << "right" << endl;
        } else {
            cout << "balance" << endl;
        }
    }
 
    return 0;
}