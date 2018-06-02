package code.pattern.template.three;


import code.pattern.template.three.dao.MemberDao;

/**
 * Created by Tom on 2018/3/11.
 */
public class MemberDaoTest {

    public static void main(String[] args) {

        MemberDao memberDao = new MemberDao(null);
        memberDao.query();

    }
}
