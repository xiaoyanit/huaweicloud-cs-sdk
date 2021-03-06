/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huaweicloud.cs.java.v1.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateJobTemplateRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-10T14:17:13.719+08:00")
public class CreateJobTemplateRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("sql_body")
  private String sqlBody = null;

  public CreateJobTemplateRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 模板名称
   * @return name
  **/
  @ApiModelProperty(example = "simple stream sql", required = true, value = "模板名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateJobTemplateRequest desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * 模板描述
   * @return desc
  **/
  @ApiModelProperty(example = "快速上手示例", value = "模板描述")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public CreateJobTemplateRequest sqlBody(String sqlBody) {
    this.sqlBody = sqlBody;
    return this;
  }

   /**
   * Stream SQL语句, 至少包含source, query, sink三个部分
   * @return sqlBody
  **/
  @ApiModelProperty(example = "select * from source_table", value = "Stream SQL语句, 至少包含source, query, sink三个部分")
  public String getSqlBody() {
    return sqlBody;
  }

  public void setSqlBody(String sqlBody) {
    this.sqlBody = sqlBody;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateJobTemplateRequest createJobTemplateRequest = (CreateJobTemplateRequest) o;
    return Objects.equals(this.name, createJobTemplateRequest.name) &&
        Objects.equals(this.desc, createJobTemplateRequest.desc) &&
        Objects.equals(this.sqlBody, createJobTemplateRequest.sqlBody);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, desc, sqlBody);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateJobTemplateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    sqlBody: ").append(toIndentedString(sqlBody)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

