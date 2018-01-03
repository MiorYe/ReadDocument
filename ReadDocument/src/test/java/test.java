import services.Impl.ReadExcelImpl;

import java.lang.reflect.Method;

/**
 * @Title:
 * @Description:
 * @Author: Administrator
 * @Date: Created by in 下午 8:53 2017/11/27 0027
 * @Modify By:
 */
public class test {


    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("services.Impl.ReadExcelImpl");
            Method[] method =  clazz.getDeclaredMethods();
            ReadExcelImpl readExcel = new ReadExcelImpl();
            for (Method m : method){
                if("readXlsx".equals(m.getName())){
                     m.invoke(readExcel,"C:\\Users\\Administrator\\Desktop\\商品中心文档\\母婴产品类目表.xlsx");

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
