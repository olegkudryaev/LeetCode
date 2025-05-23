package com.leetcode.tree.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindCorrespondingNodeOfBinaryTreeInCloneOfThatTreeTest {

    @Test
    void test() {
        FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree.TreeNode treeNode1 = new FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree.TreeNode(7);
        FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree.TreeNode treeNode2 = new FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree.TreeNode(4);
        FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree.TreeNode treeNode4 = new FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree.TreeNode(6);
        FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree.TreeNode treeNode5 = new FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree.TreeNode(19);
        FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree.TreeNode treeNode3 = new FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree.TreeNode(3);
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree.TreeNode cloneTreeNode1 = new FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree.TreeNode(7);
        FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree.TreeNode cloneTreeNode2 = new FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree.TreeNode(4);
        FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree.TreeNode cloneTreeNode4 = new FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree.TreeNode(6);
        FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree.TreeNode cloneTreeNode5 = new FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree.TreeNode(19);
        FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree.TreeNode cloneTreeNode3 = new FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree.TreeNode(3);
        cloneTreeNode3.left = cloneTreeNode4;
        cloneTreeNode3.right = cloneTreeNode5;
        cloneTreeNode1.left = cloneTreeNode2;
        cloneTreeNode1.right = cloneTreeNode3;

        FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree.TreeNode targetCopy =
                FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree.getTargetCopy(treeNode1, cloneTreeNode1, treeNode3);

        Assertions.assertEquals(cloneTreeNode3, targetCopy);


    }

}
