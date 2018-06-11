/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.runtime.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EntityWithResolution model.
 */
public class EntityWithResolution extends EntityModel {
    /**
     * Resolution values for pre-built LUIS entities.
     */
    @JsonProperty(value = "resolution", required = true)
    private Object resolution;

    /**
     * Get the resolution value.
     *
     * @return the resolution value
     */
    public Object resolution() {
        return this.resolution;
    }

    /**
     * Set the resolution value.
     *
     * @param resolution the resolution value to set
     * @return the EntityWithResolution object itself.
     */
    public EntityWithResolution withResolution(Object resolution) {
        this.resolution = resolution;
        return this;
    }

}