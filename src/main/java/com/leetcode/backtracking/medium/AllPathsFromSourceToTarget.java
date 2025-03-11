package com.leetcode.backtracking.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AllPathsFromSourceToTarget {
    /**
     * 797. All Paths From Source to Target
     * Medium
     * Topics
     * Companies
     * Given a directed acyclic graph (DAG) of n nodes labeled from 0 to n - 1, find all possible paths from node 0 to node n - 1 and return them in any order.
     * <p>
     * The graph is given as follows: graph[i] is a list of all nodes you can visit from node i (i.e., there is a directed edge from node i to node graph[i][j]).
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: graph = [[1,2],[3],[3],[]]
     * Output: [[0,1,3],[0,2,3]]
     * Explanation: There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.
     * Example 2:
     * <p>
     * <p>
     * Input: graph = [[4,3,1],[3,2,4],[3],[4],[]]
     * Output: [[0,4],[0,3,4],[0,1,3,4],[0,1,2,3,4],[0,1,4]]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * n == graph.length
     * 2 <= n <= 15
     * 0 <= graph[i][j] < n
     * graph[i][j] != i (i.e., there will be no self-loops).
     * All the elements of graph[i] are unique.
     * The input graph is guaranteed to be a DAG.
     */

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new LinkedList();
        List<Integer> current = new ArrayList();
        current.add(0);
        dfs(0,current,graph,graph.length-1,ans);
        return ans;
    }
    private static void dfs(int src, List<Integer> current, int graph[][], int dest, List<List<Integer>> ans){
        if(src == dest){
            ans.add(new ArrayList(current));
            return;
        }
        for(int n : graph[src]){
            current.add(n);
            dfs(n,current,graph,dest,ans);
            current.remove(current.size()-1);
        }
    }
}
