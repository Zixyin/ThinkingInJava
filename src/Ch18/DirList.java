package Ch18;

import java.io.File;
import java.io.IOException;

public class DirList {
	public static void main(String[] args) throws IOException {
	    //没有参数
        File fileCreateByNo=new File("");
        System.out.println("fileCreateByNo=="+fileCreateByNo);
        System.out.println("fileCreateByNo=="+fileCreateByNo.getCanonicalPath());
        System.out.println("-----------------------------");
        //一个点的参数
        File fileCreateByPoint=new File(".");
        System.out.println("fileCreateByPoint=="+fileCreateByPoint);
        System.out.println("fileCreateByPoint=="+fileCreateByPoint.getCanonicalPath());
        System.out.println("-----------------------------");
        //两个点的参数
        File fileTwoPoint = new File("..");  
        System.out.println("fileTwoPoint=="+fileTwoPoint);
        System.out.println("fileTwoPoint=="+fileTwoPoint.getCanonicalPath());
        System.out.println("-----------------------------");
        //一个点两条斜线的参数
        File filePLL = new File(".\\");  
        System.out.println("filePLL=="+filePLL);
        System.out.println("filePLL=="+filePLL.getCanonicalPath());
        System.out.println("-----------------------------");
        //当前工作目录
        String currentWorkPath=System.getProperty("user.dir");
        System.out.println("currentWorkPath=="+currentWorkPath);
	}
}
