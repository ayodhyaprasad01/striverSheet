import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class SafeStateInGraph {
    class UnionFind {
        int[] parent;

        UnionFind(int size) {
            parent = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
            }
        }

        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != rootY) {
                parent[rootY] = rootX;
            }
        }
    }

    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        UnionFind uf = new UnionFind(n);

        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> Integer.compare(nums[a], nums[b]));

        for (int i = 0; i < n - 1; i++) {
            if (Math.abs(nums[indices[i]] - nums[indices[i + 1]]) <= limit) {
                uf.union(indices[i], indices[i + 1]);
            }
        }

        HashMap<Integer, List<Integer>> groups = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int root = uf.find(i);
            groups.computeIfAbsent(root, k -> new ArrayList<>()).add(i);
        }

        int[] result = new int[n];
        for (List<Integer> indicesList : groups.values()) {
            List<Integer> values = new ArrayList<>();
            for (int index : indicesList) {
                values.add(nums[index]);
            }
            Collections.sort(values);
            Collections.sort(indicesList);
            for (int i = 0; i < indicesList.size(); i++) {
                result[indicesList.get(i)] = values.get(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SafeStateInGraph solution = new SafeStateInGraph();
        int[] nums1 = { 1, 5, 3, 9, 8 };
        int limit1 = 2;
        System.out.println(Arrays.toString(solution.lexicographicallySmallestArray(nums1, limit1))); // Output: [1, 3,
                                                                                                     // 5, 8, 9]

        int[] nums2 = { 1, 7, 6, 18, 2, 1 };
        int limit2 = 3;
        System.out.println(Arrays.toString(solution.lexicographicallySmallestArray(nums2, limit2))); // Output: [1, 6,
                                                                                                     // 7, 18, 1, 2]

        int[] nums3 = { 1, 7, 28, 19, 10 };
        int limit3 = 3;
        System.out.println(Arrays.toString(solution.lexicographicallySmallestArray(nums3, limit3))); // Output: [1, 7,
                                                                                                     // 28, 19, 10]
    }

}
