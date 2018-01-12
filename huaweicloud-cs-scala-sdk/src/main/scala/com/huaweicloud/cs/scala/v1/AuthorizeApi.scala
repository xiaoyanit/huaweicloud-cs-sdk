/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package com.huaweicloud.cs.scala.v1

import com.huaweicloud.cs.scala.v1.model.GlobalErrorResponse
import com.huaweicloud.cs.scala.v1.model.GlobalResponse
import com.huaweicloud.cs.scala.v1.client._
import com.huaweicloud.cs.scala.v1.client.CollectionFormats._
import com.huaweicloud.cs.scala.v1.client.ApiKeyLocations._

object AuthorizeApi {

  /**
   * 
   * Expected answers:
   *   code 200 : GlobalResponse (授权成功)
   *   code 400 : GlobalErrorResponse (无效的输入参数)
   * 
   * @param xProjectId project id, 用于不同project取token.
   * @param body 授权一个或多个OBS bucket权限给Cloud Stream Service, 请求参数为json格式
   */
  def authorizeBucket(xProjectId: String, body: Seq[String]): ApiRequest[GlobalResponse] =
    ApiRequest[GlobalResponse](ApiMethods.POST, "https://cs.cn-north-1.myhuaweicloud.com/v1.0", "/{X-Project-Id}/obs_authorize", "application/json")
      .withBody(body)
      .withPathParam("X-Project-Id", xProjectId)
      .withSuccessResponse[GlobalResponse](200)
      .withErrorResponse[GlobalErrorResponse](400)
      

}
