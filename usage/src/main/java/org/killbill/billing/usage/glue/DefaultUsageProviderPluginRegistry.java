/*
 * Copyright 2014-2019 Groupon, Inc
 * Copyright 2014-2019 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.billing.usage.glue;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.killbill.billing.osgi.api.OSGIServiceDescriptor;
import org.killbill.billing.osgi.api.OSGIServiceRegistration;
import org.killbill.billing.usage.plugin.api.UsagePluginApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultUsageProviderPluginRegistry implements OSGIServiceRegistration<UsagePluginApi> {

    private final static Logger log = LoggerFactory.getLogger(DefaultUsageProviderPluginRegistry.class);

    private final Map<String, UsagePluginApi> pluginsByName = new ConcurrentHashMap<String, UsagePluginApi>();

    @Override
    public void registerService(final OSGIServiceDescriptor desc, final UsagePluginApi service) {
        log.info("Registering service='{}'", desc.getRegistrationName());
        pluginsByName.put(desc.getRegistrationName(), service);
    }

    @Override
    public void unregisterService(final String serviceName) {
        log.info("Unregistering service='{}'", serviceName);
        pluginsByName.remove(serviceName);
    }

    @Override
    public UsagePluginApi getServiceForName(final String serviceName) {
        if (serviceName == null) {
            throw new IllegalArgumentException("Null usage plugin API name");
        }
        final UsagePluginApi plugin = pluginsByName.get(serviceName);
        return plugin;
    }

    @Override
    public Set<String> getAllServices() {
        return pluginsByName.keySet();
    }

    @Override
    public Class<UsagePluginApi> getServiceType() {
        return UsagePluginApi.class;
    }
}
