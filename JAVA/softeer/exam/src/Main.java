import java.util.*;

public class Main {
    static class Path {
        char destination;
        int distance;

        public Path(char destination, int distance) {
            this.destination = destination;
            this.distance = distance;
        }
    }

    static Map<Character, List<Path>> graph = new HashMap<>();

    public static void addPath(char src, char dest, int distance) {
        graph.computeIfAbsent(src, k -> new ArrayList<>()).add(new Path(dest, distance));
        graph.computeIfAbsent(dest, k -> new ArrayList<>()).add(new Path(src, distance));
    }

    public static List<Character> findMaxProfitPath(int n, int initialFuel) {
        int maxProfit = Integer.MIN_VALUE;
        List<Character> result = new ArrayList<>();

        for (char destination = 'B'; destination <= (char) ('A' + n - 2); destination++) {
            List<Character> path = bfs('A', destination, n, initialFuel);

            int[] values = calculatePathValues(path, initialFuel);

            if (values[0] > maxProfit || (values[0] == maxProfit && values[1] > values[1])) {
                maxProfit = values[0];
                result = path;
            }
        }

        return result;
    }

    public static List<Character> bfs(char start, char end, int n, int initialFuel) {
        Queue<List<Character>> queue = new LinkedList<>();
        List<Character> initialPath = new ArrayList<>();
        initialPath.add(start);
        queue.add(initialPath);

        while (!queue.isEmpty()) {
            List<Character> currentPath = queue.poll();
            char current = currentPath.get(currentPath.size() -1);

            if (current == end) {
                return currentPath;
            }

            for (Path path : graph.getOrDefault(current, Collections.emptyList())) {
                char neighbor = path.destination;
                int distance = path.distance;

                if (!currentPath.contains(neighbor)) {
                    List<Character> newPath = new ArrayList<>(currentPath);
                    newPath.add(neighbor);
                    queue.add(newPath);
                }
            }
        }

        return Collections.emptyList();
    }

    public static int[] calculatePathValues(List<Character> path, int initialFuel) {
        int budget = 100;
        int fuel = initialFuel;

        for (int i=0; i < path.size() -1 ; i++) {
            char current = path.get(i);
            char next = path.get(i+1);

            for (Path pathInfo : graph.get(current)) {
                if (pathInfo.destination == next) {
                    int cost = pathInfo.distance * fuel;
                    if (next == path.get(path.size()-1)) {
                        budget += 300;
                    } else {
                        budget -= 100;
                    }

                    fuel -= cost;
                    break;
                }
            }
        }

        return new int[]{budget, fuel};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int pathCount = scanner.nextInt();

        for (int i = 0; i < pathCount; i++) {
            char src = scanner.next().charAt(0);
            char dest = scanner.next().charAt(0);
            int distance = scanner.nextInt();
            addPath(src, dest, distance);
        }

        List<Character> result = findMaxProfitPath(n, k);

        if (!result.isEmpty()) {
//            for (char node : result) {
//                System.out.print(node + " ");
//            }

            int [] values = calculatePathValues(result, k);
            System.out.println(values[0] + " " +values[1]);
        } else {
            System.out.println("-1");
        }

    }
}
