package com.atguigu.sort;

import com.atguigu.bo.Department;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author zqh
 * @date 2023-11-15 9:53
 */
public class SortTest {
    public static void main(String[] args) {
        Department dept1 = new Department("一级", "1");
        Department dept2 = new Department("二级", "11");
        Department dept3 = new Department("三级", "111");
        ArrayList<Department> deptList = new ArrayList<>();
        deptList.add(dept2);
        deptList.add(new Department("四级","1111"));
        deptList.add(dept3);
        deptList.add(new Department("五级","11111"));
        deptList.add(dept1);
        deptList.add(new Department("六级","111111"));
        deptList.sort(new Comparator<Department>() {
            @Override
            public int compare(Department o1, Department o2) {
                int o1Path = o1.getPath().length();
                int o2Path = o2.getPath().length();
                return o1Path < o2Path ? -1 : o1Path ==o2Path ? 0 :1;
            }
        });

        System.out.println(deptList.toString());
    }
}
