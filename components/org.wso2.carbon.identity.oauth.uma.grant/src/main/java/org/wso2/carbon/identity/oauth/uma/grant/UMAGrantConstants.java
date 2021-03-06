/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.oauth.uma.grant;

/**
 * Constant class to build up UMA request.
 */
public class UMAGrantConstants {

    public static final String GRANT_PARAM = "grant_type";
    public static final String UMA_GRANT_TYPE = "urn:ietf:params:oauth:grant-type:uma-ticket";
    public static final String CLAIM_TOKEN = "claim_token";
    public static final String PERMISSION_TICKET = "ticket";
    public static final String ERROR_RESPONSE_HEADER = "error_response";
    public static final String RESPONSE_HEADERS = "RESPONSE_HEADERS";

}
