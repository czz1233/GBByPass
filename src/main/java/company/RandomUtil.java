package company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 用字母和数字生成不重复的随机字符串
 *

 */
public class RandomUtil {
    /**
     * 字符源，可以剔除O、L、0和1，避免0和1与O和L混淆，这里没有剔除<br/>
     * 可以根据需要加入小写英文字母和特殊字符等
     */
    private static final String[] GENERATE_SOURCE = new String[]{"0", "1", "2", "3", "4", "5", "6", "7",
            "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
            "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z"};
    private static final int STR_LEN = GENERATE_SOURCE.length;

    /**
     * 使用 Collections.shuffle 生成六位随机字符串
     *
     * @return
     */
    private static String generateByShuffle() {
        List<String> list = Arrays.asList(GENERATE_SOURCE);
        //打乱元素排序，增加反推难度
        Collections.shuffle(list);
        StringBuilder randomStr = new StringBuilder();
        for (int i = 0; i < STR_LEN; i++) {
            randomStr.append(list.get(i));
        }
        //更改下面两个数字可以取到不同位数的随机数哦
        return randomStr.substring(4, 10);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(generateByRandom(6));
        }
        System.out.println(generateByShuffle() + "---" + STR_LEN);
    }

    /**
     * 生成数字和字母组合，字母区分大小写
     *
     * @param length 随机字符串的长度
     * @return
     */
    public static String generateByRandom(final int length) {
        StringBuilder randomSb = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            // 输出字母还是数字
            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
            // 字符串
            if ("char".equals(charOrNum)) {
                // 判断字母大小写
                int choice = random.nextInt(2) % 2 == 0 ? 65 : 97;
                randomSb = randomSb.append((char) (choice + random.nextInt(26)));
            } else {
                randomSb = randomSb.append(random.nextInt(10));
            }
        }
        return randomSb.toString();
    }
    /**
     * 生成随机字符串，generateByRandom的简化版
     * @param count 随机字符串的长度
     * @param source 源字符集
     * @return
     */
    public static String doGenerate(int count, String[] source) {
        StringBuilder sb = new StringBuilder(count);
        int sourceLen = source.length;
        for (int i = 0; i < count; i++) {
            final int index = new Random().nextInt(sourceLen);
            sb.append(source[index]);
        }
        return sb.toString();
    }
    /**
     * @param begin 自增长序列
     * @return
     */
    public static String generateByOrder(final int begin) {
        List<String> src = Arrays.asList(GENERATE_SOURCE);
        Collections.shuffle(src);
        StringBuilder randomSb = new StringBuilder(6);
        int i4 = (begin) % 36;
        int i3 = (begin / (36)) % 36;
        int i2 = (begin / (36 * 36)) % 36;
        int i1 = (begin / (36 * 36 * 36)) % 36;
        int i0 = (begin / (36 * 36 * 36 * 36)) % 36;
        int i  = (begin / (36 * 36 * 36 * 36 * 36)) % 36;
        randomSb = randomSb.append(src.get(i0)).append(src.get(i1))
                .append(src.get(i2)).append(src.get(i3))
                .append(src.get(i4)).append(src.get(i));
        return randomSb.toString();
    }

}

