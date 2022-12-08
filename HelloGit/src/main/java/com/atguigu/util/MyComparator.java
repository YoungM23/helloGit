package com.atguigu.util;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;

/**List<HashMap<String,String>> list, 根据hashmap中的某个键的值排序。时间降序
 * @author zqh
 * @date 2022-11-15 14:45
 */
public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        // TODO Auto-generated method stub
        int result = 0;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            HashMap<String, String> map1 = (HashMap<String, String>) o1, map2 = (HashMap<String, String>) o2;
            Date map1_time = format.parse(map1.get("sdate"));
            Date map2_time = format.parse(map2.get("sdate"));
            if(map1_time.after(map2_time)){
                result = -1;
            }else if(map1_time.before(map2_time)){
                result = 1;
            }else if(map1_time.equals(map2_time)){
                result = 0;
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return result;
    }
}
