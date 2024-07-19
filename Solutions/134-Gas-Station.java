/*
There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].
You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.
Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique
 */
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int gasTotal = 0;
        int costTotal = 0;

        for(int i = 0; i < n; i++) {
            gasTotal += gas[i];
            costTotal += cost[i];
        }

        if(costTotal > gasTotal) {
            return -1;
        }

        int gasTank = 0;
        int startingIndex = 0;

        for(int i = 0; i < n; i++) {
            gasTank += gas[i] - cost[i];
            if(gasTank < 0) {
                gasTank = 0;
                startingIndex = i+ 1;
            }
        }

        return startingIndex;
    }
}