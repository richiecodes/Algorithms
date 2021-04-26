package hackerrank.ClimbingLeaderboard;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<Integer> climbingLeaderboard(List<Integer> initialBoard, List<Integer> playerScores) {
        // Write your code here

        List<Integer> results = new ArrayList<>();
        HashMap<Integer, Integer> playerRanks = new HashMap<>();

        int rank = 1;

        for(int i = 0; i < initialBoard.size(); i++) {
            if(!playerRanks.containsKey(initialBoard.get(i))) {
                playerRanks.put(initialBoard.get(i), rank++);
            }
        }

        int initialRank = initialBoard.size() - 1;

        for(int s : playerScores) {

            for(int i = initialRank; i >= 0; i--) {
                if(s >= initialBoard.get(i)) {
                    rank = playerRanks.get(initialBoard.get(i));
                    initialRank = i - 1;
                }
                else break;
            }

            results.add(rank);
        }

        return results;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.climbingLeaderboard(ranked, player);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
