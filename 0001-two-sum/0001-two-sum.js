/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let lookup={}
    for(let i=0;i<nums.length;i++){
        if(target-nums[i] in lookup){
            return [lookup[target-nums[i]],i];
        }
        lookup[nums[i]]=i;
    }
    return [];
};