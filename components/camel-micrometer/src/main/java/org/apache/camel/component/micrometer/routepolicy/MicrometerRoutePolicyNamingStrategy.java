/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.micrometer.routepolicy;

import java.util.function.Predicate;

import io.micrometer.core.instrument.Meter;
import io.micrometer.core.instrument.Tags;
import org.apache.camel.Route;

import static org.apache.camel.component.micrometer.MicrometerConstants.CAMEL_CONTEXT_TAG;
import static org.apache.camel.component.micrometer.MicrometerConstants.DEFAULT_CAMEL_ROUTE_POLICY_EXCHANGES_EXTERNAL_REDELIVERIES_METER_NAME;
import static org.apache.camel.component.micrometer.MicrometerConstants.DEFAULT_CAMEL_ROUTE_POLICY_EXCHANGES_FAILED_METER_NAME;
import static org.apache.camel.component.micrometer.MicrometerConstants.DEFAULT_CAMEL_ROUTE_POLICY_EXCHANGES_FAILURES_HANDLED_METER_NAME;
import static org.apache.camel.component.micrometer.MicrometerConstants.DEFAULT_CAMEL_ROUTE_POLICY_EXCHANGES_SUCCEEDED_METER_NAME;
import static org.apache.camel.component.micrometer.MicrometerConstants.DEFAULT_CAMEL_ROUTE_POLICY_EXCHANGES_TOTAL_METER_NAME;
import static org.apache.camel.component.micrometer.MicrometerConstants.DEFAULT_CAMEL_ROUTE_POLICY_METER_NAME;
import static org.apache.camel.component.micrometer.MicrometerConstants.ROUTE_DESCRIPTION_TAG;
import static org.apache.camel.component.micrometer.MicrometerConstants.ROUTE_ID_TAG;
import static org.apache.camel.component.micrometer.MicrometerConstants.SERVICE_NAME;

/**
 * Provides a strategy to derive a meter name and tags
 */
public interface MicrometerRoutePolicyNamingStrategy {

    Predicate<Meter.Id> ROUTE_POLICIES
            = id -> MicrometerRoutePolicyService.class.getSimpleName().equals(id.getTag(SERVICE_NAME));

    MicrometerRoutePolicyNamingStrategy DEFAULT = route -> DEFAULT_CAMEL_ROUTE_POLICY_METER_NAME;

    String getName(Route route);

    default String getExchangesSucceededName(Route route) {
        return DEFAULT_CAMEL_ROUTE_POLICY_EXCHANGES_SUCCEEDED_METER_NAME;
    }

    default String getExchangesFailedName(Route route) {
        return DEFAULT_CAMEL_ROUTE_POLICY_EXCHANGES_FAILED_METER_NAME;
    }

    default String getExchangesTotalName(Route route) {
        return DEFAULT_CAMEL_ROUTE_POLICY_EXCHANGES_TOTAL_METER_NAME;
    }

    default String getFailuresHandledName(Route route) {
        return DEFAULT_CAMEL_ROUTE_POLICY_EXCHANGES_FAILURES_HANDLED_METER_NAME;
    }

    default String getExternalRedeliveriesName(Route route) {
        return DEFAULT_CAMEL_ROUTE_POLICY_EXCHANGES_EXTERNAL_REDELIVERIES_METER_NAME;
    }

    default Tags getTags(Route route) {
        if (route.getRouteDescription() != null) {
            return Tags.of(
                    CAMEL_CONTEXT_TAG, route.getCamelContext().getName(),
                    SERVICE_NAME, MicrometerRoutePolicyService.class.getSimpleName(),
                    ROUTE_ID_TAG, route.getId(),
                    ROUTE_DESCRIPTION_TAG, route.getRouteDescription());
        } else {
            return Tags.of(
                    CAMEL_CONTEXT_TAG, route.getCamelContext().getName(),
                    SERVICE_NAME, MicrometerRoutePolicyService.class.getSimpleName(),
                    ROUTE_ID_TAG, route.getId());
        }
    }

    default Tags getExchangeStatusTags(Route route) {
        return Tags.of(
                CAMEL_CONTEXT_TAG, route.getCamelContext().getName(),
                SERVICE_NAME, MicrometerRoutePolicyService.class.getSimpleName(),
                ROUTE_ID_TAG, route.getId());
    }
}
