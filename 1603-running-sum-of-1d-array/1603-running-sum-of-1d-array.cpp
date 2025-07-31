class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        vector<int> sums{nums.at(0)};
        for (int i{1}; i < nums.size(); i++)
            sums.push_back(sums.at(i - 1) + nums.at(i));
        return sums;
    }
};