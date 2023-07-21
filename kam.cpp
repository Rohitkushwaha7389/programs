#include <algorithm>
#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>
#include <iostream>
#include <vector>

using namespace std;

vector<int> rankPeople(vector<int>& rankedWeights, vector<int>& unrankedWeights) {
    vector<int> ranks(unrankedWeights.size());
    vector<int> sortedWeights(rankedWeights);
    sortedWeights.insert(sortedWeights.end(), unrankedWeights.begin(), unrankedWeights.end());
    sort(sortedWeights.begin(), sortedWeights.end());

    for (int i = 0; i < unrankedWeights.size(); i++) {
        ranks[i] = i + 1;
        for (int j = 0; j < i; j++) {
            if (unrankedWeights[i] <= sortedWeights[j]) {
                ranks[i]--;
                break;
            }
        }
    }

    return ranks;
}

int main() {
    int N, P;
    cin >> N >> P;

    if (N < 1 || N > 1e5 || P < 1 || P > 1e5) {
        // cout << "Invalid input. N and P should be between 1 and 10^5 (inclusive)." << endl;
        return 0;
    }

    vector<int> rankedWeights(N);
    for (int i = 0; i < N; i++) {
        cin >> rankedWeights[i];
        if (rankedWeights[i] < 0 || rankedWeights[i] > 1e9) {
            // cout << "Invalid input. Weight values should be between 0 and 10^9 (inclusive)." << endl;
            return 0;
        }
    }

    vector<int> unrankedWeights(P);
    for (int i = 0; i < P; i++) {
        cin >> unrankedWeights[i];
        if (unrankedWeights[i] < 0 || unrankedWeights[i] > 1e9) {
            return 0;
        }
    }

    vector<int> ranks = rankPeople(rankedWeights, unrankedWeights);
    for (int rank : ranks) {
        cout << rank << endl;
    }

    return 0;
}
