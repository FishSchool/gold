import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import org.apache.commons.lang.StringUtils;

public class StringsTest {

    public static void main(String[] args) {

        /*String str = "abcdaefag";

        String substringBefore = StringUtils.substringBefore(str, "a");
        String substringAfter = StringUtils.substringAfter(str, "a");
        String beforeLast = StringUtils.substringBeforeLast(str, "a");
        System.out.println("before:" + substringBefore);
        System.out.println("after:" + substringAfter);
        System.out.println("beforeLast = [" + beforeLast + "]");
        */



        OrgaCerFileRequest request = new OrgaCerFileRequest();
        request.setFid(123456);
        request.setOrgCerId(456789L);
        request.setPageNum(1);
        request.setPageSize(20);
        String json = JSONObject.toJSONString(request);
        System.out.println(json);

    }


    @Data
    static class OrgaCerFileRequest extends PageBean{
        private long fid;
        private Long orgCerId;

    }


    @Data
    static class PageBean {

        /**
         * 每页大小
         */
        private int pageSize;

        /**
         * 页码
         */
        private int pageNum;

        /**
         * 总数
         */
        private long total;

        private String sidx;

        private String sort;

    }


}
