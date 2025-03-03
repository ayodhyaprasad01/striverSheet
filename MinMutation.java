import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class MinMutation {
    public int minMutation(String startGene, String endGene, String[] bank) {

        Set<String> validGenes = new HashSet<>(Arrays.asList(bank));

        if (!validGenes.contains(endGene)) {
            return -1;
        }

        char[] mutations = { 'A', 'C', 'G', 'T' };

        Queue<String> queue = new LinkedList<>();
        queue.offer(endGene);

        int mutationC = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String currGene = queue.poll();
                if (currGene.equals(endGene)) {
                    return mutationC;
                }

                char[] geneChars = currGene.toCharArray();
                for (int j = 0; j < 8; j++) {
                    char originalChar = geneChars[j];
                    for (char c : mutations) {
                        if (c == originalChar) {
                            continue;
                        }
                        geneChars[j] = c;
                        String newGene = new String(geneChars);
                        if (validGenes.contains(newGene)) {
                            queue.offer(newGene);
                            validGenes.remove(newGene);
                        }
                    }

                    geneChars[j] = originalChar;
                }
            }
            mutationC++;
        }
        return -1;
    }

    public static void main(String[] args) {
        MinMutation minMutation = new MinMutation();
        System.out.println(minMutation.minMutation("AACCGGTT", "AACCGGTA", new String[] { "AACCGGTA" }));
    }
}