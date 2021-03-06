/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2018_04_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The information for the container exec command.
 */
public class ContainerExecResponseInner {
    /**
     * The uri for the exec websocket.
     */
    @JsonProperty(value = "webSocketUri", access = JsonProperty.Access.WRITE_ONLY)
    private String webSocketUri;

    /**
     * The password to start the exec command.
     */
    @JsonProperty(value = "password", access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    /**
     * Get the uri for the exec websocket.
     *
     * @return the webSocketUri value
     */
    public String webSocketUri() {
        return this.webSocketUri;
    }

    /**
     * Get the password to start the exec command.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

}
