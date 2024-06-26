/*
 * Copyright (c) 2024, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.mgt.endpoint.util.client.model.recovery.v2;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Response to confirm recovery attempt.
 */
public class ConfirmResponse {

    private String resetCode;
    private List<APICall> links = null;


    /**
     * ResetCode for recovery.
     **/
    public ConfirmResponse resetCode(String resetCode) {

        this.resetCode = resetCode;
        return this;
    }

    @JsonProperty("resetCode")
    public String getResetCode() {

        return resetCode;
    }
    public void setResetCode(String resetCode) {

        this.resetCode = resetCode;
    }

    /**
     * Contains available API links for next recovery steps.
     **/
    public ConfirmResponse links(List<APICall> links) {

        this.links = links;
        return this;
    }

    @JsonProperty("links")
    public List<APICall> getLinks() {

        return links;
    }
    public void setLinks(List<APICall> links) {

        this.links = links;
    }

    /**
     * Add linksItem.
     *
     * @param linksItem linksItem.
     * @return ResendResponse.
     */
    public ConfirmResponse addLinksItem(APICall linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfirmResponse passwordRecoveryInternalNotifyResponse = (ConfirmResponse) o;
        return Objects.equals(this.resetCode, passwordRecoveryInternalNotifyResponse.resetCode) &&
                Objects.equals(this.links, passwordRecoveryInternalNotifyResponse.links);
    }

    @Override
    public int hashCode() {

        return Objects.hash(resetCode, links);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class RecoveryResponse {\n");
        sb.append("    resetCode: ").append(toIndentedString(resetCode)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
