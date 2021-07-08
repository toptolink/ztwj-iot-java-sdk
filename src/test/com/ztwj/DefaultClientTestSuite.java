package com.ztwj;

import com.ztwj.flowpool.AddCardsToPoolRequestTest;
import com.ztwj.flowpool.QueryPoolFlowRequestTest;
import com.ztwj.flowpool.UpdateFlowDataByControlTypeRequestTest;
import com.ztwj.handle.*;
import com.ztwj.query.*;
import com.ztwj.requests.query.GetSingleCardNumberRequest;
import com.ztwj.requests.whitelist.AddWhitelistContactRequest;
import com.ztwj.requests.whitelist.DeleteWhitelistContactRequest;
import com.ztwj.shrepool.QueryFlowPoolInfoRequestTest;
import com.ztwj.shrepool.QuerySharedPoolListRequestTest;
import com.ztwj.whitelist.AddWhitelistContactRequestTest;
import com.ztwj.whitelist.DeleteWhitelistContactRequestTest;
import com.ztwj.whitelist.GetWhitelistContactRequestTest;
import com.ztwj.whitelist.GetWhitelistOperateRecordRequestTest;
import junit.framework.JUnit4TestAdapter;
import junit.framework.TestSuite;
import org.junit.Test;

/**
 * Description: ztwj-iot-java-sdk
 *
 * @author : fire
 * @date : 2019/5/24 10:53
 */
public class DefaultClientTestSuite {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite("Test for all api");

        /** flowpool */
        suite.addTest(new JUnit4TestAdapter(AddCardsToPoolRequestTest.class));
        suite.addTest(new JUnit4TestAdapter(QueryPoolFlowRequestTest.class));
        suite.addTest(new JUnit4TestAdapter(UpdateFlowDataByControlTypeRequestTest.class));

        /** handle */
        suite.addTest(new JUnit4TestAdapter(ActivePackageRequestTest.class));
        suite.addTest(new JUnit4TestAdapter(ChangeCardSwitchRequestTest.class));
        suite.addTest(new JUnit4TestAdapter(RechargeCardPwdRequestTest.class));
        suite.addTest(new JUnit4TestAdapter(RechargeCardPwdByIdRequestTest.class));
        suite.addTest(new JUnit4TestAdapter(RechargePackageRequestTest.class));
        suite.addTest(new JUnit4TestAdapter(RechargeVoicePackageRequestTest.class));
        suite.addTest(new JUnit4TestAdapter(SendSMSRequestTest.class));

        /** query */
        suite.addTest(new JUnit4TestAdapter(GetAllCardInfoRequestTest.class));
        suite.addTest(new JUnit4TestAdapter(GetBatchAllCardNumberRequestTest.class));
        suite.addTest(new JUnit4TestAdapter(GetCardAuthInfoRequestTest.class));
        suite.addTest(new JUnit4TestAdapter(GetCardDetailsRequestTest.class));
        suite.addTest(new JUnit4TestAdapter(GetCardFlowDataByPeriodRequestTest.class));
        suite.addTest(new JUnit4TestAdapter(GetCardInfoByImeiRequestTest.class));
        suite.addTest(new JUnit4TestAdapter(GetCardMemberDetailsExtRequestTest.class));
        suite.addTest(new JUnit4TestAdapter(GetCardMemberDetailsRequestTest.class));
        suite.addTest(new JUnit4TestAdapter(GetCardPwdListByUserRequestTest.class));
        suite.addTest(new JUnit4TestAdapter(GetPackageListByUserRequestTest.class));
        suite.addTest(new JUnit4TestAdapter(GetPackageListRequestTest.class));
        suite.addTest(new JUnit4TestAdapter(GetPackageRechargeListRequestTest.class));
        suite.addTest(new JUnit4TestAdapter(GetSMSDetailsRequestTest.class));
        suite.addTest(new JUnit4TestAdapter(GetSMSHistoryInfoRequestTest.class));
        suite.addTest(new JUnit4TestAdapter(GetSingleCardNumberRequestTest.class));


        /** sharepool */
        suite.addTest(new JUnit4TestAdapter(QueryFlowPoolInfoRequestTest.class));
        suite.addTest(new JUnit4TestAdapter(QuerySharedPoolListRequestTest.class));

        /** whitelist */
        suite.addTest(new JUnit4TestAdapter(AddWhitelistContactRequestTest.class));
        suite.addTest(new JUnit4TestAdapter(DeleteWhitelistContactRequestTest.class));
        suite.addTest(new JUnit4TestAdapter(GetWhitelistContactRequestTest.class));
        suite.addTest(new JUnit4TestAdapter(GetWhitelistOperateRecordRequestTest.class));
        return suite;
    }
}
