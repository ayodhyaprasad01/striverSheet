import java.util.*;

public class CourseShedule {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        boolean[][] reach = new boolean[numCourses][numCourses];

        for (int[] prerequisite : prerequisites) {
            int courseA = prerequisite[0];
            int courseB = prerequisite[1];
            reach[courseA][courseB] = true;
        }

        for (int k = 0; k < numCourses; k++) {
            for (int i = 0; i < numCourses; i++) {
                for (int j = 0; j < numCourses; j++) {
                    reach[i][j] = reach[i][j] || (reach[i][k] && reach[k][j]);
                }
            }
        }

        List<Boolean> res = new ArrayList<>();
        for (int[] query : queries) {
            int courseU = query[0];
            int courseV = query[1];
            res.add(reach[courseU][courseV]);
        }

        return res;
    }

    public static void main(String[] args) {
        CourseShedule courseShedule = new CourseShedule();
        int numCourses = 2;
        int[][] prerequisites = { { 1, 0 } };
        int[][] queries = { { 0, 1 }, { 1, 0 } };
        List<Boolean> res = courseShedule.checkIfPrerequisite(numCourses, prerequisites, queries);
        System.out.println(res); // [true, false]

    }
}
