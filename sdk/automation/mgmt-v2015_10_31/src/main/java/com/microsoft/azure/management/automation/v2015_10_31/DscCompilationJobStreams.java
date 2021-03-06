/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import rx.Observable;
import java.util.UUID;
import com.microsoft.azure.management.automation.v2015_10_31.implementation.DscCompilationJobStreamsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing DscCompilationJobStreams.
 */
public interface DscCompilationJobStreams extends HasInner<DscCompilationJobStreamsInner> {
    /**
     * Retrieve all the job streams for the compilation Job.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param jobId The job id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<JobStreamListResult> listByJobAsync(String resourceGroupName, String automationAccountName, UUID jobId);

}
