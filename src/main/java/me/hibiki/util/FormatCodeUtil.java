package me.hibiki.util;

/**
 * @author koukoukon
 * @date 2022/10/9 19:42
 */
public class FormatCodeUtil {

    public void formatCode(String string){
        String[] code = string.split("\n");
        for (int i=0;i<code.length;i++){
            if ("\n".equals(code[i])){
                code[i]="</br>";
            }else {
                code[i]="<p>"+code[i]+"</p>";
            }
            System.out.println(code[i]);
        }
    }
}
