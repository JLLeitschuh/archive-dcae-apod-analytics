/*
 * ============LICENSE_START=========================================================
 * dcae-analytics
 * ================================================================================
 *  Copyright © 2017 AT&T Intellectual Property. All rights reserved.
 * ================================================================================
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * ============LICENSE_END=========================================================
 */

package org.openecomp.dcae.apod.analytics.tca.validator;

import org.openecomp.dcae.apod.analytics.common.cdap.validation.CDAPAppSettingsValidator;
import org.openecomp.dcae.apod.analytics.common.validation.GenericValidationResponse;
import org.openecomp.dcae.apod.analytics.tca.settings.TCAAppPreferences;

import static org.openecomp.dcae.apod.analytics.common.utils.ValidationUtils.isEmpty;

/**
 *
 * @author Rajiv Singla. Creation Date: 11/3/2016.
 */
public class TCAPreferencesValidator implements CDAPAppSettingsValidator<TCAAppPreferences,
        GenericValidationResponse<TCAAppPreferences>> {

    @Override
    public GenericValidationResponse<TCAAppPreferences> validateAppSettings(TCAAppPreferences appPreferences) {

        final GenericValidationResponse<TCAAppPreferences> validationResponse = new GenericValidationResponse<>();

        // subscriber validations
        final String subscriberHostName = appPreferences.getSubscriberHostName();
        if (isEmpty(subscriberHostName)) {
            validationResponse.addErrorMessage("subscriberHostName", "Subscriber host name must be present");
        }
        final String subscriberTopicName = appPreferences.getSubscriberTopicName();
        if (isEmpty(subscriberTopicName)) {
            validationResponse.addErrorMessage("subscriberTopicName", "Subscriber topic name must be present");
        }

        // publisher validations
        final String publisherHostName = appPreferences.getPublisherHostName();
        if (isEmpty(publisherHostName)) {
            validationResponse.addErrorMessage("publisherHostName", "Publisher host name must be present");
        }
        final String publisherTopicName = appPreferences.getPublisherTopicName();
        if (isEmpty(publisherTopicName)) {
            validationResponse.addErrorMessage("publisherTopicName", "Publisher topic name must be present");
        }

        return validationResponse;
    }
}
