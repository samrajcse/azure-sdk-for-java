// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Defines headers for ListContainersSegment operation.
 */
@JacksonXmlRootElement(localName = "Service-ListContainersSegment-Headers")
public final class ServiceListContainersSegmentHeaders {
    /**
     * This header uniquely identifies the request that was made and can be
     * used for troubleshooting the request.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /**
     * Indicates the version of the Blob service used to execute the request.
     * This header is returned for requests made against version 2009-09-19 and
     * above.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /**
     * Get the requestId value.
     *
     * @return the requestId value.
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set the requestId value.
     *
     * @param requestId the requestId value to set.
     * @return the ServiceListContainersSegmentHeaders object itself.
     */
    public ServiceListContainersSegmentHeaders withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version value.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set.
     * @return the ServiceListContainersSegmentHeaders object itself.
     */
    public ServiceListContainersSegmentHeaders withVersion(String version) {
        this.version = version;
        return this;
    }
}
