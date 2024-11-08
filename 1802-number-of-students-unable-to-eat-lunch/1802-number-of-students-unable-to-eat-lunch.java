class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] preference = new int[2];

        for (int student : students) {
            preference[student]++;
        }

        for (int sandwich : sandwiches) {
            if (preference[sandwich] == 0) {
                break;
            }
            preference[sandwich]--;
        }

        return preference[0] + preference[1];
    }
}
