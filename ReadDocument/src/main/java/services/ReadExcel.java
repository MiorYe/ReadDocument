package services;

import java.util.List;

/**
 * @Title:
 * @Description:
 * @Author: Administrator
 * @Date: Created by in 下午 8:20 2017/11/27 0027
 * @Modify By:
 */
public interface ReadExcel {
     List<List<String>> readXlsx(String path) throws Exception;

     List<List<String>> readXls(String path) throws  Exception;
}
