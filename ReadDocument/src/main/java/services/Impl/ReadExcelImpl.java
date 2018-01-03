package services.Impl;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import services.ReadExcel;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Title:
 * @Description:
 * @Author: Administrator
 * @Date: Created by in 下午 8:25 2017/11/27 0027
 * @Modify By:
 */
public class ReadExcelImpl implements ReadExcel{

    /**
     * @Author:
     * @Description: 读取.Xlsx文件
     * @Date: 2017/11/27 0027 下午 8:30
     * @Param: No such property: code for class: Script1
     */
    public List<List<String>> readXlsx(String path) throws Exception {
        InputStream inputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorBbook = new XSSFWorkbook(inputStream);
        List<List<String>> results = new ArrayList<List<String>>();
        //循环每一页并处理当前页
        for(XSSFSheet xssfsheet : xssfWorBbook){
            if(xssfsheet == null){
                continue;
            }
            //处理当前页，并循环每一行

//            String secondName = "";
            for(int rowNum = 1 ; rowNum <= xssfsheet.getLastRowNum() ; rowNum++){
                XSSFRow xssfRow =  xssfsheet.getRow(rowNum);
                int mixColIndex = xssfRow.getFirstCellNum();
                int maxColIndex = xssfRow.getLastCellNum();
//                String cellValue = "";
                List<String> rowList = new ArrayList<String>();
//                List<String> valueList = new ArrayList<String>();
                //循环每一列，获取每个单元格的数据
                for(int count = mixColIndex ; count < maxColIndex ; count++){
                   XSSFCell xssfCell = xssfRow.getCell(count);
                    String cell = xssfCell.toString();
                    if(cell == null || cell.equals("")){
                        cell =  results.get(count).get(count);
//                       continue;
                   }
                   if(cell.equals("一级类目")){
                       break;
                   }
                    rowList.add(xssfCell.toString());
//                    valueList.add(cell);
                }
                if(rowList.size() == 0){
                    continue;
                }
                results.add(rowList);
            }
            return  results;
        }


        return null;
    }

    /**
     * @Author:
     * @Description: 读取.Xls文件
     * @Date: 2017/11/27 0027 下午 8:31
     * @Param: No such property: code for class: Script1
     */
    public List<List<String>> readXls(String path) throws Exception {
        return null;
    }
}
