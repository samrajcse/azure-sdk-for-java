/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_07_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.resources.v2019_07_01.implementation.DeploymentInner;
import com.microsoft.azure.management.resources.v2019_07_01.implementation.DeploymentsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Deployments.
 */
public interface Deployments extends SupportsCreating<DeploymentExtended.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<DeploymentExtended>, SupportsListingByResourceGroup<DeploymentExtended>, SupportsListing<DeploymentExtended>, HasInner<DeploymentsInner> {
    /**
     * Deletes a deployment from the deployment history.
     * A template deployment that is currently running cannot be deleted. Deleting a template deployment removes the associated deployment operations. This is an asynchronous operation that returns a status of 202 until the template deployment is successfully deleted. The Location response header contains the URI that is used to obtain the status of the process. While the process is running, a call to the URI in the Location header returns a status of 202. When the process finishes, the URI in the Location header returns a status of 204 on success. If the asynchronous request failed, the URI in the Location header returns an error-level status code.
     *
     * @param scope The scope of a deployment.
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAtScopeAsync(String scope, String deploymentName);

    /**
     * Checks whether the deployment exists.
     *
     * @param scope The scope of a deployment.
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Boolean> checkExistenceAtScopeAsync(String scope, String deploymentName);

    /**
     * Deploys resources at a given scope.
     * You can provide the template and parameters directly in the request or link to JSON files.
     *
     * @param scope The scope of a deployment.
     * @param deploymentName The name of the deployment.
     * @param parameters Additional parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExtended> createOrUpdateAtScopeAsync(String scope, String deploymentName, DeploymentInner parameters);

    /**
     * Gets a deployment.
     *
     * @param scope The scope of a deployment.
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExtended> getAtScopeAsync(String scope, String deploymentName);

    /**
     * Cancels a currently running template deployment.
     * You can cancel a deployment only if the provisioningState is Accepted or Running. After the deployment is canceled, the provisioningState is set to Canceled. Canceling a template deployment stops the currently running template deployment and leaves the resources partially deployed.
     *
     * @param scope The scope of a deployment.
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable cancelAtScopeAsync(String scope, String deploymentName);

    /**
     * Validates whether the specified template is syntactically correct and will be accepted by Azure Resource Manager..
     *
     * @param scope The scope of a deployment.
     * @param deploymentName The name of the deployment.
     * @param parameters Parameters to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentValidateResult> validateAtScopeAsync(String scope, String deploymentName, DeploymentInner parameters);

    /**
     * Exports the template used for specified deployment.
     *
     * @param scope The scope of a deployment.
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExportResult> exportTemplateAtScopeAsync(String scope, String deploymentName);

    /**
     * Deletes a deployment from the deployment history.
     * A template deployment that is currently running cannot be deleted. Deleting a template deployment removes the associated deployment operations. This is an asynchronous operation that returns a status of 202 until the template deployment is successfully deleted. The Location response header contains the URI that is used to obtain the status of the process. While the process is running, a call to the URI in the Location header returns a status of 202. When the process finishes, the URI in the Location header returns a status of 204 on success. If the asynchronous request failed, the URI in the Location header returns an error-level status code.
     *
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAtTenantScopeAsync(String deploymentName);

    /**
     * Checks whether the deployment exists.
     *
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Boolean> checkExistenceAtTenantScopeAsync(String deploymentName);

    /**
     * Deploys resources at tenant scope.
     * You can provide the template and parameters directly in the request or link to JSON files.
     *
     * @param deploymentName The name of the deployment.
     * @param parameters Additional parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExtended> createOrUpdateAtTenantScopeAsync(String deploymentName, DeploymentInner parameters);

    /**
     * Gets a deployment.
     *
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExtended> getAtTenantScopeAsync(String deploymentName);

    /**
     * Cancels a currently running template deployment.
     * You can cancel a deployment only if the provisioningState is Accepted or Running. After the deployment is canceled, the provisioningState is set to Canceled. Canceling a template deployment stops the currently running template deployment and leaves the resources partially deployed.
     *
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable cancelAtTenantScopeAsync(String deploymentName);

    /**
     * Validates whether the specified template is syntactically correct and will be accepted by Azure Resource Manager..
     *
     * @param deploymentName The name of the deployment.
     * @param parameters Parameters to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentValidateResult> validateAtTenantScopeAsync(String deploymentName, DeploymentInner parameters);

    /**
     * Exports the template used for specified deployment.
     *
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExportResult> exportTemplateAtTenantScopeAsync(String deploymentName);

    /**
     * Deletes a deployment from the deployment history.
     * A template deployment that is currently running cannot be deleted. Deleting a template deployment removes the associated deployment operations. This is an asynchronous operation that returns a status of 202 until the template deployment is successfully deleted. The Location response header contains the URI that is used to obtain the status of the process. While the process is running, a call to the URI in the Location header returns a status of 202. When the process finishes, the URI in the Location header returns a status of 204 on success. If the asynchronous request failed, the URI in the Location header returns an error-level status code.
     *
     * @param groupId The management group ID.
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAtManagementGroupScopeAsync(String groupId, String deploymentName);

    /**
     * Checks whether the deployment exists.
     *
     * @param groupId The management group ID.
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Boolean> checkExistenceAtManagementGroupScopeAsync(String groupId, String deploymentName);

    /**
     * Deploys resources at management group scope.
     * You can provide the template and parameters directly in the request or link to JSON files.
     *
     * @param groupId The management group ID.
     * @param deploymentName The name of the deployment.
     * @param parameters Additional parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExtended> createOrUpdateAtManagementGroupScopeAsync(String groupId, String deploymentName, DeploymentInner parameters);

    /**
     * Gets a deployment.
     *
     * @param groupId The management group ID.
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExtended> getAtManagementGroupScopeAsync(String groupId, String deploymentName);

    /**
     * Cancels a currently running template deployment.
     * You can cancel a deployment only if the provisioningState is Accepted or Running. After the deployment is canceled, the provisioningState is set to Canceled. Canceling a template deployment stops the currently running template deployment and leaves the resources partially deployed.
     *
     * @param groupId The management group ID.
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable cancelAtManagementGroupScopeAsync(String groupId, String deploymentName);

    /**
     * Validates whether the specified template is syntactically correct and will be accepted by Azure Resource Manager..
     *
     * @param groupId The management group ID.
     * @param deploymentName The name of the deployment.
     * @param parameters Parameters to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentValidateResult> validateAtManagementGroupScopeAsync(String groupId, String deploymentName, DeploymentInner parameters);

    /**
     * Exports the template used for specified deployment.
     *
     * @param groupId The management group ID.
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExportResult> exportTemplateAtManagementGroupScopeAsync(String groupId, String deploymentName);

    /**
     * Get all the deployments for a management group.
     *
     * @param groupId The management group ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExtended> listAtManagementGroupScopeAsync(final String groupId);

    /**
     * Deletes a deployment from the deployment history.
     * A template deployment that is currently running cannot be deleted. Deleting a template deployment removes the associated deployment operations. This is an asynchronous operation that returns a status of 202 until the template deployment is successfully deleted. The Location response header contains the URI that is used to obtain the status of the process. While the process is running, a call to the URI in the Location header returns a status of 202. When the process finishes, the URI in the Location header returns a status of 204 on success. If the asynchronous request failed, the URI in the Location header returns an error-level status code.
     *
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAtSubscriptionScopeAsync(String deploymentName);

    /**
     * Checks whether the deployment exists.
     *
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Boolean> checkExistenceAtSubscriptionScopeAsync(String deploymentName);

    /**
     * Deploys resources at subscription scope.
     * You can provide the template and parameters directly in the request or link to JSON files.
     *
     * @param deploymentName The name of the deployment.
     * @param parameters Additional parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExtended> createOrUpdateAtSubscriptionScopeAsync(String deploymentName, DeploymentInner parameters);

    /**
     * Gets a deployment.
     *
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExtended> getAtSubscriptionScopeAsync(String deploymentName);

    /**
     * Cancels a currently running template deployment.
     * You can cancel a deployment only if the provisioningState is Accepted or Running. After the deployment is canceled, the provisioningState is set to Canceled. Canceling a template deployment stops the currently running template deployment and leaves the resources partially deployed.
     *
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable cancelAtSubscriptionScopeAsync(String deploymentName);

    /**
     * Validates whether the specified template is syntactically correct and will be accepted by Azure Resource Manager..
     *
     * @param deploymentName The name of the deployment.
     * @param parameters Parameters to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentValidateResult> validateAtSubscriptionScopeAsync(String deploymentName, DeploymentInner parameters);

    /**
     * Returns changes that will be made by the deployment if executed at the scope of the subscription.
     *
     * @param deploymentName The name of the deployment.
     * @param parameters Parameters to What If.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WhatIfOperationResult> whatIfAtSubscriptionScopeAsync(String deploymentName, DeploymentWhatIf parameters);

    /**
     * Exports the template used for specified deployment.
     *
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExportResult> exportTemplateAtSubscriptionScopeAsync(String deploymentName);

    /**
     * Checks whether the deployment exists.
     *
     * @param resourceGroupName The name of the resource group with the deployment to check. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Boolean> checkExistenceAsync(String resourceGroupName, String deploymentName);

    /**
     * Cancels a currently running template deployment.
     * You can cancel a deployment only if the provisioningState is Accepted or Running. After the deployment is canceled, the provisioningState is set to Canceled. Canceling a template deployment stops the currently running template deployment and leaves the resource group partially deployed.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable cancelAsync(String resourceGroupName, String deploymentName);

    /**
     * Validates whether the specified template is syntactically correct and will be accepted by Azure Resource Manager..
     *
     * @param resourceGroupName The name of the resource group the template will be deployed to. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param parameters Parameters to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentValidateResult> validateAsync(String resourceGroupName, String deploymentName, DeploymentInner parameters);

    /**
     * Returns changes that will be made by the deployment if executed at the scope of the resource group.
     *
     * @param resourceGroupName The name of the resource group the template will be deployed to. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param parameters Parameters to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WhatIfOperationResult> whatIfAsync(String resourceGroupName, String deploymentName, DeploymentWhatIf parameters);

    /**
     * Exports the template used for specified deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExportResult> exportTemplateAsync(String resourceGroupName, String deploymentName);

    /**
     * Get all the deployments at the given scope.
     *
     * @param scope The scope of a deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExtended> listAtScopeAsync(final String scope);

    /**
     * Get all the deployments at the tenant scope.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeploymentExtended> listAtTenantScopeAsync();

    /**
     * Calculate the hash of the given template.
     *
     * @param template The template provided to calculate hash.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TemplateHashResult> calculateTemplateHashAsync(Object template);

}
