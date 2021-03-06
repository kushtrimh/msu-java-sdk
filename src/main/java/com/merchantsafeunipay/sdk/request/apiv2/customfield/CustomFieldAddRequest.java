package com.merchantsafeunipay.sdk.request.apiv2.customfield;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.InputType;
import com.merchantsafeunipay.sdk.request.enumerated.Status;
import com.merchantsafeunipay.sdk.util.ResponseInfo;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.CustomFieldAddResponse;

@ResponseInfo(
        responseClass = CustomFieldAddResponse.class
)
public class CustomFieldAddRequest extends ApiRequest {
    private String integrationCode;

    private String name;

    private String header;

    private String definition;

    private Status status;

    private InputType type;

    private String availabilities;

    private String groups;

    private CustomFieldAddRequest() {
    }

    public static CustomFieldAddRequestBuilder builder() {
        return new CustomFieldAddRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.INTEGRATIONCODE, this.integrationCode);
        addToPayload(Param.NAME, this.name);
        addToPayload(Param.HEADER, this.header);
        addToPayload(Param.DEFINITION, this.definition);
        addToPayload(Param.STATUS, this.status);
        addToPayload(Param.TYPE, this.type);
        addToPayload(Param.AVAILABILITIES, this.availabilities);
        addToPayload(Param.GROUPS, this.groups);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.CUSTOMFIELDADD;
    }

    public static final class CustomFieldAddRequestBuilder {
        private String integrationCode;

        private String name;

        private String header;

        private String definition;

        private Status status;

        private InputType type;

        private String availabilities;

        private String groups;

        private Authentication authentication;

        public CustomFieldAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public CustomFieldAddRequestBuilder withIntegrationCode(String integrationCode) {
            this.integrationCode = integrationCode;
            return this;
        }

        public CustomFieldAddRequestBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public CustomFieldAddRequestBuilder withHeader(String header) {
            this.header = header;
            return this;
        }

        public CustomFieldAddRequestBuilder withDefinition(String definition) {
            this.definition = definition;
            return this;
        }

        public CustomFieldAddRequestBuilder withStatus(Status status) {
            this.status = status;
            return this;
        }

        public CustomFieldAddRequestBuilder withType(InputType type) {
            this.type = type;
            return this;
        }

        public CustomFieldAddRequestBuilder withAvailabilities(String availabilities) {
            this.availabilities = availabilities;
            return this;
        }

        public CustomFieldAddRequestBuilder withGroups(String groups) {
            this.groups = groups;
            return this;
        }

        public CustomFieldAddRequest build() {
            CustomFieldAddRequest request = new CustomFieldAddRequest();
            request.authentication = this.authentication;
            request.integrationCode = this.integrationCode;
            request.name = this.name;
            request.header = this.header;
            request.definition = this.definition;
            request.status = this.status;
            request.type = this.type;
            request.availabilities = this.availabilities;
            request.groups = this.groups;
            return request;
        }
    }
}
