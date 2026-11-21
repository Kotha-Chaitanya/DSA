/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int level = 0;

        while (!q.isEmpty()) {

            int size = q.size();
            ArrayList<TreeNode> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode curr = q.poll();

                list.add(curr);

                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }

            if (level % 2 == 1) {

                int left = 0;
                int right = list.size() - 1;

                while (left < right) {

                    int temp = list.get(left).val;

                    list.get(left).val = list.get(right).val;

                    list.get(right).val = temp;

                    left++;
                    right--;
                }
            }

            level++;
        }

        return root;
    }
}