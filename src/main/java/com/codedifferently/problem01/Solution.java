package com.codedifferently.problem01;



public class Solution {
    /**
     * You will be given an array of numbers, search the array and return the longest
     * set of consecutive numbers
     * example input - {1,3,2,10,6,5,7,8}
     * return the String "Longest Set: {5 6 7 8}"
     * Even though 1,2,3 would the first consecutive set 5,6,7,8 is longer
     * @param allNumbers
     * @return
     */
    public int findLongestConsecutiveSet(Integer[] allNumbers){
        int longestStreak= 0;
        for(Integer num : allNumbers){
            Integer currentNum = num;
            int currentStreak = 1;
            while (arrayContains(allNumbers, currentNum + 1)) {
                currentNum += 1;
                currentStreak += 1;
            }

            longestStreak = Math.max(longestStreak, currentStreak);
        }

        return longestStreak;
    }
        }
    }

