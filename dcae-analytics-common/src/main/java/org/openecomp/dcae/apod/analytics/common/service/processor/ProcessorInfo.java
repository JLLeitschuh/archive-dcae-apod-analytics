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

package org.openecomp.dcae.apod.analytics.common.service.processor;

import java.io.Serializable;

/**
 * <p>
 *     Contains Information about a processor. For e.g. Processor name, processor description etc
 * </p>
 *
 * @author Rajiv Singla. Creation Date: 11/7/2016.
 */
public interface ProcessorInfo extends Serializable {

    /**
     * Returns a name which should uniquely identify a particular {@link MessageProcessor}
     *
     * @return processor name
     */
    String getProcessorName();


    /**
     * Returns description of a {@link MessageProcessor}
     *
     * @return processor description
     */
    String getProcessorDescription();

}
