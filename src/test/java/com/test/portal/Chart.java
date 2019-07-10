package com.test.portal;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.junit.Test;
import sun.awt.geom.AreaOp;

import static io.restassured.RestAssured.given;
import static org.codehaus.groovy.ast.tools.GeneralUtils.params;

public class Chart {
@Test
 public void test()
{
 String url="http://prebi.jd.com/api/bi/chartComp/pageQueryTableData";
 Response response= given().contentType("application/json").
                               param("chartUuid","20190220150637212138051843206134").
                               param("pageNo",1).
                               param("pageSize", 20).
                               param("filterConf", "[{\"dimMeasureId\":3489,\"dimMeasureUuid\":\"20190220150136181972402778388204\",\"dataSetUuid\":\"20190220114225181986656313264118\",\"dimOrMeasure\":1,\"fieldName\":\"url\",\"fieldAlias\":\"配置的url\",\"fieldType\":\"string\",\"fieldConf\":\"{\\\"dsTable\\\":\\\"qidian_page_business\\\",\\\"dsType\\\":\\\"3\\\",\\\"isUsed\\\":\\\"1\\\"}\",\"delFlag\":1,\"createdUser\":\"lishujuan\",\"createdTime\":\"2019-02-20 15:01:31\",\"modifiedUser\":null,\"modifiedTime\":\"2019-02-20 15:01:34\",\"fieldAsName\":\"t1_url\",\"filterLabel\":\"URL\",\"filterRule\":{\"granularity\":\"day\",\"componentType\":\"input\",\"matchMode\":\"like\",\"defValType\":\"dynamic\",\"dynamicDefVal\":\"today\",\"defVal\":[\"\"]}}]").
                               cookie("sso.jd.com","0fc2c728c5ce4cf5b03e4f5ac07d3749").log().all().
                               when().
                               post("http://prebi.jd.com/api/bi/chartComp/pageQueryTableData");
 response.prettyPrint();
}
}
