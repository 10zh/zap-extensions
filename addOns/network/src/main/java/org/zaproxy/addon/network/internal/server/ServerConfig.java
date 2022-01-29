/*
 * Zed Attack Proxy (ZAP) and its related class files.
 *
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 *
 * Copyright 2022 The ZAP Development Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.zaproxy.addon.network.internal.server;

import java.util.Set;

/** The configuration of a server. */
public interface ServerConfig {

    /**
     * Tells whether or not the server is bound to any local address.
     *
     * @return {@code true} if the server is bound to any local address, {@code false} otherwise.
     */
    boolean isAnyLocalAddress();

    /**
     * Tells whether or not the server is behind NAT.
     *
     * <p>When behind NAT the server will attempt to discover its public address, to correctly serve
     * requests to itself.
     *
     * @return {@code true} if the server is behind NAT, {@code false} otherwise.
     */
    boolean isBehindNat();

    /**
     * Gets the aliases of the server.
     *
     * <p>Allows to identify the server with different addresses/domains to serve those requests
     * itself. For example, the {@code zap} domain.
     *
     * @return the aliases, never {@code null}.
     */
    Set<String> getAliases();
}
