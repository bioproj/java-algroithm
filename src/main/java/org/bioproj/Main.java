package org.bioproj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
//        TreeNode root = ListToTreeNode.convertToTree(list);
        TreeNode root = ListToTreeNode.fillTree(list);

        System.out.println(root);

    }

}
