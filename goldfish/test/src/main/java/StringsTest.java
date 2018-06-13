import org.apache.commons.lang.StringUtils;

public class StringsTest {

    public static void main(String[] args) {

        String str = "abcdaefag";

        String substringBefore = StringUtils.substringBefore(str, "a");
        String substringAfter = StringUtils.substringAfter(str, "a");
        String beforeLast = StringUtils.substringBeforeLast(str, "a");
        System.out.println("before:"+substringBefore);
        System.out.println("after:"+substringAfter);
        System.out.println("beforeLast = [" + beforeLast + "]");

    }

}
