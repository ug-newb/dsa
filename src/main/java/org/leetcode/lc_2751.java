package org.leetcode;
import java.util.ArrayList;
import java.util.List;
/*---------------------------NOT SOLVED-----------------------------*/


/*
int []positions = {3,5,2,6};
        int[] healths = {10,10,15,12};
        String directions = "RLRL";
        lc_2751 obj = new lc_2751();
        List<Integer> list = new ArrayList<>();
        list = obj.survivedRobotsHealths(positions, healths, directions);
        for(int item: list) {
            System.out.print(item + " ");
        }
*/

public class lc_2751 {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        List<Integer> rem_healths = new ArrayList<>();

        // Populate rem_healths with initial healths
        for (int i = 0; i < healths.length; i++) {
            rem_healths.add(healths[i]);
        }

        // Convert directions string to char array
        char[] dir = directions.toCharArray();

        // List to store indices of robots that survived
        List<Integer> survivedIndices = new ArrayList<>();
        for (int i = 0; i < positions.length; i++) {
            survivedIndices.add(i);
        }

        // Iterate through possible collisions
        for (int i = 0; i < dir.length - 1; i++) {
            if ((dir[i] == 'R' && dir[i+1] == 'L') || (dir[i] == 'L' && dir[i+1] == 'R')) {
                // Collision detected between robot i and robot i+1

                if (rem_healths.get(i) == rem_healths.get(i + 1)) {
                    // Both robots have the same health, remove both
                    survivedIndices.remove(Integer.valueOf(i + 1));
                    survivedIndices.remove(Integer.valueOf(i));
                    i++; // Skip the next index since we removed the i+1 index
                } else if (rem_healths.get(i) < rem_healths.get(i + 1)) {
                    // Remove the robot with lesser health (index i)
                    survivedIndices.remove(Integer.valueOf(i));
                    int temp_health = rem_healths.get(Integer.valueOf(i));
                    temp_health = temp_health--;
                    rem_healths.add(i,temp_health);

                    i++; // Skip the next index since we removed the i index
                } else {
                    // Remove the robot with lesser health (index i+1)
                    survivedIndices.remove(Integer.valueOf(i + 1));
                    int temp_health = rem_healths.get(Integer.valueOf(i+1));
                    temp_health = temp_health--;
                    rem_healths.add(i+1,temp_health);
                    i++; // Skip the next index since we removed the i+1 index
                }
            }
        }

        // Prepare the result list based on surviving indices
        List<Integer> result = new ArrayList<>();
        for (int index : survivedIndices) {
            result.add(rem_healths.get(index));
        }

        return result;
    }
}
